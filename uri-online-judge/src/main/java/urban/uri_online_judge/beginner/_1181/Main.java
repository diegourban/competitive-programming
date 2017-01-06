package urban.uri_online_judge.beginner._1181;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;

/**
 * Line in Array
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1181
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

        // skiping not used inputs
        int offset = l * 12;
        if (offset > 0) {
            for (int i = 0; i < offset; i++) {
                reader.nextDouble();
            }
        }

        double sum = 0;
        for (int i = 0; i < 12; i++) {
            sum += reader.nextDouble();
        }
        reader.close();

        if (op == 'M') {
            return nf.format(sum / 12.0) + System.lineSeparator();
        }

        return nf.format(sum) + System.lineSeparator();
    }

}
