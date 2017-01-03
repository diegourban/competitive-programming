package urban.sphere_online_judge.obi.estagio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
	static final int MAX_ALUNOS = 1000;

	public static void main(String[] args) throws Exception {
		Leitura in = new Leitura();
		PrintWriter out = new PrintWriter(System.out);

		int maiorMedia;
		int turma = 0;
		int[][] alunos = new int[MAX_ALUNOS][2];

		while (in.hasNext()) {
			int N = in.nextInt();
			if (N == 0) {
				break;
			}

			turma++;
			maiorMedia = 0;

			for (int i = 0; i < N; i++) {
				in.nextLine();
				alunos[i][0] = in.nextInt();
				alunos[i][1] = in.nextInt();
				if (alunos[i][1] > maiorMedia) {
					maiorMedia = alunos[i][1];
				}
			}

			quick_sort(alunos, 0, N - 1);

			out.print("Turma ");
			out.println(turma);
			for (int i = 0; i < N; i++) {
				if (alunos[i][1] == maiorMedia) {
					out.println(alunos[i][0]);
				} else {
					break;
				}
			}
			out.println();
			in.nextLine();
		}
		out.close();
	}

	public static void quick_sort(int[][] v, int ini, int fim) {
		int meio;

		if (ini < fim) {
			meio = partition(v, ini, fim);
			quick_sort(v, ini, meio);
			quick_sort(v, meio + 1, fim);
		}
	}

	public static int partition(int[][] v, int ini, int fim) {
		int pivo, base, topo, i;
		base = v[ini][0];
		pivo = v[ini][1];
		topo = ini;

		for (i = ini + 1; i <= fim; i++) {
			if (v[i][1] > pivo) {
				v[topo][0] = v[i][0];
				v[topo][1] = v[i][1];
				v[i][0] = v[topo + 1][0];
				v[i][1] = v[topo + 1][1];
				topo++;
			}
		}
		v[topo][0] = base;
		v[topo][1] = pivo;
		return topo;
	}

	/*
	 * Codigo retirado de uma solucao da NEERC 2006. Autor: Roman Elizarov
	 */
	public static class Leitura {

		private final BufferedReader in;
		private String line = "";
		private int pos;

		public Leitura() throws FileNotFoundException {
			in = new BufferedReader(new InputStreamReader(System.in));
			nextLine();
		}

		public boolean hasNext() throws IOException {
			return in.ready();
		}

		public void close() {
			try {
				in.close();
			} catch (IOException e) {
				throw new AssertionError("Failed to close with " + e);
			}
		}

		public void nextLine() {
			try {
				line = in.readLine();
			} catch (IOException e) {
				throw new AssertionError("Failed to read line with " + e);
			}
			pos = 0;
		}

		public int nextInt() {
			int num, total = 0;
			boolean negativo = false;

			if (pos != 0) {
				pos++;
			}
			if (pos < line.length() && line.charAt(pos) == '-') {
				negativo = true;
				pos++;
			}

			while (pos < line.length() && line.charAt(pos) > ' ') {
				num = line.charAt(pos++) - '0';
				total *= 10;
				total += num;
			}
			if (negativo)
				total *= -1;

			return total;
		}

	}
}
