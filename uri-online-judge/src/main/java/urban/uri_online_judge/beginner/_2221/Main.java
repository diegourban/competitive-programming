package urban.uri_online_judge.beginner._2221;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;

/**
 * Pomekons Battle
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/2221
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

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int b = reader.nextInt();

            int da = reader.nextInt();
            int dd = reader.nextInt();
            int dl = reader.nextInt();
            int dv = (da + dd) / 2;
            if (dl % 2 == 0) {
                dv += b;
            }

            int ga = reader.nextInt();
            int gd = reader.nextInt();
            int gl = reader.nextInt();
            int gv = (ga + gd) / 2;
            if (gl % 2 == 0) {
                gv += b;
            }

            if (dv > gv) {
                sb.append("Dabriel");
            } else if (gv > dv) {
                sb.append("Guarte");
            } else {
                sb.append("Empate");
            }
            sb.append(System.lineSeparator());
        }
        reader.close();

        return sb.toString();
    }

}