package urban.common.math;

public class Numbers {

    /**
     * Checks if a number contains a digit
     *
     * @param number the number to check
     * @param digit  the digit expected to find in the number
     * @return true if the number contains the digit, false otherwise
     */
    public static boolean containsDigit(long number, long digit) {
        long thisNumber = number >= 0 ? number : -number;
        long thisDigit;

        while (thisNumber != 0) {
            thisDigit = thisNumber % 10; // Always equal to the last digit of thisNumber
            thisNumber = thisNumber / 10; // Always equal to thisNumber with the last digit chopped off, or 0 if thisNumber is less than 10
            if (thisDigit == digit) {
                return true;
            }
        }

        return false;
    }

    /**
     * Checks if a number contains repeating digits
     *
     * @param number the number
     * @param times  amount of times a digit must repeat
     * @return true if the number contains a digit repeating at least the expected amount of times, false otherwise
     */
    public static boolean containsRepeatingDigits(final long number, final int times) {
        long theNumber = number;
        Long old = null;
        int reps = 0;

        while (theNumber > 0) {
            Long n = theNumber % 10;
            theNumber /= 10;
            if (n == old) {
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
     * Converts a number to an array
     *
     * @param number the number to convert
     * @return an array with each digit of the number
     */
    public static int[] toArray(long number) {
        int length = Long.toString(number).length();
        int[] array = new int[length];

        for (int index = 0; index < length; index++) {
            array[index] = (int) number % 10;
            number /= 10;
        }

        return array;
    }

}
