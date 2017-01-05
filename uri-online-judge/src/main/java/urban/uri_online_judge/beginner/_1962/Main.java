package urban.uri_online_judge.beginner._1962;

import java.io.IOException;
import java.io.InputStream;

import urban.common.Reader;

/**
 * A Long, Long Time Ago
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1962
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    private static final int THE_YEAR = 2015;

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        int n = reader.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            long t = reader.nextLong();
            long dif = Math.abs(THE_YEAR - t);
            if (t >= THE_YEAR) {
                dif++;
                sb.append(dif).append(" A.C.");
            } else {
                sb.append(dif).append(" D.C.");
            }
            sb.append(System.lineSeparator());
        }
        reader.close();

        return sb.toString();
    }

}