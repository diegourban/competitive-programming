package urban.uri_online_judge.beginner._2166;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;

/**
 * Square Root of 2
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/2166
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    private static final NumberFormat fmt;

    static {
        DecimalFormatSymbols dfs = DecimalFormatSymbols.getInstance();
        dfs.setDecimalSeparator('.');
        fmt = new DecimalFormat("#0.0000000000", dfs);
    }

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        int n = reader.nextInt();
        reader.close();

        // 13 repetitions already gives a 10 decimal places precision, there is no need to do more than that
        if (n > 13) {
            n = 13;
        }
        double d = denominatorRepetition(n);

        return fmt.format(1.0 + d) + System.lineSeparator();
    }

    private static double denominatorRepetition(int n) {
        if (n == 0) {
            return 0;
        }
        return 1 / (2 + denominatorRepetition(n - 1));
    }

}
