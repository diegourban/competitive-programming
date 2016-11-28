package urban.uri_online_judge.beginner._1180;

import java.io.IOException;
import java.io.InputStream;

import urban.uri_online_judge.Reader;

/**
 * Lowest Number and Position
 * 
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1180
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
		int n = reader.nextInt();

		int menorValor = Integer.MAX_VALUE;
		int posicao = 0;

		for (int i = 0; i < n; i++) {
			int x = reader.nextInt();
			if (x < menorValor) {
				menorValor = x;
				posicao = i;
			}
		}
		reader.close();

		StringBuilder sb = new StringBuilder();
		sb.append("Menor valor: ").append(menorValor).append(System.lineSeparator());
		sb.append("Posicao: ").append(posicao).append(System.lineSeparator());
		return sb.toString();
	}

}