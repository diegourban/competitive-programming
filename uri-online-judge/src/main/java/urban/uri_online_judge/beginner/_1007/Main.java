package urban.uri_online_judge.beginner._1007;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Difference
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1007
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(input));

        int A = Integer.parseInt(reader.readLine());
        int B = Integer.parseInt(reader.readLine());
        int C = Integer.parseInt(reader.readLine());
        int D = Integer.parseInt(reader.readLine());
        int difference = (A * B) - (C * D);

        reader.close();

        return "DIFERENCA = " + difference + System.lineSeparator();
    }

}
