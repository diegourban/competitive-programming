package urban.common.algorithm;

/**
 * Selection Sort algorithm
 */
public class SelectionSort {

    /**
     * Sort the items using selection sort algorithm
     *
     * @param items items to sort
     * @param totalElements total elements
     */
    public void sort(final int[] items, final int totalElements) {
        for(int current = 0; current < totalElements - 1; current++) {
            final int smallerIndex = findSmallerIndex(items, current, totalElements);
            Integer currentItem = items[current];
            Integer smallerItem = items[smallerIndex];
            items[current] = smallerItem;
            items[smallerIndex] = currentItem;
        }
    }

    private int findSmallerIndex(final int[] items, final int begin, final int end) {
        int smallerIndex = begin;
        for(int i = begin; i < end; i++) {
            if(items[i] < items[smallerIndex]) {
                smallerIndex = i;
            }
        }
        return smallerIndex;
    }
}
