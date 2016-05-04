package br.com.urban.codewars.kyu8;

public class HowDoICompare {

	private static final Object[][] specialNumbers = { { 42, "everything" }, { 42 * 42, "everything squared" }, };

	public static String whatIs(Integer x) {
		for (Object[] p : specialNumbers) {
			if ((int) p[0] == x)
				return (String) p[1];
		}
		return "nothing";
	}

}
