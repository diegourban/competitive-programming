package urban.uri_online_judge.beginner._1118;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;

/**
 * Several Scores with Validation
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1118
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

        while (true) {
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
            sb.append("media = ").append(formatter.format(average / 2.0)).append(System.lineSeparator());

            int x = 0;
            while (true) {
                sb.append("novo calculo (1-sim 2-nao)").append(System.lineSeparator());
                x = reader.nextInt();
                if (x == 1 || x == 2) {
                    break;
                }
            }

            if (x == 2) {
                break;
            }
        }
        reader.close();

        return sb.toString();
    }

}
