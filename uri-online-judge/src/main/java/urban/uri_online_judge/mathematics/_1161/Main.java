package urban.uri_online_judge.mathematics._1161;

import urban.common.Reader;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;

/**
 * Factorial Sum
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1161
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    public static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);

        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                BigInteger m = new BigInteger(String.valueOf(reader.nextInt()));
                BigInteger n = new BigInteger(String.valueOf(reader.nextInt()));

                BigInteger sum = new BigInteger("0");
                sum = sum.add(factorial(m));
                sum = sum.add(factorial(n));

                sb.append(sum);
                sb.append(System.lineSeparator());
            } catch (EOFException ex) {
                break;
            }
        }
        reader.close();

        return sb.toString();
    }

    private static BigInteger factorial(BigInteger num) {
        if (BigInteger.ZERO.equals(num)) {
            return BigInteger.ONE;
        }
        return num.multiply(factorial(num.subtract(BigInteger.ONE)));
    }

}
