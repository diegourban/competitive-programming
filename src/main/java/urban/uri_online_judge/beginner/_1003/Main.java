package urban.uri_online_judge.beginner._1003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1003
 * 
 * @author Diego Leonardo Urban
 *
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(in.readLine());
		int B = Integer.parseInt(in.readLine());
		System.out.println("SOMA = " + (A + B));
	}

}
