package urban.uri_online_judge.beginner._1177;

import java.io.IOException;
import java.io.InputStream;

import urban.common.Reader;

/**
 * Array Fill II
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1177
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
        reader.close();

        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0; i < 1000; i++) {
            sb.append("N[").append(i).append("] = ").append(count).append(System.lineSeparator());
            count++;
            if (count == t) {
                count = 0;
            }
        }

        return sb.toString();
    }

}
