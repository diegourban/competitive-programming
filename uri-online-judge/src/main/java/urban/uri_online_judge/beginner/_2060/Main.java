package urban.uri_online_judge.beginner._2060;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;

/**
 * Bino's Challenge
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/2060
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
        int m2 = 0;
        int m3 = 0;
        int m4 = 0;
        int m5 = 0;
        for (int i = 0; i < n; i++) {
            int l = reader.nextInt();
            if (l % 2 == 0) {
                m2++;
            }
            if (l % 4 == 0) {
                m4++;
            }
            if (l % 3 == 0) {
                m3++;
            }
            if (l % 5 == 0) {
                m5++;
            }
        }
        reader.close();

        StringBuilder sb = new StringBuilder();
        sb.append(m2).append(" Multiplo(s) de 2").append(System.lineSeparator());
        sb.append(m3).append(" Multiplo(s) de 3").append(System.lineSeparator());
        sb.append(m4).append(" Multiplo(s) de 4").append(System.lineSeparator());
        sb.append(m5).append(" Multiplo(s) de 5").append(System.lineSeparator());

        return sb.toString();
    }

}
