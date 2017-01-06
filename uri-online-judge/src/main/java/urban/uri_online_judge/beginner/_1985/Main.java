package urban.uri_online_judge.beginner._1985;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Map;

/**
 * MacPRONALTS
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1985
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    private static final NumberFormat FORMAT;
    private static final Map<Integer, Double> MENU;

    static {
        DecimalFormatSymbols dfs = DecimalFormatSymbols.getInstance();
        dfs.setDecimalSeparator('.');
        FORMAT = new DecimalFormat("#0.00", dfs);

        MENU = new HashMap<>();
        MENU.put(1001, 1.50);
        MENU.put(1002, 2.50);
        MENU.put(1003, 3.50);
        MENU.put(1004, 4.50);
        MENU.put(1005, 5.50);
    }

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        int p = reader.nextInt();
        double sum = 0.0;
        for (int i = 0; i < p; i++) {
            int pn = reader.nextInt();
            int pq = reader.nextInt();
            sum += MENU.get(pn) * pq;
        }
        reader.close();

        return FORMAT.format(sum) + System.lineSeparator();
    }

}
