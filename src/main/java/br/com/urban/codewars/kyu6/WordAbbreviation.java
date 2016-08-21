package br.com.urban.codewars.kyu6;

public class WordAbbreviation {

	public String abbreviate(String string) {
		if (string.length() <= 4) {
			return string;
		}

		StringBuilder result = new StringBuilder();

		String[] words = string.split(" ");
		for (String word : words) {
			result = result.append(abbreviateWord(word));
			result = result.append('-');
		}
		result = result.deleteCharAt(result.length() - 1);
		return result.toString();
	}

	private String abbreviateWord(String word) {
		return Character.toString(word.charAt(0)) + String.valueOf(word.length() - 2)
				+ Character.toString(word.charAt(word.length() - 1));
	}

}
