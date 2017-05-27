package urban.common.algorithm;

/**
 * Binary Search algorithm
 */
public class BinarySearch {

    /**
     * Finds an element in a list
     *
     * @param items an ordered list of items to find
     * @param from the index to find from in the list
     * @param to the index to find to in the list
     * @param element the element to find
     * @return the index of the element, -1 otherwise
     */
    public int find(final int[] items, final int from, final int to, final int element) {
        if(from > to) {
            return -1;
        }

        final int middle = (from + to) / 2;
        final int middleItem = items[middle];

        if(element == middleItem) {
            return middle;
        }
        if(element < middleItem) {
            return find(items, from, middle - 1, element);
        }
        return find(items, middle + 1, to, element);
    }
}
