package urban.sphere_online_judge.obi.pedagio1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    public static void main(String[] args) throws IOException {
        Leitura in = new Leitura();

        int totalViagem = 0;
        
        int L = in.nextInt();
        int D = in.nextInt();
        
        in.nextLine();
        int K = in.nextInt();
        int P = in.nextInt();
        
        int qtdePedagios = L / D;
        totalViagem = qtdePedagios * P;
        
        totalViagem += (L * K);
        
        System.out.println(totalViagem);
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
