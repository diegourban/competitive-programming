package br.com.urban.codewars.kyu7;

public class CompareSumChar {

	public static Boolean compare(String s1, String s2) {
		if(s1 == null || !containsOnlyLetters(s1)) s1 = "";
		if(s2 == null || !containsOnlyLetters(s2)) s2 = "";
		
		int s1Sum = sumChars(s1);
		int s2Sum = sumChars(s2);
		return s1Sum == s2Sum;
	}
	
	private static boolean containsOnlyLetters(String s) {
		return s.matches("[a-zA-Z]+");
	}
	
	private static int sumChars(String s) {
		int sum = 0;
		for(char ch : s.toUpperCase().toCharArray()) {
			sum += ch;
		}
		return sum;
	}

}
