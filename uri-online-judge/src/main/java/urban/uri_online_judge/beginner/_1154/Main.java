package urban.uri_online_judge.beginner._1154;

import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;

import urban.common.Reader;

/**
 * Ages
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1154
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    private static final NumberFormat numberFormat;

    static {
        DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance();
        decimalFormatSymbols.setDecimalSeparator('.');
        numberFormat = new DecimalFormat("#0.00", decimalFormatSymbols);
    }

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        int n = reader.nextInt();

        int agesSum = 0;
        int agesTot = 0;

        while (n >= 0) {
            agesSum += n;
            agesTot++;

            n = reader.nextInt();
        }
        reader.close();

        return numberFormat.format(agesSum / (agesTot * 1.0)) + System.lineSeparator();
    }

}
