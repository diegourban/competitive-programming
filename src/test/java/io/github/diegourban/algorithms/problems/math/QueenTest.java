package io.github.diegourban.algorithms.problems.math;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.diegourban.algorithms.io.Reader;
import io.github.diegourban.algorithms.testing.SampleLoader;
import java.io.IOException;
import java.io.InputStream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * Queen — beecrowd (formerly URI Online Judge) 1087.
 * <p>
 * https://judge.beecrowd.com/en/problems/view/1087
 * <p>
 * A queen needs 0 moves if already there, 1 if the target shares a row, column or diagonal, and
 * otherwise 2 (some square shares a line with both). O(1).
 */
class QueenTest {

    private static final SampleLoader SAMPLES = new SampleLoader("problems/math/queen");

    static int solve(final int x1, final int y1, final int x2, final int y2) {
        if (x1 == x2 && y1 == y2) {
            return 0;
        }
        if (x1 == x2 || y1 == y2 || x1 + y1 == x2 + y2 || x1 - y1 == x2 - y2) {
            return 1;
        }
        return 2;
    }

    static String run(final InputStream in) throws IOException {
        final var reader = new Reader(in);
        final var out = new StringBuilder();
        while (true) {
            final var x1 = reader.nextInt();
            final var y1 = reader.nextInt();
            final var x2 = reader.nextInt();
            final var y2 = reader.nextInt();
            if (x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0) {
                return out.toString();
            }
            out.append(solve(x1, y1, x2, y2)).append('\n');
        }
    }

    @ParameterizedTest
    @CsvSource({
        "4, 4, 6, 2, 1",
        "3, 5, 3, 5, 0",
        "5, 5, 4, 3, 2",
        "1, 1, 1, 8, 1",
        "1, 1, 8, 1, 1",
        "1, 1, 8, 8, 1",
        "1, 8, 8, 1, 1",
        "1, 1, 2, 3, 2",
    })
    void minimumMoves(final int x1, final int y1, final int x2, final int y2, final int expected) {
        assertThat(solve(x1, y1, x2, y2)).isEqualTo(expected);
    }

    @ParameterizedTest
    @ValueSource(strings = {"uri", "udebug"})
    void matchesSample(final String name) throws IOException {
        assertThat(run(SAMPLES.loadAsInputStream(name + ".in"))).isEqualTo(SAMPLES.loadAsString(name + ".out"));
    }
}
