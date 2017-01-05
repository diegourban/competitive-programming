package urban.uri_online_judge.beginner._1117;

import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;

import urban.common.Reader;

/**
 * Score Validation
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1117
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    private static final NumberFormat formatter;

    static {
        DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance();
        decimalFormatSymbols.setDecimalSeparator('.');
        formatter = new DecimalFormat("#0.00", decimalFormatSymbols);
    }

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);

        StringBuilder sb = new StringBuilder();

        int validScores = 0;
        double average = 0.0;
        while (validScores < 2) {
            double score = reader.nextDouble();
            if (score < 0 || score > 10) {
                sb.append("nota invalida").append(System.lineSeparator());
                continue;
            }

            validScores++;
            average += score;
        }
        reader.close();

        sb.append("media = ").append(formatter.format(average / 2.0)).append(System.lineSeparator());

        return sb.toString();
    }

}
