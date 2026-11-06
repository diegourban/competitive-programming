package io.github.diegourban.algorithms.problems.sorting;

import io.github.diegourban.algorithms.sorting.MergeSort;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

/**
 * Find the odd int — Codewars (6 kyu).
 * <p>
 * https://www.codewars.com/kata/54da5a58ea159efa38000836
 * <p>
 * Sort a copy so equal values form runs, then return the value of the first run with odd length.
 * O(n log n) time, O(n) space. A XOR fold ({@code 0 ^ a[0] ^ a[1] ^ ...}) solves it in O(n) time and O(1)
 * space, since pairs cancel out and only the odd-count value survives.
 */
class FindTheOddIntTest {

    static int solve(int[] numbers) {
        var sorted = numbers.clone();
        new MergeSort().sort(sorted, 0, sorted.length);
        var runStart = 0;
        for (var i = 1; i <= sorted.length; i++) {
            if (i == sorted.length || sorted[i] != sorted[runStart]) {
                if ((i - runStart) % 2 == 1) {
                    return sorted[runStart];
                }
                runStart = i;
            }
        }
        throw new IllegalArgumentException("No value appears an odd number of times");
    }

    @Test
    void findsValueAppearingOddTimesAmongPairs() {
        assertThat(solve(new int[]{20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5})).isEqualTo(5);
        assertThat(solve(new int[]{20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5})).isEqualTo(5);
    }

    @Test
    void handlesNegativeValues() {
        assertThat(solve(new int[]{1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5})).isEqualTo(-1);
    }

    @Test
    void singleElementIsTheAnswer() {
        assertThat(solve(new int[]{10})).isEqualTo(10);
    }

    @Test
    void valueSurroundedByAnEvenRunOfAnother() {
        assertThat(solve(new int[]{1, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1})).isEqualTo(10);
    }

    @Test
    void answerIsTheSmallestValue() {
        assertThat(solve(new int[]{5, 4, 3, 2, 1, 5, 4, 3, 2, 10, 10})).isEqualTo(1);
    }

    @Test
    void doesNotMutateInput() {
        var numbers = new int[]{3, 1, 3};
        solve(numbers);
        assertThat(numbers).containsExactly(3, 1, 3);
    }

    @Test
    void rejectsInputWithoutAnOddCount() {
        assertThatIllegalArgumentException().isThrownBy(() -> solve(new int[]{}));
        assertThatIllegalArgumentException().isThrownBy(() -> solve(new int[]{7, 7}));
    }
}
