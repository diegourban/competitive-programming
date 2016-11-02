package urban.uri_online_judge.beginner._1042;

import java.io.IOException;
import java.io.InputStream;

import urban.uri_online_judge.Reader;

/**
 * Simple Sort
 * 
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1042
 * 
 * @author Diego Leonardo Urban
 *
 */
public class Main {

	private static final String LS = System.lineSeparator();

	public static void main(String[] args) throws IOException {
		System.out.print(main(System.in));
	}

	protected static String main(InputStream input) throws IOException {
		Reader reader = new Reader(input);
		int a = reader.nextInt();
		int b = reader.nextInt();
		int c = reader.nextInt();
		reader.close();

		int min = 0;
		int max = 0;
		int med = 0;

		if (a > b) {
			if (a > c) {
				max = a;
				if (b > c) {
					med = b;
					min = c;
				} else {
					med = c;
					min = b;
				}
			} else {
				med = a;
				max = c;
				min = b;
			}
		} else {
			if (b > c) {
				max = b;
				if (a > c) {
					med = a;
					min = c;
				} else {
					med = c;
					min = a;
				}
			} else {
				med = b;
				max = c;
				min = a;
			}
		}

		StringBuilder sb = new StringBuilder();
		sb = sb.append(min).append(LS).append(med).append(LS).append(max).append(LS).append(LS);
		sb = sb.append(a).append(LS).append(b).append(LS).append(c).append(LS);

		return sb.toString();
	}

}