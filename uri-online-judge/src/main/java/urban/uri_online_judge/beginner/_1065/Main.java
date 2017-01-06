package urban.uri_online_judge.beginner._1065;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;

/**
 * Even Between five Numbers
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1065
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        int count = 0;
        for (int i = 0; i < 5; i++) {
            int n = reader.nextInt();
            if (n % 2 == 0) {
                count++;
            }
        }
        reader.close();

        return count + " valores pares" + System.lineSeparator();
    }

}
