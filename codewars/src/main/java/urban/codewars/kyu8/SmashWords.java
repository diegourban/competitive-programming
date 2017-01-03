package urban.codewars.kyu8;

import java.util.StringJoiner;

public class SmashWords {

	public static String smash(String... words) {
		StringJoiner joiner = new StringJoiner(" ");
		for(String word : words) {
			joiner.add(word);
		}
		return joiner.toString();
	}

}
