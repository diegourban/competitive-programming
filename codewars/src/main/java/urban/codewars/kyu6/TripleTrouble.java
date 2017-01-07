package urban.codewars.kyu6;

/*
 * https://www.codewars.com/kata/triple-trouble-1
 */
public class TripleTrouble {

    public static int tripleDouble(long num1, long num2) {
        return containsRepeatingDigits(num1, 3) && containsRepeatingDigits(num2, 2) ? 1 : 0;
    }

    private static boolean containsRepeatingDigits(final long num, final int times) {
        long number = num;
        Long old = null;
        int reps = 0;

        while (number > 0) {
            Long n = number % 10;
            number /= 10;
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
}