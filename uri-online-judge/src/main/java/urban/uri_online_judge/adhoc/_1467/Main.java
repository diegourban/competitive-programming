package urban.uri_online_judge.adhoc._1467;

import urban.common.Reader;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Zero or One
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1467
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
                final int a = reader.nextInt();
                final int b = reader.nextInt();
                final int c = reader.nextInt();
                int x = Integer.parseInt(a + "" + b + "" + c, 2);
                if (x == 1 || x == 6) {
                    sb.append("C");
                } else if (x == 2 || x == 5) {
                    sb.append("B");
                } else if (x == 3 || x == 4) {
                    sb.append("A");
                } else {
                    sb.append("*");
                }
                sb.append(System.lineSeparator());
            } catch (EOFException ex) {
                break;
            }

        }
        reader.close();

        return sb.toString();
    }

}
