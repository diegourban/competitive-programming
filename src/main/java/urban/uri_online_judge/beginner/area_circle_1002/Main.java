package urban.uri_online_judge.beginner.area_circle_1002;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Locale;

/**
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1002
 * 
 * @author Diego Leonardo Urban
 *
 */
public class Main {

	private static final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	private static final PrintStream out = System.out;
	private static final double PI = 3.14159;
	
	public static void main(String[] args) throws IOException {
		double R = Double.parseDouble(in.readLine());
		double A = PI * (R * R);
		out.printf(String.format(Locale.ROOT, "A=%.4f\n", A));
	}

}
