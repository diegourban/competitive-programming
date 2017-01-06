package urban.uri_online_judge.beginner._1101;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;

/**
 * Sequence of Numbers and Sum
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1101
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        int m = reader.nextInt();

        StringBuilder sb = new StringBuilder();

        while (m > 0) {
            int n = reader.nextInt();
            if (n <= 0) {
                break;
            }

            int bggr = 0;
            int smllr = 0;

            if (m > n) {
                bggr = m;
                smllr = n;
            } else {
                bggr = n;
                smllr = m;
            }

            long sum = countTo(bggr) - countTo(smllr - 1);

            for (int i = smllr; i <= bggr; i++) {
                sb.append(i).append(' ');
            }
            sb.append("Sum=").append(sum).append(System.lineSeparator());

            m = reader.nextInt();
        }
        reader.close();

        return sb.toString();
    }

    private static long countTo(int n) {
        return (n * (n + 1)) / 2;
    }

}
