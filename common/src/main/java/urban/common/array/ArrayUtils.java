package urban.common.array;

public class ArrayUtils {

    /**
     * Solution: This solution is similar to a binary search, except we divide the range of possible answers in half at each step, rather than dividing the array in half.
     * <p>
     * 1 - Find the number of integers in our input array which lie within the range 1..2/n;<br>
     * 2 - Compare that to the number of possible unique integers in the same range;<br>
     * 3 - If the number of actual integers is greater than the number of possible integers, we know there’s a duplicate in the range 1..2/n, so we iteratively use the same approach on that range;<br>
     * 4 - If the number of actual integers is not greater than the number of possible integers, we know there must be duplicate in the range n/2 + 1..n, so we iteratively use the same approach on that range;<br>
     * 5 - At some point our range will contain just 1 integer, which will be our answer.
     * <p>
     * Complexity: O(1) space and O(n lg n) time.
     *
     * @param theArray the array to find a repeating number
     * @return the first repeating number
     */
    public static int findRepeat(int[] theArray) {
        int floor = 1;
        int ceiling = theArray.length - 1;

        while (floor < ceiling) {

            // divide our range 1..n into an upper range and lower range
            // (such that they don't overlap)
            // lower range is floor..midpoint
            // upper range is midpoint+1..ceiling
            int midpoint = floor + ((ceiling - floor) / 2);
            int lowerRangeFloor = floor;
            int lowerRangeCeiling = midpoint;
            int upperRangeFloor = midpoint + 1;
            int upperRangeCeiling = ceiling;

            // count number of items in lower range
            int itemsInLowerRange = 0;
            for (int item : theArray) {

                // is it in the lower range?
                if (item >= lowerRangeFloor && item <= lowerRangeCeiling) {
                    itemsInLowerRange += 1;
                }
            }

            int distinctPossibleIntegersInLowerRange = lowerRangeCeiling - lowerRangeFloor + 1;

            if (itemsInLowerRange > distinctPossibleIntegersInLowerRange) {

                // there must be a duplicate in the lower range
                // so use the same approach iteratively on that range
                floor = lowerRangeFloor;
                ceiling = lowerRangeCeiling;
            } else {

                // there must be a duplicate in the upper range
                // so use the same approach iteratively on that range
                floor = upperRangeFloor;
                ceiling = upperRangeCeiling;
            }
        }

        // floor and ceiling have converged
        // we found a number that repeats!
        return floor;
    }

    /**
     * We want to think of our array as a linked list but we don't want to actually use up all that space, so we traverse our array as if it were a linked list ↴ by converting positions to indices.
     * <p>
     * Solution: We treat the input array as a linked list like we described at the top in the problem.
     * <p>
     * 1 - We know the position of a node with multiple incoming pointers is a duplicate in our array because the nodes that pointed to it must have the same value;<br>
     * 2 - We find a node with multiple incoming pointers by finding the first node in a cycle;<br>
     * 3 - We find the first node in a cycle by finding the length of the cycle and advancing two pointers: one starting at the head of the linked list, and the other starting ahead as many steps as there are nodes in the cycle. The pointers will meet at the first node in the cycle;<br>
     * 4 - We find the length of a cycle by remembering a position inside the cycle and counting the number of steps it takes to get back to that position;<br>
     * 5 - We get inside a cycle by starting at the head and walking nn steps. We know the head of the list is at position n + 1.
     * <p>
     * Complexity: O(1) space and O(n) time.
     *
     * @param intArray the array to find a duplicate number
     * @return the first duplicate number
     */
    public static int findDuplicate(int[] intArray) {
        final int n = intArray.length - 1;

        // STEP 1: GET INSIDE A CYCLE
        // start at position n+1 and walk n steps to
        // find a position guaranteed to be in a cycle
        int positionInCycle = n + 1;
        for (int x = 0; x < n; x++) {

            // we subtract 1 from the current position to step ahead:
            // the 2nd *position* in an array is *index* 1
            positionInCycle = intArray[positionInCycle - 1];
        }

        // STEP 2: FIND THE LENGTH OF THE CYCLE
        // find the length of the cycle by remembering a position in the cycle
        // and counting the steps it takes to get back to that position
        int rememberedPositionInCycle = positionInCycle;
        int currentPositionInCycle = intArray[positionInCycle - 1]; // 1 step ahead
        int cycleStepCount = 1;

        while (currentPositionInCycle != rememberedPositionInCycle) {
            currentPositionInCycle = intArray[currentPositionInCycle - 1];
            cycleStepCount += 1;
        }

        // STEP 3: FIND THE FIRST NODE OF THE CYCLE
        // start two pointers
        //   (1) at position n+1
        //   (2) ahead of position n+1 as many steps as the cycle's length
        int pointerStart = n + 1;
        int pointerAhead = n + 1;
        for (int x = 0; x < cycleStepCount; x++) {
            pointerAhead = intArray[pointerAhead - 1];
        }

        // advance until the pointers are in the same position
        // which is the first node in the cycle
        while (pointerStart != pointerAhead) {
            pointerStart = intArray[pointerStart - 1];
            pointerAhead = intArray[pointerAhead - 1];
        }

        // since there are multiple values pointing to the first node
        // in the cycle, its position is a duplicate in our array
        return pointerStart;
    }
}
