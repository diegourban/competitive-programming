package urban.uri_online_judge.beginner._1002;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Locale;

/**
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1002
 * 
 * @author Diego Leonardo Urban
 *
 */
public class Main {

	private static final double PI = 3.14159;

	public static void main(String[] args) throws IOException {
		System.out.print(main(System.in));
	}
	
	public static String main(InputStream input) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(input));
		double R = Double.parseDouble(in.readLine());
		double A = PI * (R * R);
		return String.format(Locale.ROOT, "A=%.4f", A) + System.lineSeparator();
	}

}
