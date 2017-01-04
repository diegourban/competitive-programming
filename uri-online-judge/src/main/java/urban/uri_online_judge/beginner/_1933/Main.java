package urban.uri_online_judge.beginner._1933;

import java.io.IOException;
import java.io.InputStream;

import urban.common.Reader;

/**
 * Tri-du
 * 
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1933
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

		if (a > b) {
			return a + System.lineSeparator();
		} else if (b > a) {
			return b + System.lineSeparator();
		}

		return a + System.lineSeparator();
	}

}