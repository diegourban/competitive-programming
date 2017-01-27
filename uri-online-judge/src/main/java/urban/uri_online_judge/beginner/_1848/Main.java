package urban.uri_online_judge.beginner._1848;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;

/**
 * Counting Crow
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1848
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

        int screams = 0;
        int result = 0;
        while (screams < 3) {
            String line = reader.readLine().trim();
            if ("caw caw".equals(line)) {
                screams++;
                sb.append(result).append(System.lineSeparator());
                result = 0;
            } else {
                String[] blink = line.split("");
                if ("*".equals(blink[0])) {
                    result += 4;
                }
                if ("*".equals(blink[1])) {
                    result += 2;
                }
                if ("*".equals(blink[2])) {
                    result += 1;
                }
            }
        }
        reader.close();

        return sb.toString();
    }

}
