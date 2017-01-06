package urban.uri_online_judge.beginner._1037;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;

/**
 * Interval
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1037
 *
 * @author Diego Leonardo Urban
 */

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        double N = reader.nextDouble();
        reader.close();

        if (N < 0) {
            return "Fora de intervalo" + System.lineSeparator();
        } else if (N <= 25) {
            return "Intervalo [0,25]" + System.lineSeparator();
        } else if (N <= 50) {
            return "Intervalo (25,50]" + System.lineSeparator();
        } else if (N <= 75) {
            return "Intervalo (50,75]" + System.lineSeparator();
        } else if (N <= 100) {
            return "Intervalo (75,100]" + System.lineSeparator();
        } else {
            return "Fora de intervalo" + System.lineSeparator();
        }
    }

}
