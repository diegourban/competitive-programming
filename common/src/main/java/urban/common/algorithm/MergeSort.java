package urban.common.algorithm;

public class MergeSort {

    public int[] sort(final int[] items, final int begin, final int middle, final int end) {
        int[] result = new int[end - begin];

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

        return items;
    }

}
