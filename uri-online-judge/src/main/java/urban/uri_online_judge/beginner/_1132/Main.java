package urban.uri_online_judge.beginner._1132;

import java.io.IOException;
import java.io.InputStream;

import urban.common.Reader;

/**
 * Multiples of 13
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1132
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
        int y = reader.nextInt();
        reader.close();

        int smlr = 0;
        int bggr = 0;

        if (x > y) {
            bggr = x;
            smlr = y;
        } else {
            bggr = y;
            smlr = x;
        }

        long sum = 0;
        for (int i = smlr; i <= bggr; i++) {
            if (i % 13 != 0) {
                sum += i;
            }
        }

        return sum + System.lineSeparator();
    }

}
