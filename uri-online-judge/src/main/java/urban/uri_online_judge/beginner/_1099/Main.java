package urban.uri_online_judge.beginner._1099;

import java.io.IOException;
import java.io.InputStream;

import urban.uri_online_judge.Reader;

/**
 * Sum of Consecutive Odd Numbers II
 * 
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1099
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
		int n = reader.nextInt();

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++) {
			int x = reader.nextInt();
			int y = reader.nextInt();

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

			for (int j = smllr + 1; j < bggr; j++) {
				if (j % 2 != 0) {
					sum += j;
				}
			}
			sb.append(sum).append(System.lineSeparator());
		}
		reader.close();

		return sb.toString();
	}

}
