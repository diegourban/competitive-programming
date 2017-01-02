package urban.uri_online_judge.beginner._1002;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Locale;

/**
 * Area of a Circle
 * 
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1002
 * 
 * @author Diego Leonardo Urban
 *
 */
public class Main {

	public static void main(String[] args) throws IOException {
		System.out.print(main(System.in));
	}
	
	public static String main(InputStream input) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(input));
		
		double R = Double.parseDouble(reader.readLine());
		double A = 3.14159 * (R * R);
		
		reader.close();
		
		return String.format(Locale.ROOT, "A=%.4f", A) + System.lineSeparator();
	}

}
