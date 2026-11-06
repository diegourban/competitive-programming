package io.github.diegourban.algorithms.sorting;

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
            final int smallerIndex = findSmallerIndex(items, current, totalElements);
            final Integer currentItem = items[current];
            final Integer smallerItem = items[smallerIndex];
            items[current] = smallerItem;
            items[smallerIndex] = currentItem;
        }
    }

    private int findSmallerIndex(final int[] items, final int begin, final int end) {
        int smallerIndex = begin;
        for (int i = begin; i < end; i++) {
            if (items[i] < items[smallerIndex]) {
                smallerIndex = i;
            }
        }
        return smallerIndex;
    }
}
