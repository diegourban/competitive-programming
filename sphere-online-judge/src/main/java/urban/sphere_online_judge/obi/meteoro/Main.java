package urban.sphere_online_judge.obi.meteoro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		InputStreamReader in = new InputStreamReader(System.in);

		BufferedReader reader = new BufferedReader(in);

		int n = 0;
		int N = 0;
		int qtdade = 0;

		String[] linha = reader.readLine().trim().split(" ");

		Integer[] coordenadas = { Integer.valueOf(linha[0]),
				Integer.valueOf(linha[1]), Integer.valueOf(linha[2]),
				Integer.valueOf(linha[3]) };

		int x, y;

		while (coordenadas[0] != 0 & coordenadas[1] != 0 & coordenadas[2] != 0
				& coordenadas[3] != 0) {

			qtdade = 0;
			n++;
			N = Integer.parseInt(reader.readLine().trim());

			for (int i = 0; i < N; i++) {
				linha = reader.readLine().trim().split(" ");
				x = Integer.parseInt(linha[0]);
				y = Integer.parseInt(linha[1]);

				if (x >= coordenadas[0] && x <= coordenadas[2]
						&& y <= coordenadas[1] && y >= coordenadas[3]) {
					qtdade++;
				}
			}

			System.out.println("Teste " + n);
			System.out.println(qtdade);
			System.out.println("");

			linha = reader.readLine().trim().split(" ");
			coordenadas[0] = Integer.valueOf(linha[0]);
			coordenadas[1] = Integer.valueOf(linha[1]);
			coordenadas[2] = Integer.valueOf(linha[2]);
			coordenadas[3] = Integer.valueOf(linha[3]);
		}
	}
}
