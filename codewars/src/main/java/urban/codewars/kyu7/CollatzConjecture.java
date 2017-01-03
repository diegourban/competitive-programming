package urban.codewars.kyu7;

public class CollatzConjecture {

	public static long conjecture(long x) {
		if (x == 1) {
			return 1;
		}
		if (x % 2 == 0) {
			return 1 + conjecture(x / 2);
		} else {
			return 1 + conjecture(x * 3 + 1);
		}
	}

}
