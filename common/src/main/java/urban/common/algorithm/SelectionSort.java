package urban.common.algorithm;

import java.util.List;

public class SelectionSort {

    public void sort(final int[] list, final int totalElements) {
        for(int i = 0; i < totalElements - 1; i++) {
            final int smallerIndex = findSmallerIndex(list, i, totalElements);
            Integer current = list[i];
            Integer smaller = list[smallerIndex];
            list[i] = smaller;
            list[smallerIndex] = current;
        }
    }

    private int findSmallerIndex(final int[] list, final int begin, final int end) {
        int smallerIndex = begin;
        for(int i = begin; i < end; i++) {
            if(list[i] < list[smallerIndex]) {
                smallerIndex = i;
            }
        }
        return smallerIndex;
    }
}
