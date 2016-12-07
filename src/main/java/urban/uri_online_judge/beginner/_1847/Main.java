package urban.uri_online_judge.beginner._1847;

import java.io.IOException;
import java.io.InputStream;

import urban.uri_online_judge.Reader;

/**
 * Welcome to the Winter!
 * 
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1847
 * 
 * @author Diego Leonardo Urban
 *
 */
public class Main {

	private static final String HAPPY = ":)" + System.lineSeparator();
	private static final String SAD = ":(" + System.lineSeparator();

	public static void main(String[] args) throws IOException {
		System.out.print(main(System.in));
	}

	protected static String main(InputStream input) throws IOException {
		Reader reader = new Reader(input);
		int a = reader.nextInt();
		int b = reader.nextInt();
		int c = reader.nextInt();
		reader.close();

		if (b < a) {
			if (c >= b) {
				return HAPPY;
			} else if (b - c < a - b) {
				return HAPPY;
			} else {
				return SAD;
			}
		} else if (b > a) {
			if (c <= b) {
				return SAD;
			} else if (c - b < b - a) {
				return SAD;
			} else {
				return HAPPY;
			}
		} else {
			if (c > b) {
				return HAPPY;
			} else {
				return SAD;
			}
		}
	}
	
}
