package urban.codewars.kyu7;

import java.util.Arrays;

public class Ordering {
	public String orderWord(String s) {
		if(s == null || s.isEmpty()) {
			return "Invalid String!";
		}
		char[] charArray = s.toCharArray();
		Arrays.sort(charArray);
		return String.valueOf(charArray);
	}

}
