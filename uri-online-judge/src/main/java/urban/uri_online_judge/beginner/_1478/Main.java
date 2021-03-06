package urban.uri_online_judge.beginner._1478;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;

/**
 * Square Matrix II
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1478
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
        while (n != 0) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    sb.append(String.format("%3s", Math.abs(i - j) + 1));
                    if (j < n - 1) {
                        sb.append(" ");
                    }
                }
                sb.append(System.lineSeparator());
            }
            sb.append(System.lineSeparator());
            n = reader.nextInt();
        }

        return sb.toString();
    }

}
