package urban.uri_online_judge.beginner._1858;

import java.io.IOException;
import java.io.InputStream;

import urban.common.Reader;

/**
 * Theon's Answer
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1858
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
        int min = Integer.MAX_VALUE;
        int pn = 0;
        for (int i = 1; i <= n; i++) {
            int x = reader.nextInt();
            if (x < min) {
                min = x;
                pn = i;
            }
        }
        reader.close();

        return pn + System.lineSeparator();
    }

}
