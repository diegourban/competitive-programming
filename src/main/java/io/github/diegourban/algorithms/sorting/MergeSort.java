package io.github.diegourban.algorithms.sorting;

/**
 * Merge sort algorithm: recursively sorts each half and merges them; O(n log n) time and O(n) extra space.
 */
public class MergeSort implements Sorter {

    /** Creates a merge sort. */
    public MergeSort() {}

    @Override
    public void sort(final int[] items) {
        sort(items, 0, items.length);
    }

    /**
     * Sorts the items from begin to end
     *
     * @param items the items to sort
     * @param begin begin
     * @param end end
     */
    private void sort(final int[] items, final int begin, final int end) {
        final int total = end - begin;
        if (total > 1) {
            final int middle = (begin + end) / 2;
            sort(items, begin, middle);
            sort(items, middle, end);
            merge(items, begin, middle, end);
        }
    }

    private void merge(final int[] items, final int begin, final int middle, final int end) {
        final int[] result = new int[end - begin];

        int resultIndex = 0;
        int currentLeft = begin;
        int currentRight = middle;

        while (currentLeft < middle && currentRight < end) {
            final int leftValue = items[currentLeft];
            final int rightValue = items[currentRight];

            if (leftValue < rightValue) {
                result[resultIndex] = leftValue;
                currentLeft++;
            } else {
                result[resultIndex] = rightValue;
                currentRight++;
            }

            resultIndex++;
        }

        // remaining values on the left side
        while (currentLeft < middle) {
            result[resultIndex] = items[currentLeft];
            currentLeft++;
            resultIndex++;
        }

        // remaining values on the right side
        while (currentRight < end) {
            result[resultIndex] = items[currentRight];
            currentRight++;
            resultIndex++;
        }

        for (int count = 0; count < resultIndex; count++) {
            items[begin + count] = result[count];
        }
    }
}
