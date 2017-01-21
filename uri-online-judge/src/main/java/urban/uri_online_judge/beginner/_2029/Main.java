package urban.uri_online_judge.beginner._2029;

import urban.common.Reader;
import urban.common.math.Geometry;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;

/**
 * Honey Reservoir
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/2029
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
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                double v = reader.nextDouble();
                double d = reader.nextDouble();

                double h = Geometry.heightOfCylinder(v, d / 2);

                sb.append("ALTURA").append(" = ").append(fmt.format(h)).append(System.lineSeparator());
                sb.append("AREA").append(" = ").append(fmt.format(Geometry.areaOfCircleFromDiameter(d))).append(System.lineSeparator());
            } catch (EOFException ex) {
                break;
            }
        }
        reader.close();

        return sb.toString();
    }

}