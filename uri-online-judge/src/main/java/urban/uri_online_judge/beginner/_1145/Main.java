package urban.uri_online_judge.beginner._1145;

import java.io.IOException;
import java.io.InputStream;

import urban.common.Reader;

/**
 * Logical Sequence 2
 * 
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1145
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

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= y; i++) {
			sb.append(i);
			if (i % x == 0) {
				sb.append(System.lineSeparator());
			} else {
				if (i < y) {
					sb.append(" ");
				} else {
					sb.append(System.lineSeparator());
				}
			}
		}

		return sb.toString();
	}
}
