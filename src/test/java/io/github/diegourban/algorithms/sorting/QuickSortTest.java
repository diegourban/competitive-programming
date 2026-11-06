package io.github.diegourban.algorithms.sorting;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class QuickSortTest {

    @Test
    void shouldSort() {
        final int[] unsortedItems = {4, 5, 1, 9, 2, 3, 6, 7};
        final int[] sortedItems = {1, 2, 3, 4, 5, 6, 7, 9};

        QuickSort quickSort = new QuickSort();
        quickSort.sort(unsortedItems, 0, unsortedItems.length);

        assertThat(unsortedItems).isEqualTo(sortedItems);
    }
}
