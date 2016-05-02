package br.com.urban.codewars.kyu8;

public class Formatting {

	public static double TwoDecimalPlaces(double number) {
		final long factor = 100;
		long tmp = Math.round(number * factor);
		return (double) tmp / factor;
	}

}
