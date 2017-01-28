package urban.uri_online_judge.beginner._1958;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;

/**
 * Scientific Notation
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1958
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        String line = reader.readLine();
        BigDecimal n = new BigDecimal(line);
        reader.close();

        double d = n.doubleValue();

        boolean negZero = line.charAt(0) == '-' && d == 0;
        String result = String.format("%+.4E", d).replace(',', '.');

        return modified(negZero, result) + System.lineSeparator();
    }

    private static final String modified(boolean negZero, String s) {
        String result = s;
        result = negZero ? result.replaceFirst("\\+0", "-0") : result;
        return result;
    }

}
