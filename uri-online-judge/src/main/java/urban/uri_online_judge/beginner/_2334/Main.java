package urban.uri_online_judge.beginner._2334;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;

/**
 * Little Ducks
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/2334
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        final BigInteger one = BigInteger.valueOf(1);
        Reader reader = new Reader(input);
        String line = reader.readLine();

        StringBuilder sb = new StringBuilder();
        while (!"-1".equals(line)) {
            if (line.length() < 10) {
                int p = Integer.parseInt(line);
                if (p > 0) {
                    p--;
                }
                sb.append(p);
            } else {
                BigInteger p = new BigInteger(line);
                sb.append(p.subtract(one));
            }
            sb.append(System.lineSeparator());
            line = reader.readLine();
        }
        reader.close();

        return sb.toString();
    }

}