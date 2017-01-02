package urban.uri_online_judge.beginner._2061;

import urban.uri_online_judge.Reader;

import java.io.IOException;
import java.io.InputStream;

/**
 * closing Tabs
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/2061
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
        int m = reader.nextInt();
        int f = 0;
        int c = 0;
        for (int i = 0; i < m; i++) {
            String a = reader.readLine();
            if ("fechou".equals(a)) {
                f++;
            } else {
                c++;
            }
        }
        reader.close();

        n = n - f;
        n = n + f * 2;
        n = n - c;

        return n + System.lineSeparator();
    }

}
