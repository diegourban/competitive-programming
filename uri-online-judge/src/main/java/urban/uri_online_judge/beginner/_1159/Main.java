package urban.uri_online_judge.beginner._1159;

import java.io.IOException;
import java.io.InputStream;

import urban.uri_online_judge.Reader;

/**
 * Sum of Consecutive Even Numbers
 * 
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1159
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

		while (n != 0) {
			if (n % 2 != 0) {
				n++;
			}
			long sum = 0;
			for (int i = 1; i <= 5; i++) {
				sum += n;
				n += 2;
			}
			sb.append(sum).append(System.lineSeparator());

			n = reader.nextInt();
		}
		reader.close();

		return sb.toString();
	}

}
