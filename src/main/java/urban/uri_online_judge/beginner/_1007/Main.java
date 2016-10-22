package urban.uri_online_judge.beginner._1007;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Difference
 * 
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1007
 * 
 * @author Diego Leonardo Urban
 *
 */
public class Main {

	public static void main(String[] args) throws IOException {
		System.out.print(main(System.in));
	}

	protected static String main(InputStream input) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(input));
		int A = Integer.parseInt(in.readLine());
		int B = Integer.parseInt(in.readLine());
		int C = Integer.parseInt(in.readLine());
		int D = Integer.parseInt(in.readLine());
		int difference = (A * B) - (C * D);
		return "DIFERENCA = " + difference + System.lineSeparator();
	}

}
