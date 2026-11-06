package io.github.diegourban.algorithms.math;

/**
 * Digit-level operations on integers.
 */
public final class Numbers {

    private Numbers() {}

    /**
     * Checks if a number contains a digit
     * <p>
     * The sign of {@code number} is ignored. The number {@code 0} is treated as having no digits, so
     * {@code containsDigit(0, 0)} returns {@code false}.
     *
     * @param number the number to check
     * @param digit  the digit expected to find in the number
     * @return {@code true} if the number contains the digit, {@code false} otherwise
     */
    public static boolean containsDigit(final long number, final long digit) {
        long thisNumber = number >= 0 ? number : -number;
        long thisDigit;

        while (thisNumber != 0) {
            thisDigit = thisNumber % 10; // Always equal to the last digit of thisNumber
            thisNumber = thisNumber
                    / 10; // Always equal to thisNumber with the last digit chopped off, or 0 if thisNumber is less than
            // 10
            if (thisDigit == digit) {
                return true;
            }
        }

        return false;
    }

    /**
     * Checks if a number contains repeating digits
     * <p>
     * Only consecutive repetitions count: {@code 1221} repeats {@code 2} twice, {@code 1212} has no repetition.
     * Zero and negative numbers always return {@code false}, as does a {@code times} below 2.
     *
     * @param number the number
     * @param times  amount of times a digit must repeat
     * @return {@code true} if the number contains a digit repeating consecutively at least the expected amount of
     *     times, {@code false} otherwise
     */
    public static boolean containsRepeatingDigits(final long number, final int times) {
        long theNumber = number;
        Long old = null;
        int reps = 0;

        while (theNumber > 0) {
            final Long n = theNumber % 10;
            theNumber /= 10;
            if (n.equals(old)) {
                if (++reps == times) {
                    return true;
                }
            } else {
                old = n;
                reps = 1;
            }
        }

        return false;
    }

    /**
     * Converts a number to an array of its digits, least significant digit first: {@code 123} becomes
     * {@code [3, 2, 1]}.
     * <p>
     * Intended for non-negative numbers that fit in an {@code int}: each step truncates the number to {@code int}
     * before taking the last digit, so larger values give wrong digits, and a negative number gives negative digits
     * plus an extra trailing {@code 0} for the minus sign.
     *
     * @param number the number to convert
     * @return an array with each digit of the number, in reverse order
     */
    public static int[] toArray(final long number) {
        long theNumber = number;

        final int length = Long.toString(theNumber).length();
        final int[] array = new int[length];

        for (int index = 0; index < length; index++) {
            array[index] = (int) theNumber % 10;
            theNumber /= 10;
        }

        return array;
    }

    /**
     * Find the length of the int using divide and conquer
     * <p>
     * Intended for non-negative numbers: any negative number returns 1.
     *
     * @param number some number
     * @return the number of decimal digits of the number, from 1 to 10
     */
    public static int length(final int number) {
        if (number < 100000) {
            // 5 or less
            if (number < 100) {
                // 1 or 2
                if (number < 10) return 1;
                else return 2;
            } else {
                // 3 or 4 or 5
                if (number < 1000) return 3;
                else {
                    // 4 or 5
                    if (number < 10000) return 4;
                    else return 5;
                }
            }
        } else {
            // 6 or more
            if (number < 10000000) {
                // 6 or 7
                if (number < 1000000) return 6;
                else return 7;
            } else {
                // 8 to 10
                if (number < 100000000) return 8;
                else {
                    // 9 or 10
                    if (number < 1000000000) return 9;
                    else return 10;
                }
            }
        }
    }
}
