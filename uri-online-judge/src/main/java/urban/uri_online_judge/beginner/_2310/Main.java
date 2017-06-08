package urban.uri_online_judge.beginner._2310;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;

/**
 * Volleyball
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/2310
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
        final int n = reader.nextInt();

        int serviceAttempts = 0;
        int servicesSucceeded = 0;

        int blockAttempts = 0;
        int blocksSucceeded = 0;

        int attackAttempts = 0;
        int attacksSucceeded = 0;
        for (int i = 0; i < n; i++) {
            reader.readLine();

            serviceAttempts += reader.nextInt();
            blockAttempts += reader.nextInt();
            attackAttempts += reader.nextInt();

            servicesSucceeded += reader.nextInt();
            blocksSucceeded += reader.nextInt();
            attacksSucceeded += reader.nextInt();

        }
        reader.close();

        StringBuilder sb = new StringBuilder();
        sb.append("Pontos de Saque: ").append(fmt.format((servicesSucceeded * 100.0) / serviceAttempts)).append(" %.").append(System.lineSeparator());
        sb.append("Pontos de Bloqueio: ").append(fmt.format((blocksSucceeded * 100.0) / blockAttempts)).append(" %.").append(System.lineSeparator());
        sb.append("Pontos de Ataque: ").append(fmt.format((attacksSucceeded * 100.0) / attackAttempts)).append(" %.").append(System.lineSeparator());

        return sb.toString();
    }

}