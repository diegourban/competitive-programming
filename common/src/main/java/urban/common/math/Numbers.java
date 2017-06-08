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
     * Converts a number to an array
     *
     * @param number the number to convert
     * @return an array with each digit of the number
     */
    public static int[] toArray(final long number) {
        long theNumber = number;

        int length = Long.toString(theNumber).length();
        int[] array = new int[length];

        for (int index = 0; index < length; index++) {
            array[index] = (int) theNumber % 10;
            theNumber /= 10;
        }

        return array;
    }

    /**
     * Find the length of the int using divide and conquer
     *
     * @param number some number
     * @return the length of the number
     */
    public static int length(int number) {
        if (number < 100000){
            // 5 or less
            if (number < 100){
                // 1 or 2
                if (number < 10)
                    return 1;
                else
                    return 2;
            }else{
                // 3 or 4 or 5
                if (number < 1000)
                    return 3;
                else{
                    // 4 or 5
                    if (number < 10000)
                        return 4;
                    else
                        return 5;
                }
            }
        } else {
            // 6 or more
            if (number < 10000000) {
                // 6 or 7
                if (number < 1000000)
                    return 6;
                else
                    return 7;
            } else {
                // 8 to 10
                if (number < 100000000)
                    return 8;
                else {
                    // 9 or 10
                    if (number < 1000000000)
                        return 9;
                    else
                        return 10;
                }
            }
        }
    }

}
