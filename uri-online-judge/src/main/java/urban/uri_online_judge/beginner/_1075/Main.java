package urban.uri_online_judge.beginner._1075;

import java.io.IOException;
import java.io.InputStream;

import urban.common.Reader;

/**
 * Remaining 2
 * 
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1075
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
		reader.close();

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= 10000; i++) {
			if (i % n == 2) {
				sb.append(i).append(System.lineSeparator());
			}
		}

		return sb.toString();
	}

}
