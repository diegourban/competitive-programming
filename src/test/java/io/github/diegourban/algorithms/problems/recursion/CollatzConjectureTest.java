package io.github.diegourban.algorithms.problems.recursion;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Collatz Conjecture — Codewars (7 kyu).
 * <p>
 * Length of the Collatz sequence starting at {@code x} and ending at 1 (both included): halve even
 * numbers, map odd ones to {@code 3x + 1}, and recurse adding one per step. O(steps) time and stack.
 */
class CollatzConjectureTest {

    static long solve(long x) {
        if (x == 1) {
            return 1;
        }
        return 1 + solve(x % 2 == 0 ? x / 2 : 3 * x + 1);
    }

    @ParameterizedTest
    @CsvSource({
            "1, 1",
            "2, 2",
            "3, 8",
            "30, 19",
            "27, 112",
            "100, 26",
            "103, 88",
    })
    void countsSequenceLength(long x, long expected) {
        assertThat(solve(x)).isEqualTo(expected);
    }
}
