package urban.codewars.kyu7;

public class CompareSumChar {

	public static Boolean compare(String firstString, String secondString) {
		if(firstString == null || !containsOnlyLetters(firstString)) firstString = "";
		if(secondString == null || !containsOnlyLetters(secondString)) secondString = "";
		
		int s1Sum = sumChars(firstString);
		int s2Sum = sumChars(secondString);
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
