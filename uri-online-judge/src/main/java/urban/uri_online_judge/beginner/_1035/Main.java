package urban.uri_online_judge.beginner._1035;

import java.io.IOException;
import java.io.InputStream;

import urban.common.Reader;

/**
 * Selection Test 1
 * 
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1035
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
		int A = reader.nextInt();
		int B = reader.nextInt();
		int C = reader.nextInt();
		int D = reader.nextInt();
		reader.close();

		if (B > C && D > A && C + D > A + B && C > 0 && D > 0 && A % 2 == 0) {
			return "Valores aceitos" + System.lineSeparator();
		}
		return "Valores nao aceitos" + System.lineSeparator();
	}
}
