package urban.common.algorithm;

/**
 * Quick sort algorithm
 */
public class QuickSort {

    /**
     * Sort the items from start to end
     *
     * @param items the items to sort
     * @param start from
     * @param end end
     */
    public void sort(final int[] items, final int start, final int end) {
        final int totalElements = end - start;
        if(totalElements > 1) {
            final int pivotPosition = partition(items, end);
            sort(items, start, pivotPosition);
            sort(items, pivotPosition + 1, end);
        }
    }

    private int partition(final int[] items, final int end) {
        int minorsFound = 0;

        final int pivot = items[end - 1];
        for(int current = 0; current < end - 1; current++) {
            final int currentItem = items[current];
            if(currentItem <= pivot) {
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
