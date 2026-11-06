package io.github.diegourban.algorithms.problems.datastructure.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Largest Difference in Increasing Indexes — Codewars (5 kyu).
 * <p>
 * https://www.codewars.com/kata/largest-difference-in-increasing-indexes
 * <p>
 * Largest {@code j - i} with {@code i < j} and {@code data[i] <= data[j]}, by brute force over all pairs:
 * O(n²) time, O(1) space. An O(n) alternative compares a prefix-min array against a suffix-max array
 * with two pointers.
 */
class LargestDifferenceTest {

    static int solve(int[] data) {
        var largest = 0;
        for (var i = 0; i < data.length; i++) {
            for (var j = data.length - 1; j > i; j--) {
                if (data[j] >= data[i]) {
                    largest = Math.max(largest, j - i);
                }
            }
        }
        return largest;
    }

    @Test
    void singleElementHasNoDifference() {
        assertThat(solve(new int[]{0})).isZero();
    }

    @Test
    void strictlyDecreasingHasNoDifference() {
        assertThat(solve(new int[]{2, 1})).isZero();
        assertThat(solve(new int[]{3, 2, 1})).isZero();
    }

    @Test
    void equalValuesCount() {
        assertThat(solve(new int[]{1, 1})).isEqualTo(1);
        assertThat(solve(new int[]{1, 1, 1})).isEqualTo(2);
    }

    @Test
    void increasingPairSpansTheArray() {
        assertThat(solve(new int[]{1, 2})).isEqualTo(1);
        assertThat(solve(new int[]{1, 1, 3})).isEqualTo(2);
    }

    @Test
    void findsWidestPairInMixedData() {
        assertThat(solve(new int[]{9, 4, 1, 10, 3, 4, 0, -1, -2})).isEqualTo(4);
    }
}
