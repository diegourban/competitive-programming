package urban.uri_online_judge.beginner._1150;

import java.io.IOException;
import java.io.InputStream;

import urban.uri_online_judge.Reader;

/**
 * Exceeding Z
 * 
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1150
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
		int z = reader.nextInt();
		while (z < x) {
			z = reader.nextInt();
		}
		reader.close();

		int count = 1;
		for (int sum = x; sum <= z; x++, sum += x) {
			count++;
		}

		return count + System.lineSeparator();
	}

}
