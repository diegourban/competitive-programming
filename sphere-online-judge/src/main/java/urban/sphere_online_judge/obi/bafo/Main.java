package urban.sphere_online_judge.obi.bafo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        Leitura in = new Leitura();
        PrintWriter out = new PrintWriter(System.out);

        int casoTeste = 0;
        while (in.hasNext()) {
            int R = in.nextInt();
            if (R == 0) {
                break;
            }
            
            int totA = 0;
            int totB = 0;
            for (int i = 0; i < R; i++) {
                in.nextLine();
                int A = in.nextInt();
                int B = in.nextInt();
                totA += A;
                totB += B;
            }
            
            casoTeste++;
            out.println("Teste " + casoTeste);
            if (totA > totB) {
                out.println("Aldo");
            } else {
                out.println("Beto");
            }
            out.println("");
            in.nextLine();
        }
        
        out.close();
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

        public String next() {
            if (pos != 0) {
                pos++;
            }
            StringBuilder sb = new StringBuilder();
            while (pos < line.length() && line.charAt(pos) > ' ')
                sb.append(line.charAt(pos++));
            return sb.toString();
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

        public long nextLong() {
            long num, total = 0;
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
