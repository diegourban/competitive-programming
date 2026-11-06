package io.github.diegourban.algorithms.search;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BinarySearchTest {

    private static final int[] ONE_TO_TEN = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    @Test
    void findsOnTheLeftSide() {
        assertThat(BinarySearch.indexOf(ONE_TO_TEN, 3)).isEqualTo(2);
    }

    @Test
    void findsOnTheRightSide() {
        assertThat(BinarySearch.indexOf(ONE_TO_TEN, 9)).isEqualTo(8);
    }

    @Test
    void findsBothEnds() {
        assertThat(BinarySearch.indexOf(ONE_TO_TEN, 1)).isZero();
        assertThat(BinarySearch.indexOf(ONE_TO_TEN, 10)).isEqualTo(9);
    }

    @Test
    void returnsMinusOneForAMissingKey() {
        assertThat(BinarySearch.indexOf(new int[]{1, 2, 3, 5, 6, 7, 8, 9, 10}, 4)).isEqualTo(-1);
    }

    @Test
    void returnsMinusOneOutsideTheRange() {
        assertThat(BinarySearch.indexOf(ONE_TO_TEN, 0)).isEqualTo(-1);
        assertThat(BinarySearch.indexOf(ONE_TO_TEN, 11)).isEqualTo(-1);
    }

    @Test
    void returnsMinusOneForAnEmptyArray() {
        assertThat(BinarySearch.indexOf(new int[]{}, 1)).isEqualTo(-1);
    }
}
