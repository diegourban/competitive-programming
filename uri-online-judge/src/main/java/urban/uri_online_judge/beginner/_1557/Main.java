package urban.uri_online_judge.beginner._1557;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;

/**
 * Square Matrix III
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1557
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
        while (n != 0) {
            int[][] matrix = new int[n][n];
            int exponent = (n - 1) * 2;
            int maxNumber = (int) Math.pow(2, exponent);

            int square = 1;
            for (int i = 0; i < n; i++) {
                int innerSquare = square;
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = innerSquare;
                    innerSquare = innerSquare * 2;
                }
                square = square * 2;
            }

            String format = "%1$" + String.valueOf(maxNumber).length() + "s";

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    sb.append(String.format(format, matrix[i][j]));
                    if (j < n - 1) {
                        sb.append(" ");
                    }
                }
                sb.append(System.lineSeparator());
            }
            sb.append(System.lineSeparator());
            n = reader.nextInt();
        }

        return sb.toString();
    }

}
