package urban.uri_online_judge.beginner._2167;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;

/**
 * Engine Failure
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/2167
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
        int previousR = reader.nextInt();
        for (int i = 2; i <= n; i++) {
            int r = reader.nextInt();
            if (r < previousR) {
                reader.close();
                return i + System.lineSeparator();
            }
            previousR = r;
        }
        reader.close();
        return 0 + System.lineSeparator();
    }

}
