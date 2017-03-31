package urban.uri_online_judge.beginner._1165;

import urban.common.Reader;
import urban.common.math.Algebra;

import java.io.IOException;
import java.io.InputStream;

/**
 * Prime Number
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1165
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

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            int x = reader.nextInt();

            if (Algebra.isPrime(x)) {
                sb.append(x).append(" eh primo");
            } else {
                sb.append(x).append(" nao eh primo");
            }
            sb.append(System.lineSeparator());
        }
        reader.close();

        return sb.toString();
    }

}
