package urban.uri_online_judge.beginner._2165;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;

/**
 * Twitting
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/2165
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        String t = reader.readLine();
        reader.close();

        if (t.length() <= 140) {
            return "TWEET" + System.lineSeparator();
        }

        return "MUTE" + System.lineSeparator();
    }

}
