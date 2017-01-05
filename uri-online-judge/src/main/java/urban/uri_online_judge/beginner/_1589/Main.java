package urban.uri_online_judge.beginner._1589;

import java.io.IOException;
import java.io.InputStream;

import urban.common.Reader;

/**
 * Bob Conduit
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1589
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        int t = reader.nextInt();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            int r1 = reader.nextInt();
            int r2 = reader.nextInt();
            sb.append(r1 + r2).append(System.lineSeparator());
        }
        reader.close();

        return sb.toString();
    }

}
