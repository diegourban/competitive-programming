package urban.uri_online_judge.beginner._1133;

import java.io.IOException;
import java.io.InputStream;

import urban.common.Reader;

/**
 * Rest of a division
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1133
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

        // excluding the inputs
        smlr++;
        bggr--;

        StringBuilder sb = new StringBuilder();
        for (int i = smlr; i <= bggr; i++) {
            int rest = i % 5;
            if (rest == 2 || rest == 3) {
                sb.append(i).append(System.lineSeparator());
            }
        }

        return sb.toString();
    }

}
