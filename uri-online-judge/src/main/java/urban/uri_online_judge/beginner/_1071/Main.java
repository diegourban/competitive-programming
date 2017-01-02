package urban.uri_online_judge.beginner._1071;

import java.io.IOException;
import java.io.InputStream;

import urban.uri_online_judge.Reader;

/**
 * Sum of Consecutive Odd Numbers I
 * 
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1071
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
		int x = reader.nextInt();
		int y = reader.nextInt();
		reader.close();

		int bggr = 0;
		int smllr = 0;

		if (x > y) {
			bggr = x;
			smllr = y;
		} else {
			bggr = y;
			smllr = x;
		}

		int sum = 0;

		for (int i = smllr + 1; i < bggr; i++) {
			if (i % 2 != 0) {
				sum += i;
			}
		}

		return sum + System.lineSeparator();
	}
}
