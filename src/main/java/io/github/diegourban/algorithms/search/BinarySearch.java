package io.github.diegourban.algorithms.search;

/**
 * Binary search over a sorted {@code int[]}.
 */
public final class BinarySearch {

    private BinarySearch() {
    }

    /**
     * Finds {@code key} in {@code sorted} by halving the search range: O(log n) time, O(1) space.
     *
     * @param sorted values in ascending order
     * @param key    the value to look for
     * @return an index holding {@code key} (any one of them if it occurs more than once), or -1 if absent
     */
    public static int indexOf(int[] sorted, int key) {
        var low = 0;
        var high = sorted.length - 1;
        while (low <= high) {
            var middle = (low + high) >>> 1; // unsigned shift: no overflow when low + high > Integer.MAX_VALUE
            var value = sorted[middle];
            if (value < key) {
                low = middle + 1;
            } else if (value > key) {
                high = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
