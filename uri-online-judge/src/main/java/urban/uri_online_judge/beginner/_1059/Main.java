package urban.uri_online_judge.beginner._1059;

import java.io.IOException;
import java.io.InputStream;

/**
 * Even Numbers
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1059
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sb.append(i).append(System.lineSeparator());
            }
        }

        return sb.toString();
    }

}
