package br.com.urban.codewars.kyu8;

public class Slope {

	public String slope(int[] points) {
		try {
			return String.valueOf((points[3] - points[1]) / (points[2] - points[0]));
		} catch (ArithmeticException e) {
			return "undefined";
		}
	}

}
