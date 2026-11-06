package io.github.diegourban.algorithms.problems.recursion;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

import java.util.Locale;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * Square Root of 2 — beecrowd (formerly URI Online Judge) 2166.
 * <p>
 * https://judge.beecrowd.com/en/problems/view/2166
 * <p>
 * Evaluate the continued fraction {@code 1 + 1/(2 + 1/(2 + ...))} truncated after {@code n} levels,
 * recursing on the tail {@code f(n) = 1 / (2 + f(n - 1))}, {@code f(0) = 0}. O(n) time and stack.
 */
class SquareRootOfTwoTest {

    static double solve(int n) {
        return 1 + tail(n);
    }

    private static double tail(int n) {
        return n == 0 ? 0 : 1 / (2 + tail(n - 1));
    }

    @ParameterizedTest
    @CsvSource({
        "0, 1.0000000000",
        "1, 1.5000000000",
        "5, 1.4142857143",
        "100, 1.4142135624",
    })
    void approximatesSquareRootOfTwoToTenDecimals(int n, String expected) {
        assertThat(String.format(Locale.ROOT, "%.10f", solve(n))).isEqualTo(expected);
    }

    @ParameterizedTest
    @ValueSource(ints = {20, 100})
    void convergesToSquareRootOfTwo(int n) {
        assertThat(solve(n)).isCloseTo(Math.sqrt(2), offset(1e-12));
    }
}
