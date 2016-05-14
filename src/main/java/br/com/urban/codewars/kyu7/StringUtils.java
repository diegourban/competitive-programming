package br.com.urban.codewars.kyu7;

public class StringUtils {

	public static boolean isLetter(String s) {
		return s != null && s.length() == 1 && Character.isLetter(s.charAt(0));
	}

}
