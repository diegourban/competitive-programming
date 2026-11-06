package io.github.diegourban.algorithms.math;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/**
 * Number sequences.
 */
public final class Sequences {

    private Sequences() {}

    /**
     * Calculates the nth Fibonacci number.
     * Works with n &lt;= 46; larger values overflow {@code int} silently and return a wrong result.
     * <p>
     * Solution: Using a bottom-up approach, starting with the 0th fibonacci number and iteratively computing subsequent numbers until we get to n.
     * <p>
     * Complexity: O(n) time and O(1) space.
     *
     * @param n the nth number in the Fibonacci sequence to calculate, with {@code fibonacci(0) == 0}
     * @return the nth Fibonacci number
     * @throws IllegalArgumentException if {@code n} is negative
     */
    public static int fibonacci(final int n) {
        // edge cases:
        if (n < 0) {
            throw new IllegalArgumentException("Index was negative. No such thing as a negative index in a series.");
        } else if (n == 0 || n == 1) {
            return n;
        }

        // we'll be building the fibonacci series from the bottom up
        // so we'll need to track the previous 2 numbers at each step
        int prevPrev = 0; // 0th fibonacci
        int prev = 1; // 1st fibonacci
        int current = 0; // Declare and initialize current

        for (int i = 1; i < n; i++) {

            // Iteration 1: current = 2nd fibonacci
            // Iteration 2: current = 3rd fibonacci
            // Iteration 3: current = 4th fibonacci
            // To get nth fibonacci ... do n-1 iterations.
            current = prev + prevPrev;
            prevPrev = prev;
            prev = current;
        }

        return current;
    }

    /**
     * Calculates the nth Fibonacci number.
     * Works with n &lt;= 67
     * <p>
     * Uses Binet's formula in {@code double} arithmetic, so the result is approximate (for example
     * {@code 55.000000000000014} for n = 10). Rounded with {@link Math#round(double)}, it equals the exact value for
     * 0 &lt;= n &lt;= 67. Negative {@code n} is not rejected and gives a meaningless result.
     *
     * @param n the nth number in the Fibonacci sequence to calculate
     * @return an approximation of the nth Fibonacci number
     */
    public static double fibonacciSimpleBinetFormula(final int n) {
        if (n == 0) {
            return 0;
        }
        final double phi = (1 + Math.sqrt(5)) / 2;
        final double sqrt5 = Math.sqrt(5);
        return ((Math.pow(phi, n) - Math.pow(-phi, -n)) / sqrt5);
    }

    /**
     * Calculates the nth Fibonacci number.
     * Works with n &lt;= 71
     * <p>
     * Uses Binet's formula, with the powers computed in {@code double} and the subtraction and division done in
     * {@link BigDecimal}. The result is exact for 0 &lt;= n &lt;= 71 and drifts from the true value after that.
     * Negative {@code n} is not rejected and gives a meaningless result.
     *
     * @param n the nth number in the Fibonacci sequence to calculate
     * @return the nth Fibonacci number
     */
    public static BigInteger fibonacciBinetFormula(final int n) {
        if (n == 0) {
            return new BigInteger("0");
        }
        if (n == 1 || n == 2) {
            return new BigInteger("1");
        }
        if (n == 3) {
            return new BigInteger("2");
        }

        final double phi = (1 + Math.sqrt(5)) / 2;
        final BigDecimal sqrt5 = BigDecimal.valueOf(Math.sqrt(5));

        final BigDecimal pow = BigDecimal.valueOf(Math.pow(phi, n));
        final BigDecimal powInvrt = BigDecimal.valueOf(Math.pow(-phi, -n));
        return pow.subtract(powInvrt).divide(sqrt5, RoundingMode.HALF_UP).toBigInteger();
    }
}
