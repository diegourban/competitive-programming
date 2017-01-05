package urban.uri_online_judge.beginner._1930;

import java.io.IOException;
import java.io.InputStream;

import urban.common.Reader;

/**
 * Electrical Outlet
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1930
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        int t1 = reader.nextInt();
        int t2 = reader.nextInt();
        int t3 = reader.nextInt();
        int t4 = reader.nextInt();
        reader.close();

        int d = t1 + t2 + t3 + t4 - 3;

        return d + System.lineSeparator();
    }
}
