package urban.uri_online_judge.beginner._1153;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;

/**
 * Simple Factorial
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1153
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        int n = reader.nextInt();
        reader.close();

        return factorial(n) + System.lineSeparator();
    }

    private static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

}
