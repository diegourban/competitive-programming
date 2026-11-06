package io.github.diegourban.algorithms.sorting;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MergeSortTest {

    @Test
    void shouldSortWithGroupsOfSameSize() {
        final int[] unsortedItems = {4, 5, 1, 9, 2, 3, 6, 7};
        final int[] sortedItems = {1, 2, 3, 4, 5, 6, 7, 9};

        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(unsortedItems, 0, unsortedItems.length);

        assertThat(unsortedItems).isEqualTo(sortedItems);
    }

    @Test
    void shouldSortWithLeftoverAtGroup1() {
        final int[] unsortedItems = {4, 1, 8, 9, 10, 2, 3, 7, 6};
        final int[] sortedItems = {1, 2, 3, 4, 6, 7, 8, 9, 10};

        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(unsortedItems, 0, unsortedItems.length);

        assertThat(unsortedItems).isEqualTo(sortedItems);
    }

    @Test
    void shouldSortWithLeftoverAtGroup2() {
        final int[] unsortedItems = {4, 5, 2, 9, 1, 7, 6, 3, 10};
        final int[] sortedItems = {1, 2, 3, 4, 5, 6, 7, 9, 10};

        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(unsortedItems, 0, unsortedItems.length);

        assertThat(unsortedItems).isEqualTo(sortedItems);
    }
}
