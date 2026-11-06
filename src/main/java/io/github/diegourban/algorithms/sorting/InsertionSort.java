package io.github.diegourban.algorithms.sorting;

import io.github.diegourban.algorithms.datastructure.array.ArrayUtils;

/**
 * Insertion Sort Algorithm: moves each element left past larger ones until it is in place;
 * O(n²) time (O(n) on already sorted input) and O(1) extra space.
 */
public class InsertionSort implements Sorter {

    /** Creates an insertion sort. */
    public InsertionSort() {}

    @Override
    public void sort(final int[] items) {
        sort(items, items.length);
    }

    /**
     * Sort the items using insertion sort algorithm
     *
     * @param items items to sort
     * @param totalElements total elements
     */
    private void sort(final int[] items, final int totalElements) {
        for (int current = 1; current < totalElements; current++) {
            int position = current;

            while (position > 0 && items[position] < items[position - 1]) {
                ArrayUtils.swap(items, position, position - 1);
                position--;
            }
        }
    }
}
