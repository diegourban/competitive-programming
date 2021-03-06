package urban.uri_online_judge.beginner._1959;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;

/**
 * Regular Simple Polygons
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1959
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        long n = reader.nextLong();
        long l = reader.nextLong();
        reader.close();

        long p = n * l;
        return p + System.lineSeparator();
    }

}
