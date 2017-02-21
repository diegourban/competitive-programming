package urban.uri_online_judge.strings._1332;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;

/**
 * One-Two-Three
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1332
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        StringBuilder sb = new StringBuilder();

        final int n = reader.nextInt();
        for (int i = 0; i < n; i++) {
            String line = reader.readLine();
            if (line.length() == 5) {
                sb.append(3);
            } else {
                if (line.matches("[a-z]ne") || line.matches("o[a-z]e") || line.matches("on[a-z]")) {
                    sb.append(1);
                } else {
                    sb.append(2);
                }
            }
            sb.append(System.lineSeparator());
        }
        reader.close();

        return sb.toString();
    }

}