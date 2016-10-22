package urban.uri_online_judge.beginner._1006;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Locale;

/**
 * Average 2
 * 
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1006
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
		double A = Double.parseDouble(in.readLine());
		double B = Double.parseDouble(in.readLine());
		double C = Double.parseDouble(in.readLine());
		double MEDIA = ((A * 2.0d) + (B * 3.0d) + (C * 5.0d)) / 10d;
		return String.format(Locale.ROOT, "MEDIA = %.1f", MEDIA) + System.lineSeparator();
	}

}
