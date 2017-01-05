package urban.uri_online_judge.beginner._1010;

import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;

import urban.common.Reader;

/**
 * Simple Calculate
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1010
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);

        double total = 0;

        reader.nextInt();
        int units = reader.nextInt();
        double price = reader.nextDouble();
        total += units * price;

        reader.nextInt();
        units = reader.nextInt();
        price = reader.nextDouble();
        total += units * price;

        reader.close();

        return "VALOR A PAGAR: R$ " + String.format(Locale.ROOT, "%.2f", total) + System.lineSeparator();
    }

}
