package urban.uri_online_judge.beginner._1961;

import java.io.IOException;
import java.io.InputStream;

import urban.common.Reader;

/**
 * Jumping Frog
 * 
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1961
 * 
 * @author Diego Leonardo Urban
 *
 */
public class Main {

	public static void main(String[] args) throws IOException {
		System.out.print(main(System.in));
	}

	protected static String main(InputStream input) throws IOException {
		Reader reader = new Reader(input);
		int p = reader.nextInt();
		int n = reader.nextInt();
		int[] pipeHeights = new int[n];
		for (int i = 0; i < n; i++) {
			pipeHeights[i] = reader.nextInt();
		}
		reader.close();

		for (int i = 0; i < pipeHeights.length - 1; i++) {
			if (Math.abs(pipeHeights[i] - pipeHeights[i + 1]) > p) {
				return "GAME OVER" + System.lineSeparator();
			}
		}

		return "YOU WIN" + System.lineSeparator();
	}

}