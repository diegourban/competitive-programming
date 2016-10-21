package urban.uri_online_judge.beginner.extremely_basic_1001;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1001
 * 
 * @author Diego
 *
 */
public class Main {

	private static final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	private static final PrintStream out = System.out;

	public static void main(String[] args) throws IOException {
		int A = Integer.parseInt(in.readLine());
		int B = Integer.parseInt(in.readLine());
		out.printf("X = %d\n", A + B);
	}

}
