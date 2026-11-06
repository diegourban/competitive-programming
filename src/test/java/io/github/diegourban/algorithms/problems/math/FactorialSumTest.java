package io.github.diegourban.algorithms.problems.math;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.diegourban.algorithms.io.Reader;
import io.github.diegourban.algorithms.testing.SampleLoader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * Factorial Sum — beecrowd (formerly URI Online Judge) 1161.
 * <p>
 * https://judge.beecrowd.com/en/problems/view/1161
 * <p>
 * M, N &lt;= 20, so M! + N! &lt;= 2 * 20! fits in a {@code long}; compute each factorial iteratively.
 * O(M + N).
 */
class FactorialSumTest {

    private static final SampleLoader SAMPLES = new SampleLoader("problems/math/factorial-sum");

    static long solve(int m, int n) {
        return factorial(m) + factorial(n);
    }

    private static long factorial(int n) {
        var result = 1L;
        for (var i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    static String run(InputStream in) throws IOException {
        var reader = new Reader(in);
        var out = new StringBuilder();
        while (true) {
            try {
                out.append(solve(reader.nextInt(), reader.nextInt())).append('\n');
            } catch (EOFException endOfInput) {
                return out.toString();
            }
        }
    }

    @ParameterizedTest
    @CsvSource({
        "4, 4, 48",
        "0, 0, 2",
        "0, 2, 3",
        "1, 2, 3",
        "5, 0, 121",
        "20, 20, 4865804016353280000",
    })
    void sumsBothFactorials(int m, int n, long expected) {
        assertThat(solve(m, n)).isEqualTo(expected);
    }

    @ParameterizedTest
    @ValueSource(strings = {"uri", "udebug"})
    void matchesSample(String name) throws IOException {
        assertThat(run(SAMPLES.loadAsInputStream(name + ".in"))).isEqualTo(SAMPLES.loadAsString(name + ".out"));
    }
}
