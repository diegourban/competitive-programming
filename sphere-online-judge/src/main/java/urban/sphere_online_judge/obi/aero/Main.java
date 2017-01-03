package urban.sphere_online_judge.obi.aero;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        Leitura in = new Leitura();

        int casoTeste = 0;
        while (in.hasNext()) {
            int A = in.nextInt();
            int V = in.nextInt();
            if (A == V && A == 0) {
                break;
            }

            int[] trafegoAeroporto = new int[A];

            for (int i = 0; i < V; i++) {
                in.nextLine();
                int X = in.nextInt();
                int Y = in.nextInt();
                trafegoAeroporto[X - 1]++;
                trafegoAeroporto[Y - 1]++;
            }

            int[] voosAeroporto = Arrays.copyOf(trafegoAeroporto, A);

            quick_sort(trafegoAeroporto, 0, trafegoAeroporto.length - 1);

            int maiorTrafego = trafegoAeroporto[trafegoAeroporto.length - 1];
            casoTeste++;
            System.out.println("Teste " + casoTeste);
            String result = "";
            for (int i = 0; i < voosAeroporto.length; i++) {
                if (voosAeroporto[i] == maiorTrafego) {
                    result = result + (i + 1) + " ";
                }
            }
            System.out.println(result.substring(0, result.length() - 1));

            in.nextLine();
        }

    }

    public static void quick_sort(int[] v, int ini, int fim) {
        int meio;

        if (ini < fim) {
            meio = partition(v, ini, fim);
            quick_sort(v, ini, meio);
            quick_sort(v, meio + 1, fim);
        }
    }

    public static int partition(int[] v, int ini, int fim) {
        int pivo, topo, i;
        pivo = v[ini];
        topo = ini;

        for (i = ini + 1; i <= fim; i++) {
            if (v[i] < pivo) {
                v[topo] = v[i];
                v[i] = v[topo + 1];
                topo++;
            }
        }
        v[topo] = pivo;
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
            if (negativo) total *= -1;

            return total;
        }

    }
}
