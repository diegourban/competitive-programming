package io.github.diegourban.algorithms.problems.datastructure.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Single Riffle Check — Interview Cake.
 * <p>
 * https://www.interviewcake.com/question/java/single-riffle-check
 * <p>
 * Tell whether {@code deck} is a single riffle of {@code half1} and {@code half2}: walk the deck and
 * consume each card from the top of whichever half matches. O(n) time, O(1) extra space.
 */
class SingleRiffleCheckTest {

    static boolean solve(int[] half1, int[] half2, int[] deck) {
        var i1 = 0;
        var i2 = 0;
        for (var card : deck) {
            if (i1 < half1.length && card == half1[i1]) {
                i1++;
            } else if (i2 < half2.length && card == half2[i2]) {
                i2++;
            } else {
                return false;
            }
        }
        return i1 == half1.length && i2 == half2.length;
    }

    @Test
    void interleavedHalvesAreARiffle() {
        assertThat(solve(new int[]{1, 3, 5}, new int[]{2, 4, 6}, new int[]{1, 2, 3, 4, 5, 6})).isTrue();
    }

    @Test
    void oneHalfThenTheOtherIsARiffle() {
        assertThat(solve(new int[]{1, 2}, new int[]{3, 4}, new int[]{1, 2, 3, 4})).isTrue();
    }

    @Test
    void unevenInterleavingIsARiffle() {
        assertThat(solve(new int[]{1, 3, 5}, new int[]{2, 4, 6}, new int[]{1, 3, 2, 5, 4, 6})).isTrue();
    }

    @Test
    void cardOutOfOrderWithinItsHalfIsNotARiffle() {
        assertThat(solve(new int[]{1, 3, 5}, new int[]{2, 4, 6}, new int[]{3, 1, 2, 4, 5, 6})).isFalse();
    }

    @Test
    void unknownCardIsNotARiffle() {
        assertThat(solve(new int[]{1}, new int[]{2}, new int[]{1, 7})).isFalse();
    }

    @Test
    void missingCardsAreNotARiffle() {
        assertThat(solve(new int[]{1, 3}, new int[]{2}, new int[]{1, 2})).isFalse();
    }

    @Test
    void emptyDeckOfEmptyHalvesIsARiffle() {
        assertThat(solve(new int[]{}, new int[]{}, new int[]{})).isTrue();
    }
}
