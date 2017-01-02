package br.com.urban.codewars.kyu6;

/*
 * https://www.codewars.com/kata/triple-trouble-1
 */
public class TripleTrouble {

	public static int tripleDouble(long num1, long num2) {
		return containsRepeatingDigits(num1, 3) && containsRepeatingDigits(num2, 2) ? 1 : 0;
	}

	private static boolean containsRepeatingDigits(long num, int times) {
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
}