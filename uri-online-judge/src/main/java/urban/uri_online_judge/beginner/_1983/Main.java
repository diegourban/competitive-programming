package urban.uri_online_judge.beginner._1983;

import urban.uri_online_judge.Reader;

import java.io.IOException;
import java.io.InputStream;

/**
 * The Chosen
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1983
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        int n = reader.nextInt();

        int mMax = 0;
        double noteMax = 0;
        for (int i = 0; i < n; i++) {
            int m = reader.nextInt();
            double note = reader.nextDouble();
            if (note > noteMax) {
                noteMax = note;
                mMax = m;
            }
        }

        if (noteMax < 8.0) {
            return "Minimum note not reached" + System.lineSeparator();
        }

        return mMax + System.lineSeparator();
    }

}
