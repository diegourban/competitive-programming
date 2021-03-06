package urban.uri_online_judge.structures._1022;

import urban.common.Reader;
import urban.common.math.Algebra;

import java.io.IOException;
import java.io.InputStream;

/**
 * TDA Rational
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1022
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    private static final String LS = System.lineSeparator();

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        double N = reader.nextDouble();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            final int N1 = reader.nextInt();
            reader.nextChar();
            final int D1 = reader.nextInt();
            final char op = reader.nextChar();
            final int N2 = reader.nextInt();
            reader.nextChar();
            final int D2 = reader.nextInt();

            int rationalNumerator = 0;
            int rationalDenominator = 0;

            switch (op) {
                case '+':
                    rationalNumerator = N1 * D2 + N2 * D1;
                    rationalDenominator = D1 * D2;
                    break;
                case '-':
                    rationalNumerator = N1 * D2 - N2 * D1;
                    rationalDenominator = D1 * D2;
                    break;
                case '*':
                    rationalNumerator = N1 * N2;
                    rationalDenominator = D1 * D2;
                    break;
                case '/':
                    rationalNumerator = N1 * D2;
                    rationalDenominator = N2 * D1;
                    break;
                default:
                    throw new IllegalArgumentException("Operação inválida");
            }

            long gcd = Algebra.gcdLoop(Math.abs(rationalNumerator), Math.abs(rationalDenominator));

            int simplifiedNumerator = (int) (rationalNumerator / gcd);
            int simplifiedDenominator = (int) (rationalDenominator / gcd);

            sb.append(rationalNumerator).append('/').append(rationalDenominator).append(" = ")
                    .append(simplifiedNumerator).append('/').append(simplifiedDenominator).append(LS);
        }

        return sb.toString();
    }

}
