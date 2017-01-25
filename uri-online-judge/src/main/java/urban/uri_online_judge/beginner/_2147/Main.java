package urban.uri_online_judge.beginner._2147;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;

/**
 * Galopeira
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/2147
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    private static final NumberFormat fmt;

    static {
        DecimalFormatSymbols dfs = DecimalFormatSymbols.getInstance();
        dfs.setDecimalSeparator('.');
        fmt = new DecimalFormat("#0.00", dfs);
    }

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        int c = reader.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < c; i++) {
            String w = reader.readLine();
            sb.append(fmt.format(w.length() / 100.0)).append(System.lineSeparator());
        }
        reader.close();

        return sb.toString();
    }

}
