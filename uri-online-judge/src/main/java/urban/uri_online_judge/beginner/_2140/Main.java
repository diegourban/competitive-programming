package urban.uri_online_judge.beginner._2140;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;

/**
 * Two Bills
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/2140
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);

        int n = reader.nextInt();
        int m = reader.nextInt();

        StringBuilder sb = new StringBuilder();
        while (n != 0 && m != 0) {
            int change = m - n;
            if (change < 7 || !canGiveTwoDifferentBillsChange(change)) {
                sb.append("impossible").append(System.lineSeparator());
            } else {
                sb.append("possible").append(System.lineSeparator());
            }
            n = reader.nextInt();
            m = reader.nextInt();
        }
        reader.close();

        return sb.toString();
    }

    private static boolean canGiveTwoDifferentBillsChange(int change) {
        return (change - 150 == 0 || change - 120 == 0 || change - 110 == 0 || change - 105 == 0 || change - 102 == 0
                || change - 70 == 0 || change - 60 == 0 || change - 55 == 0 || change - 52 == 0
                || change - 30 == 0 || change - 25 == 0 || change - 22 == 0
                || change - 15 == 0 || change - 12 == 0
                || change - 7 == 0);
    }

}
