package br.com.urban.codewars.kyu6;

public class PlayPass {
	
	public static String playPass(String s, int n) {
		String result = shiftLetters(s, n);
		result = replaceDigits(result);
		result = downCaseInOdds(result);
		result = reverse(result);
		return result;
	}
	
	private static String shiftLetters(String value, int numberOfTimes) {
		char[] toEncode = value.toCharArray();
		for (int i = 0; i < toEncode.length; i++) {
	        if (Character.isLetter(toEncode[i])) {
	        	if(toEncode[i] >= 65 && toEncode[i] <= 91) {
	        		toEncode[i] = (char) ((((toEncode[i]-65) + numberOfTimes) % 26) + 65);
	        	}
	        	if(toEncode[i] >= 97 && toEncode[i] <= 123) {
	        		toEncode[i] = (char) ((((toEncode[i]-97) + numberOfTimes) % 26) + 97);
	        	}
	        }
	    }
	    value = String.valueOf(toEncode);
	    return value;
	}
	
	private static String replaceDigits(String value) {
		char[] toReplace = value.toCharArray();
		for (int i = 0; i < toReplace.length; i++) {
	        if (Character.isDigit(toReplace[i])) {
	            toReplace[i] = Character.forDigit(Math.abs((Character.digit(toReplace[i], 10) - 9)),10);
	        }
	    }
	    value = String.valueOf(toReplace);
	    return value;
	}
	
	private static String downCaseInOdds(String value) {
		char[] toReplace = value.toCharArray();
		for (int i = 0; i < toReplace.length; i++) {
	        if (Character.isLetter(toReplace[i]) && i % 2 == 1) {
	        	toReplace[i] = Character.toLowerCase(toReplace[i]);
	        }
	    }
	    value = String.valueOf(toReplace);
	    return value;
	}
	
	private static String reverse(String value) {
		return new StringBuilder(value).reverse().toString();
	}

}
