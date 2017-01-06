package urban.uri_online_judge.beginner._1176;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;

/**
 * Fibonacci Array
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1176
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    private static final double phi = (1 + Math.sqrt(5)) / 2;
    private static final double sqrt5 = Math.sqrt(5);

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        int t = reader.nextInt();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int n = reader.nextInt();
            sb.append("Fib(").append(n).append(") = ").append(fibBinet(n)).append(System.lineSeparator());
        }
        reader.close();

        return sb.toString();
    }

    private static long fibBinet(int n) {
        return (long) ((Math.pow(phi, n) - Math.pow(-phi, -n)) / sqrt5);
    }

}
