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

}
