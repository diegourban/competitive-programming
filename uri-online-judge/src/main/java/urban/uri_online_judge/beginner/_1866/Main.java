package urban.uri_online_judge.beginner._1866;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;

/**
 * Bill
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1866
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        int c = reader.nextInt();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < c; i++) {
            int n = reader.nextInt();
            if (n % 2 == 0) {
                sb.append("0");
            } else {
                sb.append("1");
            }
            sb.append(System.lineSeparator());
        }
        reader.close();

        return sb.toString();
    }

}
