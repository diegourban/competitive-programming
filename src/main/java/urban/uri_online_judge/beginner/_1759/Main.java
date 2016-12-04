package urban.uri_online_judge.beginner._1759;

import java.io.IOException;
import java.io.InputStream;

import urban.uri_online_judge.Reader;

/**
 * Ho Ho Ho
 * 
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1759
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
		reader.close();

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++) {
			sb.append("Ho ");
		}
		sb.replace(sb.length() - 1, sb.length(), "!");
		sb.append(System.lineSeparator());

		return sb.toString();
	}

}
