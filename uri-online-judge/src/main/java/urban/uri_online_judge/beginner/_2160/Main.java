package urban.uri_online_judge.beginner._2160;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;

/**
 * Name at Form
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/2160
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        String l = reader.readLine();
        reader.close();

        if (l.length() <= 80) {
            return "YES" + System.lineSeparator();
        }

        return "NO" + System.lineSeparator();
    }

}
