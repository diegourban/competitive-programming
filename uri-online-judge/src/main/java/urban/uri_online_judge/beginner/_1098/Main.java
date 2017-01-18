package urban.uri_online_judge.beginner._1098;

import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;

/**
 * Sequence IJ 4
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1098
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    private static final NumberFormat formatter;

    static {
        DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance();
        decimalFormatSymbols.setDecimalSeparator('.');
        formatter = new DecimalFormat("#0.#", decimalFormatSymbols);
    }

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) {
        StringBuilder sb = new StringBuilder();

        for (double i = 0, j = 1; i <= 2; i += 0.2, j += 0.2) {
            sb.append("I=").append(formatter.format(i)).append(" ").append("J=").append(formatter.format(j)).append(System.lineSeparator());
            sb.append("I=").append(formatter.format(i)).append(" ").append("J=").append(formatter.format(j + 1)).append(System.lineSeparator());
            sb.append("I=").append(formatter.format(i)).append(" ").append("J=").append(formatter.format(j + 2)).append(System.lineSeparator());
        }

        return sb.toString();
    }

}
