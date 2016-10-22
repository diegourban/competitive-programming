package urban.uri_online_judge.beginner._1001;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1001
 * 
 * @author Diego Leonardo Urban
 *
 */
public class Main {

	public static void main(String[] args) throws IOException {
		System.out.print(main(System.in));
	}
	
	public static String main(InputStream input) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(input));
		int A = Integer.parseInt(in.readLine());
		int B = Integer.parseInt(in.readLine());
		return "X = " + (A + B) + System.lineSeparator();
	}

}
