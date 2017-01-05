package urban.uri_online_judge.beginner._1113;

import java.io.IOException;
import java.io.InputStream;

import urban.common.Reader;

/**
 * Ascending and Descending
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1113
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        int m = reader.nextInt();
        int n = reader.nextInt();

        StringBuilder sb = new StringBuilder();

        while (m != n) {
            if (m > n) {
                sb.append("Decrescente");
            } else {
                sb.append("Crescente");
            }
            sb.append(System.lineSeparator());

            m = reader.nextInt();
            n = reader.nextInt();
        }
        reader.close();

        return sb.toString();
    }

}
