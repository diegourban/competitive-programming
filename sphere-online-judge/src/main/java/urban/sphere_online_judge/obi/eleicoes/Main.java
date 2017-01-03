package urban.sphere_online_judge.obi.eleicoes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    
    public static void main(String[] args) throws IOException {
        Leitura in = new Leitura();

        int N = in.nextInt();

        Map<Integer, Integer> votosCandidatos = new HashMap<Integer, Integer>(N/2);
        
        int candidato = 0;
        int maisVotos = 0;
        for (int i = 0; i < N; i++) {
            in.nextLine();
            int X = in.nextInt();
            
            int votos = 1;
            if(votosCandidatos.containsKey(X)) {
                votos = votosCandidatos.get(X);
                votos++;
            }
            if(votos > maisVotos) {
                candidato = X;
                maisVotos = votos;
            }
            votosCandidatos.put(X, votos);
            if(maisVotos > (N/2)) {
                i = N;
            }
        }
        
        System.out.println(candidato);
        
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
