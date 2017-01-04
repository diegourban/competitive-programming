package urban.uri_online_judge.beginner._1864;

import java.io.IOException;
import java.io.InputStream;

import urban.common.Reader;

/**
 * Our Days Are Never Coming Back
 * 
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1864
 * 
 * @author Diego Leonardo Urban
 *
 */
public class Main {

	private static final String QUOTE = "LIFE IS NOT A PROBLEM TO BE SOLVED";

	public static void main(String[] args) throws IOException {
		System.out.print(main(System.in));
	}

	protected static String main(InputStream input) throws IOException {
		Reader reader = new Reader(input);
		int n = reader.nextInt();
		reader.close();

		return QUOTE.substring(0, n) + System.lineSeparator();
	}

}
