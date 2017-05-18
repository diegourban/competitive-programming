package urban.common.algorithm;

import java.util.List;

public class SelectionSort {

    public void sort(final List<Integer> list) {
        for(int i = 0; i < list.size() - 1; i++) {
            final int smallerIndex = findSmallerIndex(list, i, list.size());
            Integer current = list.get(i);
            Integer smaller = list.get(smallerIndex);
            list.set(i, smaller);
            list.set(smallerIndex, current);
        }
    }

    private int findSmallerIndex(final List<Integer> list, final int begin, final int end) {
        int smallerIndex = begin;
        for(int i = begin; i < end; i++) {
            if(list.get(i) < list.get(smallerIndex)) {
                smallerIndex = i;
            }
        }
        return smallerIndex;
    }
}
