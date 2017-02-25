package urban.uri_online_judge.adhoc._1387;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;

/**
 * Og
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1387
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        StringBuilder sb = new StringBuilder();

        int l = reader.nextInt();
        int r = reader.nextInt();

        while (!(l == 0 && r == 0)) {
            sb.append(l + r);
            sb.append(System.lineSeparator());
            l = reader.nextInt();
            r = reader.nextInt();
        }
        reader.close();

        return sb.toString();
    }

}
