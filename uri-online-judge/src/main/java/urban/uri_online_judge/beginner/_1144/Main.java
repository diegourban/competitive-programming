package urban.uri_online_judge.beginner._1144;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;

/**
 * Logical Sequence
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1144
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
            sb.append(i).append(" ").append(iSquared + 1).append(" ").append(iCubic + 1).append(System.lineSeparator());
        }

        return sb.toString();
    }

}
