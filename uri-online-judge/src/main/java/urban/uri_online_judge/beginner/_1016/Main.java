package urban.uri_online_judge.beginner._1016;

import java.io.IOException;
import java.io.InputStream;

import urban.common.Reader;

/**
 * Distance
 * 
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1016
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
		int km = reader.nextInt();
		reader.close();

		return km * 2 + " minutos" + System.lineSeparator();
	}

}
