package urban.uri_online_judge.beginner._2006;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;

/**
 * Identifying Tea
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/2006
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
        int c = 0;
        for (int i = 0; i < 5; i++) {
            int a = reader.nextInt();
            if (a == t) {
                c++;
            }
        }
        reader.close();

        return c + System.lineSeparator();
    }

}
