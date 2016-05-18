package br.com.urban.codewars.kyu8;

import java.util.StringJoiner;

public class SmashWords {

	public static String smash(String... words) {
		if(words == null) {
			return null;
		}
		StringJoiner joiner = new StringJoiner(" ");
		for(String word : words) {
			joiner.add(word);
		}
		return joiner.toString();
	}

}
