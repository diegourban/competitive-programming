package io.github.diegourban.algorithms.problems.math;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.diegourban.algorithms.io.Reader;
import io.github.diegourban.algorithms.math.NumberTheory;
import io.github.diegourban.algorithms.testing.SampleLoader;
import java.io.IOException;
import java.io.InputStream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * Collectable Cards — beecrowd (formerly URI Online Judge) 1028.
 * <p>
 * https://judge.beecrowd.com/en/problems/view/1028
 * <p>
 * The largest equal-size piles that split both decks evenly have gcd(f1, f2) cards. Euclid's
 * algorithm, O(log min(f1, f2)).
 */
class CollectableCardsTest {

    private static final SampleLoader SAMPLES = new SampleLoader("problems/math/collectable-cards");

    static long solve(final int f1, final int f2) {
        return NumberTheory.gcdLoop(f1, f2);
    }

    static String run(final InputStream in) throws IOException {
        final var reader = new Reader(in);
        final var tests = reader.nextInt();
        final var out = new StringBuilder();
        for (var i = 0; i < tests; i++) {
            out.append(solve(reader.nextInt(), reader.nextInt())).append('\n');
        }
        return out.toString();
    }

    @ParameterizedTest
    @CsvSource({
        "8, 12, 4",
        "9, 27, 9",
        "259, 111, 37",
        "1, 1, 1",
        "7, 13, 1",
        "1000, 1000, 1000",
    })
    void largestPileSizeIsTheGcd(final int f1, final int f2, final long expected) {
        assertThat(solve(f1, f2)).isEqualTo(expected);
    }

    @ParameterizedTest
    @ValueSource(strings = {"uri", "udebug"})
    void matchesSample(final String name) throws IOException {
        assertThat(run(SAMPLES.loadAsInputStream(name + ".in"))).isEqualTo(SAMPLES.loadAsString(name + ".out"));
    }
}
