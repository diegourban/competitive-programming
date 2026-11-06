package io.github.diegourban.algorithms.math;

import java.util.*;

/**
 * Number theory: greatest common divisor, least common multiple, primality and prime factorisation.
 */
public final class NumberTheory {

    private NumberTheory() {}

    /**
     * Least common multiple (lcm) of two numbers.
     * <p>
     * Computed as {@code a * (b / gcdLoop(a, b))}; intended for positive numbers. The result overflows silently if it
     * does not fit in a {@code long}.
     *
     * @param a the first number
     * @param b the second number
     * @return The least common multiple of two numbers.
     * @throws ArithmeticException if both {@code a} and {@code b} are zero
     */
    public static long lcm(final long a, final long b) {
        return a * (b / gcdLoop(a, b));
    }

    /**
     * Least common multiple (lcm) of an array of numbers.
     *
     * @param input array of numbers; must not be empty
     * @return The least common multiple of an array of numbers; the element itself for a one-element array.
     * @throws ArrayIndexOutOfBoundsException if {@code input} is empty
     * @see #lcm(long, long)
     */
    public static long lcm(final long[] input) {
        long result = input[0];
        for (int i = 1; i < input.length; i++) result = lcm(result, input[i]);
        return result;
    }

    /**
     * Greatest common divisor (gdc) of two numbers using while strategy.
     * <p>
     * Also known as greatest common factor (gcf), highest common factor (hcf),
     * greatest common measure (gcm) or highest common divisor
     * <p>
     * Correct for non-negative input. The loop only runs while {@code b} is positive, so a negative {@code b}
     * returns {@code a} unchanged; {@code gcdLoop(a, 0)} returns {@code a}.
     *
     * @param a the first number
     * @param b the second number
     * @return The greatest common divisor of two numbers.
     */
    public static long gcdLoop(final long a, final long b) {
        long gcd = a;
        long bNumber = b;
        while (bNumber > 0) {
            final long temp = bNumber;
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
     * <p>
     * Correct for non-negative input. Negative input is accepted, but the result may be negative (Java's {@code %}
     * keeps the sign of the dividend), so it can differ in sign from {@link #gcdLoop(long, long)}.
     *
     * @param a the first number
     * @param b the second number
     * @return The greatest common divisor of two numbers; {@code a} if {@code b} is zero.
     */
    public static long gcdRecursive(final long a, final long b) {
        return b == 0 ? a : gcdRecursive(b, a % b);
    }

    /**
     * Checks if a number is prime.
     * <p>
     * Based on https://en.wikipedia.org/wiki/Primality_test
     * <p>
     * Trial division by 2, 3 and numbers of the form 6k ± 1 up to the square root of {@code n}: O(√n) time.
     *
     * @param n the number to test
     * @return {@code true} if the number n is prime, {@code false} otherwise (including for {@code n <= 1})
     */
    public static boolean isPrime(final int n) {
        if (n <= 1) {
            return false;
        } else if (n <= 3) {
            return true;
        } else if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        int i = 5;
        while (i <= n / i) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
            i += 6;
        }

        return true;
    }

    /**
     * Lists the prime factors of a number.
     * <p>
     * Uses trial division up to the square root of {@code number}: O(√n) time.
     *
     * @param number the number to factorise
     * @return The list of prime factors of a number, in ascending order and repeated by multiplicity (12 gives
     *     {@code [2, 2, 3]}); empty for numbers below 2.
     */
    public static List<Integer> primeFactorsList(final int number) {
        final List<Integer> factors = new ArrayList<>();
        fillPrimeFactors(number, factors);
        return factors;
    }

    /**
     * Build the set of prime factors of a number.
     *
     * @param number the number to factorise
     * @return The set of distinct prime factors of a number (12 gives {@code {2, 3}}), in no particular order;
     *     empty for numbers below 2.
     * @see #primeFactorsList(int)
     */
    public static Set<Integer> primeFactorsSet(final int number) {
        final Set<Integer> factors = new HashSet<>();
        fillPrimeFactors(number, factors);
        return factors;
    }

    /**
     * Fill the collection with the prime factors of a number
     *
     * @param number  the number to extract the prime factors
     * @param factors the collection to fill with the prime factors
     */
    private static void fillPrimeFactors(final int number, final Collection<Integer> factors) {
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
}
