package urban.common.algorithm;

/**
 * Quick sort algorithm
 */
public class QuickSort {

    /**
     * Sort the items from begin to end
     *
     * @param items the items to sort
     * @param begin begin
     * @param end end
     */
    public void sort(final int[] items, final int begin, final int end) {
        final int totalElements = end - begin;
        if(totalElements > 1) {
            final int pivotPosition = partition(items, begin, end);
            sort(items, begin, pivotPosition);
            sort(items, pivotPosition + 1, end);
        }
    }

    private int partition(final int[] items, final int begin, final int end) {
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
