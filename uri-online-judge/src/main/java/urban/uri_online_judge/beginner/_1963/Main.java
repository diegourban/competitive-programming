package urban.uri_online_judge.beginner._1963;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;

/**
 * The Motion Picture
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1963
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    private static final DecimalFormatSymbols dfs = DecimalFormatSymbols.getInstance();
    private static final NumberFormat nf;

    static {
        dfs.setDecimalSeparator('.');
        nf = new DecimalFormat("#0.00", dfs);
    }

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        double a = reader.nextDouble();
        double b = reader.nextDouble();
        reader.close();

        double ppi = ((b - a) / a) * 100;

        return nf.format(ppi) + "%" + System.lineSeparator();
    }

}