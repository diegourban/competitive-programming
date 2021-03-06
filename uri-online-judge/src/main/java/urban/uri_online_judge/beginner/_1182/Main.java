package urban.uri_online_judge.beginner._1182;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;

/**
 * Column in Array
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1182
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    private static final NumberFormat nf;

    static {
        DecimalFormatSymbols dfs = DecimalFormatSymbols.getInstance();
        dfs.setDecimalSeparator('.');
        nf = new DecimalFormat("#0.0", dfs);
    }

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        int l = reader.nextInt();
        char op = reader.nextChar();

        double[][] array = new double[12][12];
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                double x = reader.nextDouble();
                array[i][j] = x;
                if (j == l) {
                    sum += x;
                }
            }
        }
        reader.close();

        if (op == 'M') {
            return nf.format(sum / 12.0) + System.lineSeparator();
        }

        return nf.format(sum) + System.lineSeparator();
    }

}