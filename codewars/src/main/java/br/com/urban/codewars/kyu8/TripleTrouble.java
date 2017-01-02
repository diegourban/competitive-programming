package br.com.urban.codewars.kyu8;

public class TripleTrouble {

	public static String tripleTrouble(String one, String two, String three) {
		String result = "";
		for(int	i = 0; i < one.length(); i++) {
			result += String.valueOf(one.charAt(i)) + String.valueOf(two.charAt(i)) + String.valueOf(three.charAt(i));
		}
		return result;
	}

}
