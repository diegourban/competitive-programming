package urban.common.algorithm;

/**
 * Selection Sort algorithm
 */
public class SelectionSort {

    /**
     * Sorts the list
     * @param items the list to sort
     * @param totalElements total elements at the list
     */
    public void sort(final int[] items, final int totalElements) {
        for(int i = 0; i < totalElements - 1; i++) {
            final int smallerIndex = findSmallerIndex(items, i, totalElements);
            Integer current = items[i];
            Integer smaller = items[smallerIndex];
            items[i] = smaller;
            items[smallerIndex] = current;
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
