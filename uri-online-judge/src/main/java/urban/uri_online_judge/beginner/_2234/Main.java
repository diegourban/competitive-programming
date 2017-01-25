package urban.uri_online_judge.beginner._2234;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;

/**
 * Hot Dogs
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/2234
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    private static final NumberFormat fmt;

    static {
        DecimalFormatSymbols dfs = DecimalFormatSymbols.getInstance();
        dfs.setDecimalSeparator('.');
        fmt = new DecimalFormat("#0.00", dfs);
    }

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        double h = reader.nextDouble();
        double p = reader.nextDouble();
        reader.close();

        return fmt.format(h / p) + System.lineSeparator();
    }

}