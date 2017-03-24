package urban.uri_online_judge.beginner._1149;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;

/**
 * Summing Consecutive Integers
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1149
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);

        int a = 0;
        int n = 0;
        int sum = 0;

        a = reader.nextInt();
        n = reader.nextInt();

        while (n < 1) {
            n = reader.nextInt();
        }
        reader.close();

        for (int i = 0; i < n; i++, a++) {
            sum += a;
        }

        return sum + System.lineSeparator();
    }

}
