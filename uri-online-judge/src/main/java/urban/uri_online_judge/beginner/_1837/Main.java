package urban.uri_online_judge.beginner._1837;

import java.io.IOException;
import java.io.InputStream;

import urban.uri_online_judge.Reader;

/**
 * Preface
 * 
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1837
 * 
 * @author Diego Leonardo Urban
 *
 */
public class Main {

	public static void main(String[] args) throws IOException {
		System.out.print(main(System.in));
	}

	protected static String main(InputStream input) throws IOException {
		Reader reader = new Reader(input);
		int a = reader.nextInt();
		int b = reader.nextInt();
		reader.close();

		int[] result = divide(a, b);

		return result[0] + " " + result[1] + System.lineSeparator();
	}

	private static final int[] divide(int n, int d) {
		if (d == 0) {
			throw new IllegalArgumentException("division by zero");
		}

		if (d < 0) {
			int[] result = divide(n, d * -1);
			result[0] = result[0] * -1;
			return result;
		}

		if (n < 0) {
			int[] result = divide(-n, d);
			result[0] = result[0] * -1;
			if (result[1] == 0) {
				result[1] = 0;
				return result;
			} else {
				result[0] = result[0] - 1;
				result[1] = d - result[1];
				return result;
			}
		}

		// At this point, n ≥ 0 and d > 0
		int q = 0, r = n;
		while (r >= d) {
			q++;
			r = r - d;
		}

		return new int[] { q, r };
	}

}
