package urban.uri_online_judge.beginner._1043;

import urban.common.Reader;
import urban.common.math.Geometry;

import java.io.IOException;
import java.io.InputStream;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;

/**
 * Triangle
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1043
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    private static final NumberFormat formatter;

    static {
        DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance();
        decimalFormatSymbols.setDecimalSeparator('.');
        formatter = new DecimalFormat("#0.0", decimalFormatSymbols);
        formatter.setRoundingMode(RoundingMode.CEILING);
    }

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        double A = reader.nextDouble();
        double B = reader.nextDouble();
        double C = reader.nextDouble();
        reader.close();

        if (Geometry.isValidTriangle(A, B, C)) {
            return "Perimetro = " + formatter.format(A + B + C) + System.lineSeparator();
        } else {
            return "Area = " + formatter.format(.5 * (A + B) * C) + System.lineSeparator();
        }
    }

}
