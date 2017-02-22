package urban.uri_online_judge.mathematics._1028;

import urban.common.Reader;
import urban.common.math.Algebra;

import java.io.IOException;
import java.io.InputStream;

/**
 * Collectable Cards
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1028
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    public static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        StringBuilder sb = new StringBuilder();
        final int n = reader.nextInt();
        for (int i = 0; i < n; i++) {
            int a = reader.nextInt();
            int b = reader.nextInt();
            long gdc = Algebra.gcdLoop(a, b);
            sb.append(gdc);
            sb.append(System.lineSeparator());
        }
        reader.close();

        return sb.toString();
    }

}
