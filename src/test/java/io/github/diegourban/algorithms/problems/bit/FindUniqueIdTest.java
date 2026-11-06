package io.github.diegourban.algorithms.problems.bit;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * The Stolen Breakfast Drone — Interview Cake.
 * <p>
 * https://www.interviewcake.com/question/java/find-unique-int-among-duplicates
 * <p>
 * XOR every id together: each pair cancels itself out, leaving only the unique id. O(n) time, O(1) space.
 */
class FindUniqueIdTest {

    static int solve(int[] ids) {
        var unique = 0;
        for (var id : ids) {
            unique ^= id;
        }
        return unique;
    }

    @Test
    void findsUniqueIdAtTheStart() {
        assertThat(solve(new int[] {1, 2, 2})).isOne();
    }

    @Test
    void findsUniqueIdInTheMiddle() {
        assertThat(solve(new int[] {1, 2, 1})).isEqualTo(2);
    }

    @Test
    void findsUniqueIdAmongManyPairs() {
        assertThat(solve(new int[] {1, 5, 8, 2, 4, 9, 9, 8, 4, 1, 2})).isEqualTo(5);
    }
}
