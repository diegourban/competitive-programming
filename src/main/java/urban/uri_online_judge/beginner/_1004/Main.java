package urban.uri_online_judge.beginner._1004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Simple Product
 * 
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1004
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
		
		int A = Integer.parseInt(reader.readLine());
		int B = Integer.parseInt(reader.readLine());
		
		reader.close();
		
		return "PROD = " + (A * B) + System.lineSeparator();
	}

}
