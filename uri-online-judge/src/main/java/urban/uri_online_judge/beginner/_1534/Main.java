package urban.uri_online_judge.beginner._1534;

import urban.common.Reader;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Array 123
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1534
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
            try {
                int n = reader.nextInt();
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (j + i == n - 1) {
                            sb.append(2);
                        } else if (j - i == 0) {
                            sb.append(1);
                        } else {
                            sb.append(3);
                        }
                    }
                    sb.append(System.lineSeparator());
                }
            } catch (EOFException ex) {
                break;
            }
        }

        return sb.toString();
    }

}
