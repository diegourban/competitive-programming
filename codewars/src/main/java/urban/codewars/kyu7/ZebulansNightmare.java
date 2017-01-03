package urban.codewars.kyu7;

import java.util.StringJoiner;

public class ZebulansNightmare {

	public static String zebulansNightmare(final String functionName) {
		String[] splitted = functionName.split("_");
		StringJoiner joiner = new StringJoiner("");
		joiner.add(splitted[0]);
		for(int i = 1; i < splitted.length; i++) {
			joiner.add(Character.toUpperCase(splitted[i].charAt(0)) + splitted[i].substring(1, splitted[i].length()));
		}
		return joiner.toString();
	}

}
