package io.github.diegourban.algorithms.math;

import java.math.BigInteger;

/**
 * Combinatorics: binomial coefficients.
 */
public final class Combinatorics {

    private Combinatorics() {}

    /**
     * Binomial coefficient "n choose m", read from Pascal's Triangle
     * <pre>
     * 1
     * 1 1
     * 1 2 1
     * 1 3 3 1
     * 1 4 6 4 1
     * </pre>
     * <p>
     * Builds row {@code n} of the triangle with exact {@link BigInteger} arithmetic: O(n²) time and O(n) space.
     * <p>
     * Solution extracted and adapted from
     * http://www.brpreiss.com/books/opus5/html/page460.html.
     *
     * @param n the row number (0-indexed)
     * @param m the column number (0-indexed)
     * @return the number of ways to choose {@code m} items out of {@code n}; zero if {@code m} is negative or greater
     *     than {@code n}
     */
    public static BigInteger binomialCoefficient(final int n, final int m) {
        if (m < 0 || m > n) {
            return BigInteger.ZERO;
        }

        if (m == 0 || m == n) {
            return BigInteger.ONE;
        }

        if (m == 1 || m == n - 1) {
            return BigInteger.valueOf(n);
        }

        final BigInteger[] binomials = new BigInteger[n + 1];
        binomials[0] = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            binomials[i] = BigInteger.ONE;
            for (int j = i - 1; j > 0; --j) {
                binomials[j] = binomials[j].add(binomials[j - 1]);
            }
        }

        return binomials[m];
    }
}
