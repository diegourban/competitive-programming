package br.com.urban.codewars.kyu6;

public class PlayPass {
	
	/*
	 * 
	 * Everyone knows passphrases. One can choose passphrases from poems, songs, movies names and so on but frequently they can be guessed due to common cultural references. You can get your passphrases stronger by different means. One is the following:

choose a text in capital letters including or not digits and non alphabetic characters,

shift each letter by a given number but the transformed letter must be a letter (circular shift),
replace each digit by its complement to 9,
keep such as non alphabetic and non digit characters,
downcase each letter in odd position, upcase each letter in even position (the first character is in position 0),
reverse the whole result.
Example:

your text: "BORN IN 2015!", shift 1

1 + 2 + 3 -> "CPSO JO 7984!"

4 "CpSo jO 7984!"

5 "!4897 Oj oSpC"

With longer passphrases it's better to have a small and easy program. Would you write it?

https://en.wikipedia.org/wiki/Passphrase
	 */
	
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
	            toEncode[i] += n;
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
