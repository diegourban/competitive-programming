package io.github.diegourban.algorithms.problems.datastructure.linkedlist;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * Find Repeat, Space Edition BEAST MODE — Interview Cake.
 * <p>
 * https://www.interviewcake.com/question/java/find-duplicate-optimize-for-space-beast-mode
 * <p>
 * Read the array as a linked list where position p points to position {@code numbers[p - 1]}; the repeat is the
 * first node of the cycle reached from the head n + 1. Walk n steps to enter the cycle, measure its length, then
 * advance two pointers that far apart until they meet. O(n) time, O(1) space.
 */
class FindRepeatBeastModeTest {

    static int solve(final int[] numbers) {
        final var head = numbers.length;

        var positionInCycle = head;
        for (var step = 0; step < numbers.length - 1; step++) {
            positionInCycle = next(numbers, positionInCycle);
        }

        var cycleLength = 1;
        for (var position = next(numbers, positionInCycle);
                position != positionInCycle;
                position = next(numbers, position)) {
            cycleLength++;
        }

        var behind = head;
        var ahead = head;
        for (var step = 0; step < cycleLength; step++) {
            ahead = next(numbers, ahead);
        }
        while (behind != ahead) {
            behind = next(numbers, behind);
            ahead = next(numbers, ahead);
        }
        return behind;
    }

    private static int next(final int[] numbers, final int position) {
        return numbers[position - 1];
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
