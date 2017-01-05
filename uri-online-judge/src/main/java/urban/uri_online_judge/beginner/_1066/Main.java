package urban.uri_online_judge.beginner._1066;

import java.io.IOException;
import java.io.InputStream;

import urban.common.Reader;

/**
 * Even, Odd, Positive and Negative
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1066
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        int even = 0;
        int odd = 0;
        int positive = 0;
        int negative = 0;

        Reader reader = new Reader(input);
        for (int i = 0; i < 5; i++) {
            int n = reader.nextInt();
            if (n % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            if (n > 0) {
                positive++;
            } else if (n < 0) {
                negative++;
            }
        }
        reader.close();

        StringBuilder sb = new StringBuilder();
        sb.append(even).append(" valor(es) par(es)").append(System.lineSeparator());
        sb.append(odd).append(" valor(es) impar(es)").append(System.lineSeparator());
        sb.append(positive).append(" valor(es) positivo(s)").append(System.lineSeparator());
        sb.append(negative).append(" valor(es) negativo(s)").append(System.lineSeparator());

        return sb.toString();
    }

}
