package io.github.diegourban.algorithms.search;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BinarySearchTest {

    @Test
    void shouldHandleNotExistingElement() {
        final int[] items = {1, 2, 3, 5, 6, 7, 8, 9, 10};
        final int element = 4;
        final int expectedPosition = -1;

        final BinarySearch binarySearch = new BinarySearch();
        final int position = binarySearch.find(items, 0, items.length, element);
        assertThat(position).isEqualTo(expectedPosition);
    }

    @Test
    void shouldFindOnRightSide() {
        final int[] items = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        final int element = 9;
        final int expectedPosition = 8;

        final BinarySearch binarySearch = new BinarySearch();
        final int position = binarySearch.find(items, 0, items.length, element);
        assertThat(position).isEqualTo(expectedPosition);
    }

    @Test
    void shouldFindOnLeftSide() {
        final int[] items = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        final int element = 3;
        final int expectedPosition = 2;

        final BinarySearch binarySearch = new BinarySearch();
        final int position = binarySearch.find(items, 0, items.length, element);
        assertThat(position).isEqualTo(expectedPosition);
    }
}
