package urban.uri_online_judge.beginner._1060;

import java.io.IOException;
import java.io.InputStream;

import urban.uri_online_judge.Reader;

/**
 * Positive Numbers
 * 
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1060
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
		int total = 0;
		for (int i = 0; i < 6; i++) {
			double d = reader.nextDouble();
			if (d >= 0) {
				total++;
			}
		}
		reader.close();

		return total + " valores positivos" + System.lineSeparator();
	}

}
