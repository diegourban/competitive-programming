package urban.uri_online_judge.beginner._2232;

import urban.common.Reader;
import urban.common.math.Combinatorics;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;

/**
 * Pascal's Triangle
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/2232
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        int t = reader.nextInt();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int n = reader.nextInt();
            BigInteger sum = sumOfFirstLines(n);
            sb.append(sum.toString()).append(System.lineSeparator());
        }
        reader.close();

        return sb.toString();
    }

    private static BigInteger sumOfFirstLines(int n) {
        BigInteger sum = new BigInteger("0");
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                sum = sum.add(Combinatorics.binomialCoefficient(i, k));
            }
        }
        return sum;
    }

}