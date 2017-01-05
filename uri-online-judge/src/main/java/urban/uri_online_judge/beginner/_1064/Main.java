package urban.uri_online_judge.beginner._1064;

import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;

import urban.common.Reader;

/**
 * Positives and Average
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1064
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
        int amount = 0;
        double sum = 0;
        for (int i = 0; i < 6; i++) {
            double d = reader.nextDouble();
            if (d >= 0) {
                amount++;
                sum += d;
            }
        }
        reader.close();

        double average = sum / amount;

        StringBuilder sb = new StringBuilder();
        sb.append(amount).append(" valores positivos").append(System.lineSeparator()).append(formatter.format(average))
                .append(System.lineSeparator());
        return sb.toString();
    }

}
