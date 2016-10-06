package br.com.urban.codewars.kyu5;

/**
 * https://www.codewars.com/kata/common-denominators
 *
 */
public class CommonDenominators {

	public static String convertFrac(long[][] lst) {
		if(lst.length == 0) {
			return "";
		}
		
		final long lcm = lcm(lst);

		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < lst.length; i++) {
			builder.append("(" + lst[i][0] * (lcm / lst[i][1]) + "," + lcm + ")");
		}

		return builder.toString();
	}

	private static long lcm(long[][] input) {
		long result = input[0][1];
		for (int i = 1; i < input.length; i++)
			result = lcm(result, input[i][1]);
		return result;
	}

	private static long lcm(long a, long b) {
		return a * (b / gcd(a, b));
	}

	private static long gcd(long a, long b) {
		while (b > 0) {
			long temp = b;
			b = a % b; // % is remainder
			a = temp;
		}
		return a;
	}

}
