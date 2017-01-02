package urban.uri_online_judge.beginner._1074;

import java.io.IOException;
import java.io.InputStream;

import urban.uri_online_judge.Reader;

/**
 * Even or Odd
 * 
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1074
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
			if (x == 0) {
				sb.append("NULL");
			} else {
				if (x % 2 == 0) {
					sb.append("EVEN ");
				} else {
					sb.append("ODD ");
				}

				if (x > 0) {
					sb.append("POSITIVE");
				} else {
					sb.append("NEGATIVE");
				}
			}
			sb.append(System.lineSeparator());
		}
		reader.close();

		return sb.toString();
	}

}
