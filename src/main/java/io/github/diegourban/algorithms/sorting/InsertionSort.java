package io.github.diegourban.algorithms.sorting;

/**
 * Insertion Sort Algorithm
 */
public class InsertionSort implements Sorter {

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
