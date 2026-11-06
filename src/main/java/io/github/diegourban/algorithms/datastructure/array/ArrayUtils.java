package io.github.diegourban.algorithms.datastructure.array;

import java.util.Random;

/**
 * Static helper methods for arrays.
 */
public final class ArrayUtils {

    private ArrayUtils() {}

    private static final Random RANDOM = new Random();

    /**
     * Function for doing an in-place (Fisher–Yates) shuffle of an array.
     * <p>
     * Solution: We choose a random item to move to the first index, then we choose a random other item to move to the second index, etc.
     * We "place" an item in an index by swapping it with the item currently at that index.
     * Crucially, once an item is placed at an index it can't be moved. So for the first index we choose from n items, for the second index we choose from n-1 items, etc
     * <p>
     * Complexity: O(1) space, and O(n) time.
     * <p>
     * Arrays with zero or one element are left unchanged.
     *
     * @param values the array to shuffle; modified in place
     */
    public static void shuffle(final int[] values) {
        // if it's 1 or 0 items, just return
        if (values.length <= 1) {
            return;
        }

        // walk through from beginning to end
        for (int targetIndex = 0; targetIndex < values.length - 1; targetIndex++) {

            // choose a random not-yet-placed item to place there
            // (could also be the item currently in that spot)
            // must be an item AFTER the current item, because the stuff
            // before has all already been placed
            final int randomChoiceIndex = randomBetweenInclusive(targetIndex, values.length - 1);

            // place our random choice in the spot by swapping
            if (randomChoiceIndex != targetIndex) {
                final int displacedValue = values[targetIndex];
                values[targetIndex] = values[randomChoiceIndex];
                values[randomChoiceIndex] = displacedValue;
            }
        }
    }

    private static int randomBetweenInclusive(final int min, final int max) {
        return RANDOM.nextInt((max - min) + 1) + min;
    }
}
