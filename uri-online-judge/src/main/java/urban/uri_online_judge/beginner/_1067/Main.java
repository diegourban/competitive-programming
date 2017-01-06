package urban.uri_online_judge.beginner._1067;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;

/**
 * Odd Numbers
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1067
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        int x = reader.nextInt();
        reader.close();

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= x; i++) {
            if (i % 2 != 0) {
                sb.append(i).append(System.lineSeparator());
            }
        }

        return sb.toString();
    }

}
