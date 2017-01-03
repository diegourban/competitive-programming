package urban.sphere_online_judge.obi.fatoria2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String args[]) throws IOException {
        final BufferedReader in = new BufferedReader(new InputStreamReader(
                System.in));

        String line = in.readLine().trim();

        int N = Integer.parseInt(line);

        final PrintWriter writer = new PrintWriter(System.out);
        writer.append(String.valueOf(fatorial(N)));
        writer.close();
    }

    public static int fatorial(int num) {
        if (num <= 1)
            return 1;
        else
            return num * fatorial(num - 1);
    }
}
