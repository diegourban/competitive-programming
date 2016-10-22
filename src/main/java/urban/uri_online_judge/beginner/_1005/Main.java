package urban.uri_online_judge.beginner._1005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

/**
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1005
 * 
 * @author Diego Leonardo Urban
 *
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		double A = Double.parseDouble(in.readLine());
		double B = Double.parseDouble(in.readLine());
		double MEDIA = ((A * 3.5d) + (B * 7.5d)) / 11d;
		System.out.println(String.format(Locale.ROOT, "MEDIA = %.5f", MEDIA));
	}

}
