package urban.uri_online_judge.beginner._1165;

import java.io.IOException;
import java.io.InputStream;

import urban.common.Reader;

/**
 * Prime Number
 * 
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1165
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

		for (int i = 1; i <= n; i++) {
			int x = reader.nextInt();

			if (isPrime(x)) {
				sb.append(x).append(" eh primo");
			} else {
				sb.append(x).append(" nao eh primo");
			}
			sb.append(System.lineSeparator());
		}
		reader.close();

		return sb.toString();
	}
	
	// Based on https://en.wikipedia.org/wiki/Primality_test
	private static boolean isPrime(int number) {
		if(number <= 1) {
			return false;
		} else if(number <= 3) {
			return true;
		} else if(number % 2 == 0 || number % 3 == 0) {
			return false;
		}
		
		int i = 5;
		while(i * i <= number) {
			if(number % i == 0 || number % (i + 2) == 0) {
				return false;
			}
			i += 6;
		}
		
		return true;
	}

}
