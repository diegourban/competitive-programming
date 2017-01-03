package urban.sphere_online_judge.obi.placar;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(new BufferedInputStream(System.in));
		int k = 0;
		int n = 0;
		int problemas = 10;
		String nome = "";

		String nomeAux = "";
		int problemasAux = 10;

		while (s.hasNext()) {

			k++;
			n = s.nextInt();

			for (int i = 0; i < n; i++) {
				nomeAux = s.next();
				problemasAux = s.nextInt();
				if (problemasAux == problemas) {
					if (nomeAux.compareTo(nome) > 0) {
						problemas = problemasAux;
						nome = nomeAux;
					}
				} else {
					if (problemasAux < problemas) {
						problemas = problemasAux;
						nome = nomeAux;
					}
				}
			}

			System.out.println("Instancia " + k);
			System.out.println(nome);
			System.out.println();

			problemas = 10;
			nome = "";
		}
		s.close();
	}
}

