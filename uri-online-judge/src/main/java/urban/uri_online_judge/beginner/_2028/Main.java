package urban.uri_online_judge.beginner._2028;

import urban.common.Reader;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Sequence of Sequence
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/2028
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        int x = 1;
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                int n = reader.nextInt();
                int tot = (n * (n + 1)) / 2;
                tot++;
                sb.append("Caso ").append(x).append(": ").append(tot).append(" numero");
                if (tot > 1) {
                    sb.append("s");
                }
                sb.append(System.lineSeparator());
                sb.append(0);
                for (int i = 1; i <= n; i++) {
                    for (int j = 0; j < i; j++) {
                        sb.append(" ").append(i);
                    }
                }
                sb.append(System.lineSeparator());
                sb.append(System.lineSeparator());
                x++;
            } catch (EOFException ex) {
                break;
            }
        }
        reader.close();

        return sb.toString();
    }

}