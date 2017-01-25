package urban.uri_online_judge.beginner._2172;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;

/**
 * Event
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/2172
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
        long m = reader.nextLong();

        StringBuilder sb = new StringBuilder();
        while (x != 0 && m != 0) {
            sb.append(m * x).append(System.lineSeparator());
            x = reader.nextInt();
            m = reader.nextLong();
        }
        reader.close();

        return sb.toString();
    }

}
