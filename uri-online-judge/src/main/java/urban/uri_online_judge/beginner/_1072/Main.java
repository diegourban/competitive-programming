package urban.uri_online_judge.beginner._1072;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;

/**
 * Interval 2
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1072
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        int in = 0;
        int out = 0;

        Reader reader = new Reader(input);
        int n = reader.nextInt();
        for (int i = 0; i < n; i++) {
            int x = reader.nextInt();
            if (x >= 10 && x <= 20) {
                in++;
            } else {
                out++;
            }
        }
        reader.close();

        StringBuilder sb = new StringBuilder();
        sb.append(in).append(" in").append(System.lineSeparator());
        sb.append(out).append(" out").append(System.lineSeparator());

        return sb.toString();
    }

}
