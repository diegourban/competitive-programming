package br.com.urban.codewars.kyu8;

public class MiddleCharacter {
	public static String getMiddle(String word) {
		if(word.isEmpty()) {
			return "";
		}
		int middleIndex = word.length()/2;
		return word.substring(middleIndex - (word.length() % 2 == 1 ? 0 : 1), middleIndex+1);
	}
}
