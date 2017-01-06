package urban.uri_online_judge.beginner._1079;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;

/**
 * Weighted Averages
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1079
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    private static final NumberFormat formatter;

    static {
        DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance();
        decimalFormatSymbols.setDecimalSeparator('.');
        formatter = new DecimalFormat("#0.0", decimalFormatSymbols);
    }

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        int n = reader.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            double average = 0;
            average += (reader.nextDouble() * 2.0);
            average += (reader.nextDouble() * 3.0);
            average += (reader.nextDouble() * 5.0);
            sb.append(formatter.format(average / 10.0)).append(System.lineSeparator());
        }
        reader.close();

        return sb.toString();
    }

}
