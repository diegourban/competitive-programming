package urban.uri_online_judge.beginner._2164;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;

import static urban.common.math.Algebra.fibonacciBinetFormula;

/**
 * Fast Fibonacci
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/2164
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    private static final NumberFormat fmt;

    static {
        DecimalFormatSymbols dfs = DecimalFormatSymbols.getInstance();
        dfs.setDecimalSeparator('.');
        fmt = new DecimalFormat("#0.0", dfs);
    }

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        int n = reader.nextInt();
        reader.close();

        double fib = fibonacciBinetFormula(n);

        return fmt.format(fib) + System.lineSeparator();
    }

}
