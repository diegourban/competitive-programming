package io.github.diegourban.algorithms.sorting;

/**
 * An in-place, ascending sort of an {@code int[]}.
 * <p>
 * Every sorting algorithm in this package implements it, so they can be swapped, compared and tested as one family.
 */
public interface Sorter {

    /**
     * Sorts {@code items} in ascending order, in place.
     *
     * @param items the values to sort; an empty array is left as is
     */
    void sort(int[] items);
}
