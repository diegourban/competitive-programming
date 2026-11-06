package io.github.diegourban.algorithms.problems.bit;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * Delta Bits — Codewars (5 kyu).
 * <p>
 * Number of bit flips needed to turn {@code a} into {@code b}: the popcount of {@code a ^ b}. O(1).
 */
class DeltaBitsTest {

    static int solve(final int a, final int b) {
        return Integer.bitCount(a ^ b);
    }

    @ParameterizedTest
    @CsvSource({
        "0, 0, 0",
        "0, 1, 1",
        "0, 3, 2",
        "0, 7, 3",
        "0, 10, 2",
        "31, 14, 2",
        "31, 31, 0",
        "7, 17, 3",
        "330274332, 199260599, 19",
    })
    void countsDifferingBits(final int a, final int b, final int expected) {
        assertThat(solve(a, b)).isEqualTo(expected);
    }
}
