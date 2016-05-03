package br.com.urban.codewars.kyu6;

public class PlayPass {
	
	public static String playPass(String s, int n) {
		String result = shiftLetters(s, n);
		result = replaceDigits(result);
		result = downCaseInOdds(result);
		result = reverse(result);
		return result;
	}
	
	private static String shiftLetters(String s, int n) {
		char[] toEncode = s.toCharArray();
		for (int i = 0; i < toEncode.length; i++) {
	        if (Character.isLetter(toEncode[i])) {
	        	if(toEncode[i] >= 65 && toEncode[i] <= 91) {
	        		toEncode[i] = (char) ((((toEncode[i]-65) + n) % 26) + 65);
	        	}
	        	if(toEncode[i] >= 97 && toEncode[i] <= 123) {
	        		toEncode[i] = (char) ((((toEncode[i]-97) + n) % 26) + 97);
	        	}
	        	if(toEncode[i] >= 48 && toEncode[i] <= 58) {
	        		toEncode[i] = (char) Math.abs(9 - toEncode[i]);
	        	}
	        }
	    }
	    s = String.valueOf(toEncode);
	    return s;
	}
	
	private static String replaceDigits(String s) {
		char[] toReplace = s.toCharArray();
		for (int i = 0; i < toReplace.length; i++) {
	        if (Character.isDigit(toReplace[i])) {
	            toReplace[i] = Character.forDigit(Math.abs((Character.digit(toReplace[i], 10) - 9)),10);
	        }
	    }
	    s = String.valueOf(toReplace);
	    return s;
	}
	
	private static String downCaseInOdds(String s) {
		char[] toReplace = s.toCharArray();
		for (int i = 0; i < toReplace.length; i++) {
	        if (Character.isLetter(toReplace[i])) {
	        	if(i % 2 == 1) {
	        		toReplace[i] = Character.toLowerCase(toReplace[i]);
	        	}
	        }
	    }
	    s = String.valueOf(toReplace);
	    return s;
	}
	
	private static String reverse(String s) {
		return new StringBuilder(s).reverse().toString();
	}

}
