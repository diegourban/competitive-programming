package urban.uri_online_judge.beginner._1146;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;

/**
 * Growing Sequences
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1146
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
        while (true) {
            int x = reader.nextInt();
            if (x == 0) {
                break;
            }

            for (int i = 1; i <= x; i++) {
                sb.append(i);
                if (i < x) {
                    sb.append(" ");
                } else {
                    sb.append(System.lineSeparator());
                }
            }

        }
        reader.close();

        return sb.toString();
    }
}
