package urban.sphere_online_judge.obi.calcula;

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
            int m = in.nextInt();
            if (m == 0) {
                break;
            }

            int total = 0;
            char op = ' ';
            in.nextLine();
            for (int i = 1; i < m*2; i++) {
                if(i % 2 == 1) {
                    if(op == '-') {
                        total = total - in.nextInt();  
                    } else {
                        total = total + in.nextInt();
                    }
                    
                } else {
                  op = in.nextChar(); // FIXME
                }
            }

            casoTeste++;
            out.println("Teste " + casoTeste);
            out.print(total);
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
        
        public char nextChar() {
           return line.charAt(pos);
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

            while (pos < line.length() && line.charAt(pos) != '+' && line.charAt(pos) != '-') {
                num = line.charAt(pos++) - '0';
                total *= 10;
                total += num;
            }
            if (negativo) total *= -1;

            return total;
        }

    }
}
