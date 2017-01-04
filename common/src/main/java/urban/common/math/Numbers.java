package urban.common.math;

public class Numbers {

    public static boolean containsDigit(long number, long digit) {
        long thisNumber = number >= 0 ? number : -number; // ?: => Conditional Operator
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

    public static boolean containsRepeatingDigits(long num, int times) {
        Long old = null;
        int reps = 0;

        while (num > 0) {
            Long n = num % 10;
            num /= 10;
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
