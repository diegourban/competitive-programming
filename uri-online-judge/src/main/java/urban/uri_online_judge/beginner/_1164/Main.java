package urban.uri_online_judge.beginner._1164;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;

/**
 * Perfect Number
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1164
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

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            int x = reader.nextInt();

            int sum = divisorsSum(x);

            if (sum == x) {
                sb.append(x).append(" eh perfeito");
            } else {
                sb.append(x).append(" nao eh perfeito");
            }
            sb.append(System.lineSeparator());
        }
        reader.close();

        return sb.toString();
    }

    private static int divisorsSum(int x) {
        if (x == 1)
            return 0;
        int dSum = 1;
        for (int j = 2; j <= x / 2; j++) {
            if (x % j == 0) {
                dSum += j;
            }
        }
        return dSum;
    }

}
