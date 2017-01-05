package urban.uri_online_judge.beginner._1044;

import java.io.IOException;
import java.io.InputStream;

import urban.common.Reader;

/**
 * Multiples
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1044
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        int A = reader.nextInt();
        int B = reader.nextInt();
        reader.close();

        if (A >= B) {
            if (A % B == 0) {
                return "Sao Multiplos" + System.lineSeparator();
            }
        } else {
            if (B % A == 0) {
                return "Sao Multiplos" + System.lineSeparator();
            }
        }

        return "Nao sao Multiplos" + System.lineSeparator();
    }

}
