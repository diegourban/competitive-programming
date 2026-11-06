package io.github.diegourban.algorithms.problems.datastructure.array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Equal Sides Of An Array — Codewars (6 kyu).
 * <p>
 * First index whose left and right sums are equal, or -1. Recomputes both sums for every index:
 * O(n²) time. An O(n) alternative keeps a running left sum against {@code total - left - arr[i]}
 * (prefix sums). As in the original solution, index 0 is never considered.
 */
class EqualSidesOfAnArrayTest {

    static int solve(int[] arr) {
        for (var i = 1; i < arr.length; i++) {
            var leftSum = Arrays.stream(arr, 0, i).sum();
            var rightSum = Arrays.stream(arr, i + 1, arr.length).sum();
            if (leftSum == rightSum) {
                return i;
            }
        }
        return -1;
    }

    @Test
    void findsMiddleOfUniformArray() {
        assertThat(solve(new int[]{1, 1, 1})).isEqualTo(1);
    }

    @Test
    void returnsMinusOneWhenNoIndexBalances() {
        assertThat(solve(new int[]{1, 1, 2})).isEqualTo(-1);
        assertThat(solve(new int[]{1, 1})).isEqualTo(-1);
    }

    @Test
    void returnsMinusOneForEmptyArray() {
        assertThat(solve(new int[]{})).isEqualTo(-1);
    }

    @Test
    void balancesSymmetricSides() {
        assertThat(solve(new int[]{2, 50, 3, 50, 2})).isEqualTo(2);
    }

    @Test
    void balancesAsymmetricSidesWithEqualSums() {
        assertThat(solve(new int[]{20, 30, 3, 48, 2})).isEqualTo(2);
    }

    @Test
    void handlesNegativeValues() {
        assertThat(solve(new int[]{20, -30, 3, -30, 20})).isEqualTo(2);
        assertThat(solve(new int[]{1, 2, 3, -30, 3, -30, 6})).isEqualTo(4);
    }
}
