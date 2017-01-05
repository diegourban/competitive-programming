package urban.uri_online_judge.beginner._1013;

import java.io.IOException;
import java.io.InputStream;

import urban.common.Reader;

/**
 * The Greatest
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1013
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
        int C = reader.nextInt();
        reader.close();

        int max = A;
        if (B > max) {
            max = B;
        }
        if (C > max) {
            max = C;
        }

        return max + " eh o maior" + System.lineSeparator();
    }

}
