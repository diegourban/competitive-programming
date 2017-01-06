package urban.uri_online_judge.beginner._1038;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;

/**
 * Snack
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1038
 *
 * @author Diego Leonardo Urban
 */

/**
 * Snack
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1038
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    private final static double[] PRICES = new double[]{4, 4.5, 5, 2, 1.5};
    private static final NumberFormat formatter;

    static {
        DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance();
        decimalFormatSymbols.setDecimalSeparator('.');
        formatter = new DecimalFormat("##0.00", decimalFormatSymbols);
    }

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        int X = reader.nextInt();
        int Y = reader.nextInt();
        reader.close();

        return "Total: R$ " + formatter.format(PRICES[X - 1] * Y) + System.lineSeparator();
    }

}
