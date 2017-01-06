package urban.uri_online_judge.beginner._1157;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;

/**
 * Divisors I
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1157
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

        StringBuilder sb = new StringBuilder();

        sb.append(1).append(System.lineSeparator());
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                sb.append(i).append(System.lineSeparator());
            }
        }
        if (n != 1) {
            sb.append(n).append(System.lineSeparator());
        }

        return sb.toString();
    }

}
