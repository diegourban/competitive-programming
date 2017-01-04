package urban.uri_online_judge.beginner._2159;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;

/**
 * Approximate Number of Primes
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/2159
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    private static final NumberFormat fmt;

    static {
        DecimalFormatSymbols dfs = DecimalFormatSymbols.getInstance();
        dfs.setDecimalSeparator('.');
        fmt = new DecimalFormat("#0.0", dfs);
    }

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        int n = reader.nextInt();
        reader.close();

        double p = n / Math.log(n);
        double m = 1.25506 * p;

        return fmt.format(p) + " " + fmt.format(m) + System.lineSeparator();
    }

}
