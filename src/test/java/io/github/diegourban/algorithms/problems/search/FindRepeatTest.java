package io.github.diegourban.algorithms.problems.search;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * Find Repeat, Space Edition — Interview Cake.
 * <p>
 * https://www.interviewcake.com/question/java/find-duplicate-optimize-for-space
 * <p>
 * Binary search over the range of possible answers 1..n: count the items in the lower half of the range and,
 * by pigeonhole, narrow to whichever half holds more items than distinct values. O(n lg n) time, O(1) space.
 */
class FindRepeatTest {

    static int solve(final int[] numbers) {
        var floor = 1;
        var ceiling = numbers.length - 1;
        while (floor < ceiling) {
            final var midpoint = floor + (ceiling - floor) / 2;
            var itemsInLowerRange = 0;
            for (final var item : numbers) {
                if (item >= floor && item <= midpoint) {
                    itemsInLowerRange++;
                }
            }
            final var distinctInLowerRange = midpoint - floor + 1;
            if (itemsInLowerRange > distinctInLowerRange) {
                ceiling = midpoint;
            } else {
                floor = midpoint + 1;
            }
        }
        return floor;
    }

    @Test
    void smallestInputsRepeatOne() {
        assertThat(solve(new int[] {1, 1})).isOne();
        assertThat(solve(new int[] {1, 1, 1})).isOne();
    }

    @Test
    void findsAdjacentRepeatAnywhereInTheRange() {
        assertThat(solve(new int[] {1, 1, 2, 3, 4, 5, 6, 7, 8, 9})).isOne();
        assertThat(solve(new int[] {1, 2, 2, 3, 4, 5, 6, 7, 8, 9})).isEqualTo(2);
        assertThat(solve(new int[] {1, 2, 3, 3, 4, 5, 6, 7, 8, 9})).isEqualTo(3);
        assertThat(solve(new int[] {1, 2, 3, 4, 4, 5, 6, 7, 8, 9})).isEqualTo(4);
        assertThat(solve(new int[] {1, 2, 3, 4, 5, 5, 6, 7, 8, 9})).isEqualTo(5);
        assertThat(solve(new int[] {1, 2, 3, 4, 5, 6, 6, 7, 8, 9})).isEqualTo(6);
        assertThat(solve(new int[] {1, 2, 3, 4, 5, 6, 7, 7, 8, 9})).isEqualTo(7);
        assertThat(solve(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 8, 9})).isEqualTo(8);
        assertThat(solve(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 9})).isEqualTo(9);
    }

    @Test
    void findsRepeatRegardlessOfPosition() {
        assertThat(solve(new int[] {1, 2, 1, 3, 4, 5, 6, 7, 8})).isOne();
        assertThat(solve(new int[] {1, 2, 3, 1, 4, 5, 6, 7, 8})).isOne();
        assertThat(solve(new int[] {1, 2, 3, 4, 1, 5, 6, 7, 8})).isOne();
        assertThat(solve(new int[] {1, 2, 3, 4, 5, 1, 6, 7, 8})).isOne();
        assertThat(solve(new int[] {1, 2, 3, 4, 5, 6, 1, 7, 8})).isOne();
        assertThat(solve(new int[] {1, 2, 3, 4, 5, 6, 7, 1, 8})).isOne();
        assertThat(solve(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 1})).isOne();
    }
}
