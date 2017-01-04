package urban.uri_online_judge.beginner._1541;

import java.io.IOException;
import java.io.InputStream;

import urban.common.Reader;

/**
 * Building Houses
 * 
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1541
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

		StringBuilder sb = new StringBuilder();
		while (true) {
			int a = reader.nextInt();
			if (a == 0) {
				break;
			}
			int b = reader.nextInt();
			int c = reader.nextInt();

			int houseArea = a * b;
			int landArea = (houseArea * 100) / c;
			int landSize = (int) Math.sqrt(landArea);
			sb.append(landSize).append(System.lineSeparator());
		}

		return sb.toString();
	}

}
