package br.com.urban.codewars.kyu8;

public class NoBoring {

	public static int noBoringZeros(int value) {
		String nStr = String.valueOf(value);
		nStr = nStr.replaceAll("0+$", "");
		if (nStr.isEmpty()) {
			return 0;
		}
		return Integer.valueOf(nStr);
	}

	public static int noBoringZerosBestPractice(int value) {
		if (value == 0) {
			return value;
		}

		while (value % 10 == 0) {
			value /= 10;
		}

		return value;
	}

}
