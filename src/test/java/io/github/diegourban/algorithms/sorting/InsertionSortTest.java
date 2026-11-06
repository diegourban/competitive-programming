package io.github.diegourban.algorithms.sorting;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class InsertionSortTest {

    @Test
    void test() {
        final int[] unsortedItems = {5, 7, 2, 9, 4, 8, 1, 10, 3, 6};
        final int[] sortedItems = {1, 2, 3, 4, 5, 6 ,7, 8, 9, 10};

        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(unsortedItems, unsortedItems.length);

        assertThat(unsortedItems).isEqualTo(sortedItems);
    }
}
