package io.github.diegourban.algorithms.sorting;

import io.github.diegourban.algorithms.datastructure.array.ArrayUtils;

/**
 * Selection Sort algorithm: repeatedly swaps the smallest remaining element into place; O(n²) time in
 * every case and O(1) extra space.
 */
public class SelectionSort implements Sorter {

    /** Creates a selection sort. */
    public SelectionSort() {}

    @Override
    public void sort(final int[] items) {
        sort(items, items.length);
    }

    /**
     * Sort the items using selection sort algorithm
     *
     * @param items items to sort
     * @param totalElements total elements
     */
    private void sort(final int[] items, final int totalElements) {
        for (int current = 0; current < totalElements - 1; current++) {
            final int smallestIndex = findSmallestIndex(items, current, totalElements);
            ArrayUtils.swap(items, current, smallestIndex);
        }
    }

    private int findSmallestIndex(final int[] items, final int begin, final int end) {
        int smallestIndex = begin;
        for (int i = begin; i < end; i++) {
            if (items[i] < items[smallestIndex]) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
}
