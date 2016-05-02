package br.com.urban.codewars.kyu8;

public class StringyStrings {

	public static String stringy(int size) {
		boolean isTrue = true;
		String result = "";
		for(int i = 0; i < size; i++) {
			result += String.valueOf(isTrue ? 1 : 0);
			isTrue = !isTrue;
		}
		return result;
	}

}
