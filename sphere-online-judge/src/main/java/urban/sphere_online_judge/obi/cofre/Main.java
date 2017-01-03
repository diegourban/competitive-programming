package urban.sphere_online_judge.obi.cofre;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        int N = 0;
        int n = 0;
        int J = 0;
        int Z = 0;

        int diferenca = 0;
        int diferencaAux = 0;

        String line;
        String[] values;

        final BufferedReader in = new BufferedReader(new InputStreamReader(
                System.in));
        final PrintWriter writer = new PrintWriter(System.out);

        line = in.readLine().trim();

        N = Integer.parseInt(line);

        while (N != 0) {

            diferenca = 0;
            n++;

            writer.append("Teste " + n + "\n");

            for (int i = 0; i < N; i++) {
                line = in.readLine().trim();
                values = line.split(" ");
                J = Integer.parseInt(values[0]);
                Z = Integer.parseInt(values[1]);
                diferencaAux = (J - Z);
                diferenca = (diferenca + diferencaAux);
                writer.append(String.valueOf(diferenca) + "\n");
            }

            line = in.readLine().trim();
            N = Integer.parseInt(line);
            if (N != 0) {
                writer.append("\n");
            }
        }
        
        writer.close();
    }

}
