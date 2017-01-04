package urban.uri_online_judge.beginner._1151;

import java.io.IOException;
import java.io.InputStream;

import urban.common.Reader;

/**
 * Easy Fibonacci
 * 
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1151
 * 
 * @author Diego Leonardo Urban
 *
 */
public class Main {

	private static final double phi = (1 + Math.sqrt(5)) / 2;
	private static final double sqrt5 = Math.sqrt(5);

	public static void main(String[] args) throws IOException {
		System.out.print(main(System.in));
	}

	protected static String main(InputStream input) throws IOException {
		Reader reader = new Reader(input);
		int n = reader.nextInt();
		reader.close();

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++) {
			sb.append(fibonacciBinetFormula(i));
			if (i < n - 1) {
				sb.append(" ");
			}
		}

		return sb.append(System.lineSeparator()).toString();
	}

	private static int fibonacciBinetFormula(int n) {
		return (int) ((Math.pow(phi, n) - Math.pow(-phi, -n)) / sqrt5);
	}

}
