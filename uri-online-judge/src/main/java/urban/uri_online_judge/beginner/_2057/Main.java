package urban.uri_online_judge.beginner._2057;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;

/**
 * Time Zone
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/2057
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        int s = reader.nextInt(); // 0 .. 23 (time of departure)
        int t = reader.nextInt(); // 1 .. 12 (travel time)
        int f = reader.nextInt(); // -5 .. 5 (destination time zone with respect to the origin)
        reader.close();

        int time = (s + t + f) % 24;
        if (time < 0) {
            time = 24 + time;
        }

        return time + System.lineSeparator();
    }

}
