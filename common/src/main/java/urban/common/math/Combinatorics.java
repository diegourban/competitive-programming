package urban.common.math;

import java.math.BigInteger;

public class Combinatorics {

    /**
     * Pascal's Triangle
     * <p>
     * 1
     * 1 1
     * 1 2 1
     * 1 3 3 1
     * 1 4 6 4 1
     * <p>
     * Solution extracted and adapted from
     * http://www.brpreiss.com/books/opus5/html/page460.html.
     *
     * @param n the row number (0-indexed)
     * @param m the column number (0-indexed)
     * @return
     */
    public static BigInteger binomialCoefficient(int n, int m) {
        if (m < 0 || m > n) {
            return new BigInteger("0");
        }

        if (m == 0 || m == n) {
            return new BigInteger("1");
        }

        if (m == 1 || m == n - 1) {
            return new BigInteger(String.valueOf(n));
        }

        BigInteger[] binomials = new BigInteger[n + 1];
        binomials[0] = new BigInteger("1");
        for (int i = 1; i <= n; i++) {
            binomials[i] = new BigInteger("1");
            for (int j = i - 1; j > 0; --j) {
                binomials[j] = binomials[j].add(binomials[j - 1]);
            }
        }

        return binomials[m];
    }

    /**
     * This is a classic computer science puzzle called "the unbounded knapsack problem."
     * https://en.wikipedia.org/wiki/Knapsack_problem
     * <p>
     * We use a bottom-up approach to find the max value at our bag's weightCapacity by finding the max value at every capacity from 0 to weightCapacity.
     * <p>
     * Complexity: O(n * k) time and O(k) space, where n is the number of boxes and k is the capacity of the bag.
     *
     * @param boxes the boxes available
     * @param weightCapacity the maximum weight capacity of the bag
     * @return the maximum value
     */
    public static long knapsackProblem(Box[] boxes, int weightCapacity) {
        // we make an array to hold the maximum possible value at every
        // bag weight capacity from 0 to weightCapacity
        // starting each index with value 0
        long[] maxValuesAtCapacities = new long[weightCapacity + 1];

        for (int currentCapacity = 0; currentCapacity <= weightCapacity; currentCapacity++) {

            // set a variable to hold the max monetary value so far for currentCapacity
            long currentMaxValue = 0;

            for (Box box : boxes) {

                // if a box weighs 0 and has a positive value the value of our bag is infinite!
                if (box.weight == 0 && box.value != 0) {
                    throw new InfinityException();
                }

                // if the current box weighs as much or less than the current weight capacity
                // it's possible taking the box would give get a better value
                if (box.weight <= currentCapacity) {

                    // so we check: should we use the box or not?
                    // if we use the box, the most kilograms we can include in addition to the box
                    // we're adding is the current capacity minus the box's weight. we find the max
                    // value at that integer capacity in our array maxValuesAtCapacities
                    long maxValueUsingBox = box.value + maxValuesAtCapacities[currentCapacity - box.weight];

                    // now we see if it's worth taking the box. how does the
                    // value with the box compare to the currentMaxValue?
                    currentMaxValue = Math.max(maxValueUsingBox, currentMaxValue);
                }
            }

            // add each capacity's max value to our array so we can use them
            // when calculating all the remaining capacities
            maxValuesAtCapacities[currentCapacity] = currentMaxValue;
        }

        return maxValuesAtCapacities[weightCapacity];
    }

    class Box {
        int weight;
        int value;
    }

    static class InfinityException extends RuntimeException {
        public InfinityException() {
            super("Max value is infinity!");
        }
    }

}
