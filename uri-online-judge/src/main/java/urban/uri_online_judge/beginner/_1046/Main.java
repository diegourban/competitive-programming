package urban.uri_online_judge.beginner._1046;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;

/**
 * Game Time
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1046
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        int begin = reader.nextInt();
        int end = reader.nextInt();
        reader.close();

        if (end < begin) {
            return "O JOGO DUROU " + (24 - (begin - end)) + " HORA(S)" + System.lineSeparator();
        } else if (end > begin) {
            return "O JOGO DUROU " + (end - begin) + " HORA(S)" + System.lineSeparator();
        } else {
            // begin == end
            return "O JOGO DUROU 24 HORA(S)" + System.lineSeparator();
        }
    }

}
