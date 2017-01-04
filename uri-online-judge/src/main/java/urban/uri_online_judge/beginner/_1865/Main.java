package urban.uri_online_judge.beginner._1865;

import java.io.IOException;
import java.io.InputStream;

import urban.common.Reader;

/**
 * Mjölnir
 * 
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1865
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
		int c = reader.nextInt();

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < c; i++) {
			String line = reader.readLine();
			String name = line.split(" ")[0];
			if ("Thor".equals(name)) {
				sb.append("Y").append(System.lineSeparator());
			} else {
				sb.append("N").append(System.lineSeparator());
			}
		}
		reader.close();

		return sb.toString();
	}
	
}
