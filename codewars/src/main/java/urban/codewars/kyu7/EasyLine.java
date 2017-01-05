package urban.codewars.kyu7;

import java.math.BigInteger;

public class EasyLine {

    public static BigInteger easyLine(int n) {
        BigInteger result = new BigInteger("0");

        BigInteger[] binomials = binomialCoefficientLineAt(n);

        for (BigInteger b : binomials) {
            result = result.add(b.multiply(b));
        }

        return result;
    }

    public static BigInteger[] binomialCoefficientLineAt(int n) {
        BigInteger[] b = new BigInteger[n + 1];
        b[0] = new BigInteger("1");
        for (int i = 1; i <= n; i++) {
            b[i] = new BigInteger("1");
            for (int j = i - 1; j > 0; --j) {
                b[j] = b[j].add(b[j - 1]);
            }
        }
        return b;
    }

}
