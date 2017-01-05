package urban.uri_online_judge.beginner._1178;

import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;

import urban.common.Reader;

/**
 * Array Fill III
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1178
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    private static final NumberFormat nf;

    static {
        DecimalFormatSymbols dfs = DecimalFormatSymbols.getInstance();
        dfs.setDecimalSeparator('.');
        nf = new DecimalFormat("#0.0000", dfs);
    }

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        double x = new Double(reader.readLine());
        reader.close();

        StringBuilder sb = new StringBuilder();
        double y = x;
        for (int i = 0; i < 100; i++) {
            sb.append("N[").append(i).append("] = ").append(nf.format(y)).append(System.lineSeparator());
            y = y / 2;
        }

        return sb.toString();
    }

}
