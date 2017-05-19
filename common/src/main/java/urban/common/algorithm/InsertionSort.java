package urban.common.algorithm;

/**
 * Insertion Sort Algorithm
 */
public class InsertionSort {

    /**
     * Sort the items using insertion sort algorithm
     *
     * @param items items to sort
     * @param totalElements total elements
     */
    public void sort(final int[] items, final int totalElements) {
        for(int current = 1; current < totalElements; current++) {
            int analysis = current;

            while(analysis > 0 && items[analysis] < items[analysis - 1]) {
                Integer analysisItem = items[analysis];
                Integer previousItem = items[analysis - 1];
                items[analysis] = previousItem;
                items[analysis - 1] = analysisItem;
                analysis--;
            }
        }
    }
}
