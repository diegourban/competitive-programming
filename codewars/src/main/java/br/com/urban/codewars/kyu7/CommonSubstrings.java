package br.com.urban.codewars.kyu7;

public class CommonSubstrings {

	public static boolean substringTest(String str1, String str2) {
		String str1Lower = str1.toLowerCase();
		String str2Lower = str2.toLowerCase();
		for(int i = 0; i < str1Lower.length()-1; i++) {
			String substring = str1Lower.substring(i, i+2);
			if(str2Lower.contains(substring)) {
				return true;
			}
		}
		return false;
	}

}
