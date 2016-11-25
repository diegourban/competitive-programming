package urban.uri_online_judge.beginner._1165;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;

import urban.uri_online_judge.Reader;

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

	private static boolean isPrime(int number) {
		int n = number;
		Set<Integer> factors = new HashSet<Integer>();
		factors.add(1);
		for (int i = 2; i <= n / i; i++) {
			while (n % i == 0) {
				factors.add(i);
				n /= i;
			}
		}
		if (n > 1) {
			factors.add(n);
		}
		return factors.size() == 2 && factors.contains(1) && factors.contains(number);
	}

}
