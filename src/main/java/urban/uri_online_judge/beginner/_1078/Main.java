package urban.uri_online_judge.beginner._1078;

import java.io.IOException;
import java.io.InputStream;

import urban.uri_online_judge.Reader;

/**
 * Multiplication Table
 * 
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1078
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
		for (int i = 1; i <= 10; i++) {
			sb.append(i).append(" x ").append(n).append(" = ").append(i * n).append(System.lineSeparator());
		}

		return sb.toString();
	}

}