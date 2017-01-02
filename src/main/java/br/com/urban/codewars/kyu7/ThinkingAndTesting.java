package br.com.urban.codewars.kyu7;

public class ThinkingAndTesting {

	public static String testIncompleteString(String s) {
		if (s.isEmpty() || s.length() == 1) {
			return s;
		}
		return s.substring(0, s.length() / 2);
	}

}
