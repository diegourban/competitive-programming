package urban.uri_online_judge.beginner._1070;

import java.io.IOException;
import java.io.InputStream;

import urban.common.Reader;

/**
 * Six Odd Numbers
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1070
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        int x = reader.nextInt();
        reader.close();

        StringBuilder sb = new StringBuilder();

        int count = 0;
        while (count < 6) {
            if (x % 2 != 0) {
                sb.append(x).append(System.lineSeparator());
                count++;
            }
            x++;
        }
        return sb.toString();
    }

}
