package io.github.diegourban.algorithms.sorting;

/**
 * Quick sort algorithm: partitions around the last element (Lomuto scheme) and recurses on both sides;
 * O(n log n) average and O(n²) worst-case time (for example on already sorted input), O(log n) average and O(n)
 * worst-case stack space.
 */
public class QuickSort implements Sorter {

    /** Creates a quick sort. */
    public QuickSort() {}

    @Override
    public void sort(final int[] items) {
        sort(items, 0, items.length);
    }

    /**
     * Sort the items from start to end
     *
     * @param items the items to sort
     * @param start from
     * @param end end
     */
    private void sort(final int[] items, final int start, final int end) {
        final int totalElements = end - start;
        if (totalElements > 1) {
            final int pivotPosition = partition(items, start, end);
            sort(items, start, pivotPosition);
            sort(items, pivotPosition + 1, end);
        }
    }

    private int partition(final int[] items, final int start, final int end) {
        int minorsFound = start;

        final int pivot = items[end - 1];
        for (int current = start; current < end - 1; current++) {
            final int currentItem = items[current];
            if (currentItem <= pivot) {
                swap(items, current, minorsFound);
                minorsFound++;
            }
        }
        swap(items, end - 1, minorsFound);
        return minorsFound;
    }

    private void swap(final int[] items, final int from, final int to) {
        final int temp = items[from];
        items[from] = items[to];
        items[to] = temp;
    }
}
