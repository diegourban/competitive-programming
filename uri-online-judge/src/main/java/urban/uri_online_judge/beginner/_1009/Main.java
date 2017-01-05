package urban.uri_online_judge.beginner._1009;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;

/**
 * Salary with Bonus
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1009
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(input));

        reader.readLine();
        double fixedSalary = Double.parseDouble(reader.readLine());
        double sales = Double.parseDouble(reader.readLine());
        double total = fixedSalary + (sales * 0.15);

        DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance();
        decimalFormatSymbols.setDecimalSeparator('.');
        NumberFormat formatter = new DecimalFormat("#0.00", decimalFormatSymbols);

        reader.close();

        return "TOTAL = R$ " + formatter.format(total) + System.lineSeparator();
    }

}
