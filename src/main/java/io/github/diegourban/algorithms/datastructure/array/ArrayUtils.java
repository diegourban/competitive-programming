package io.github.diegourban.algorithms.datastructure.array;

import java.util.Random;

public final class ArrayUtils {

    private ArrayUtils() {}

    private static final Random rand = new Random();

    /**
     * Function for doing an in-place ↴ shuffle of an array.
     * <p>
     * Solution: We choose a random item to move to the first index, then we choose a random other item to move to the second index, etc.
     * We "place" an item in an index by swapping it with the item currently at that index.
     * Crucially, once an item is placed at an index it can't be moved. So for the first index we choose from n items, for the second index we choose from n-1 items, etc
     * <p>
     * Complexity: O(1) space, and O(n) time.
     *
     * @param theArray the array to shuffle
     */
    public static void shuffle(final int[] theArray) {
        // if it's 1 or 0 items, just return
        if (theArray.length <= 1) {
            return;
        }

        // walk through from beginning to end
        for (int indexWeAreChoosingFor = 0; indexWeAreChoosingFor < theArray.length - 1; indexWeAreChoosingFor++) {

            // choose a random not-yet-placed item to place there
            // (could also be the item currently in that spot)
            // must be an item AFTER the current item, because the stuff
            // before has all already been placed
            final int randomChoiceIndex = getRandom(indexWeAreChoosingFor, theArray.length - 1);

            // place our random choice in the spot by swapping
            if (randomChoiceIndex != indexWeAreChoosingFor) {
                final int valueAtIndexWeChoseFor = theArray[indexWeAreChoosingFor];
                theArray[indexWeAreChoosingFor] = theArray[randomChoiceIndex];
                theArray[randomChoiceIndex] = valueAtIndexWeChoseFor;
            }
        }
    }

    private static int getRandom(final int floor, final int ceiling) {
        return rand.nextInt((ceiling - floor) + 1) + floor;
    }
}
