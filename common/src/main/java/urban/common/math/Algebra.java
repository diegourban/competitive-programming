package urban.common.math;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.*;

public class Algebra {

    /**
     * Least common multiple (lcm) of two numbers.
     *
     * @param a
     * @param b
     * @return The least common multiple of two numbers.
     */
    public static long lcm(long a, long b) {
        return a * (b / gcdLoop(a, b));
    }

    /**
     * Least common multiple (lcm) of an array of numbers.
     *
     * @param input array of numbers
     * @return The least common multiple of an array of numbers.
     */
    public static long lcm(long[] input) {
        long result = input[0];
        for (int i = 1; i < input.length; i++)
            result = lcm(result, input[i]);
        return result;
    }

    /**
     * Greatest common divisor (gdc) of two numbers using while strategy.
     * <p>
     * Also known as greatest common factor (gcf), highest common factor (hcf),
     * greatest common measure (gcm) or highest common divisor
     *
     * @param a
     * @param b
     * @return The greatest common divisor of two numbers.
     */
    public static long gcdLoop(final long a, final long b) {
        long gcd = a;
        long bNumber = b;
        while (bNumber > 0) {
            long temp = bNumber;
            bNumber = gcd % bNumber; // % is remainder
            gcd = temp;
        }
        return gcd;
    }

    /**
     * Greatest common divisor (gdc) of two numbers using recursive strategy.
     * <p>
     * Also known as greatest common factor (gcf), highest common factor (hcf),
     * greatest common measure (gcm) or highest common divisor
     *
     * @param a
     * @param b
     * @return The greatest common divisor of two numbers.
     */
    public static long gcdRecursive(long a, long b) {
        return b == 0 ? a : gcdRecursive(b, a % b);
    }

    /**
     * Checks if a number is prime.
     * <p>
     * Based on https://en.wikipedia.org/wiki/Primality_test
     *
     * @param n
     * @return true if the number n is prime, false otherwise
     */
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        } else if (n <= 3) {
            return true;
        } else if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        int i = 5;
        while (i * i <= n) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
            i += 6;
        }

        return true;
    }

    /**
     * Lists the prime factors of a number.
     *
     * @param number
     * @return The list of prime factors of a number.
     */
    public static List<Integer> primeFactorsList(int number) {
        List<Integer> factors = new ArrayList<>();
        fillPrimeFactors(number, factors);
        return factors;
    }

    /**
     * Build the set of prime factors of a number.
     *
     * @param number
     * @return The set of prime factors of a number.
     */
    public static Set<Integer> primeFactorsSet(int number) {
        Set<Integer> factors = new HashSet<>();
        fillPrimeFactors(number, factors);
        return factors;
    }

    /**
     * Fill the collection with the prime factors of a number
     *
     * @param number  the number to extract the prime factors
     * @param factors the collection to fill with the prime factors
     */
    private static void fillPrimeFactors(int number, Collection<Integer> factors) {
        int n = number;
        for (int i = 2; i <= n / i; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        if (n > 1) {
            factors.add(n);
        }
    }

    /**
     * Calculates the nth Fibonacci number.
     * Works with n <= 67
     *
     * @param n the nth number in the Fibonacci sequence to calculate
     * @return the nth Fibonacci number
     */
    public static double simpleFibonacciBinetFormula(int n) {
        if (n == 0) {
            return 0;
        }
        final double phi = (1 + Math.sqrt(5)) / 2;
        final double sqrt5 = Math.sqrt(5);
        return ((Math.pow(phi, n) - Math.pow(-phi, -n)) / sqrt5);
    }

    /**
     * Calculates the nth Fibonacci number.
     * Works with n <= 71
     *
     * @param n the nth number in the Fibonacci sequence to calculate
     * @return the nth Fibonacci number
     */
    public static BigInteger fibonacciBinetFormula(int n) {
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
        BigDecimal sqrt5 = new BigDecimal(Math.sqrt(5));

        BigDecimal pow = new BigDecimal(Math.pow(phi, n));
        BigDecimal powInvrt = new BigDecimal(Math.pow(-phi, -n));
        return pow.subtract(powInvrt).divide(sqrt5, RoundingMode.HALF_UP).toBigInteger();
    }

}
