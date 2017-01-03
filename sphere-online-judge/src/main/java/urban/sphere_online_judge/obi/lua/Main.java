package urban.sphere_online_judge.obi.lua;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        Leitura in = new Leitura();

        int n = 0;
        int m = 0;

        n = in.nextInt();
        m = in.nextInt();

        int casoTeste = 0;

        while (in.hasNext()) {
            if (n == m && n == 0) {
                break;
            }

            int[] temperaturas = new int[n];
            int[] mediasPorIntervalo = new int[(n - m) + 1];
            int temperatura = 0;

            for (int i = 0; i < n; i++) {
                in.nextLine();
                temperatura = in.nextInt();
                temperaturas[i] = temperatura;
            }
            
            temperatura = 0;
            int indice = m;
            for (int i = 1; i <= temperaturas.length; i++) {
                temperatura += temperaturas[i-1]; 
                if (i % indice == 0) {
                    temperatura = temperatura / m;
                    mediasPorIntervalo[indice - m] = temperatura;
                    temperatura = 0;
                    i = i - m;
                    i++;
                    indice++;
                }
            }
            

            quick_sort(mediasPorIntervalo, 0, mediasPorIntervalo.length - 1);
            casoTeste++;
            System.out.println("Teste " + casoTeste);
            System.out.println(mediasPorIntervalo[0] + " " + mediasPorIntervalo[mediasPorIntervalo.length - 1]);
            System.out.println();

            if(in.hasNext()) {
                in.nextLine();
                n = in.nextInt();
                m = in.nextInt();
            }
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
