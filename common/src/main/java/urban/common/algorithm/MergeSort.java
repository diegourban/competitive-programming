package urban.common.algorithm;

/**
 * Merge sort algorithm
 */
public class MergeSort {

    /**
     * Sorts the items from begin to end
     *
     * @param items the items to sort
     * @param begin begin
     * @param end end
     */
    public void sort(final int[] items, final int begin, final int end) {
        final int total = end - begin;
        if(total > 1) {
            final int middle = (begin + end) / 2;
            sort(items, begin, middle);
            sort(items, middle, end);
            merge(items, begin, middle, end);
        }
    }

    private void merge(final int[] items, final int begin, final int middle, final int end) {
        final int[] result = new int[end - begin];

        int current = 0;
        int currentLeft = begin;
        int currentRight = middle;

        while(currentLeft < middle && currentRight < end) {
            final int firstValue = items[currentLeft];
            final int secondValue = items[currentRight];

            if(firstValue < secondValue) {
                result[current] = firstValue;
                currentLeft++;
            } else {
                result[current] = secondValue;
                currentRight++;
            }

            current++;
        }

        // remaining values on the left side
        while(currentLeft < middle) {
            result[current] = items[currentLeft];
            currentLeft++;
            current++;
        }

        // remaining values on the right side
        while(currentRight < end) {
            result[current] = items[currentRight];
            currentRight++;
            current++;
        }

        for(int count = 0; count < current; count++) {
            items[begin + count] = result[count];
        }
    }

}
