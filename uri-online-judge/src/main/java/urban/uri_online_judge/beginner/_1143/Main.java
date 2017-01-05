package urban.uri_online_judge.beginner._1143;

import java.io.IOException;
import java.io.InputStream;

import urban.common.Reader;

/**
 * Squared and Cubic
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1143
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
        reader.close();

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            int iSquared = i * i;
            int iCubic = iSquared * i;
            sb.append(i).append(" ").append(iSquared).append(" ").append(iCubic).append(System.lineSeparator());
        }

        return sb.toString();
    }

}
