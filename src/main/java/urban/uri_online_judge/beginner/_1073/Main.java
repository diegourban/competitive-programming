package urban.uri_online_judge.beginner._1073;

import java.io.IOException;
import java.io.InputStream;

import urban.uri_online_judge.Reader;

/**
 * Even Square
 * 
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1073
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
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				sb.append(i).append("^").append(2).append(" = ").append(i * i).append(System.lineSeparator());
			}
		}

		return sb.toString();
	}

}
