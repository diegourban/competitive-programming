package urban.uri_online_judge.beginner._1957;

import java.io.IOException;
import java.io.InputStream;

import urban.common.Reader;

/**
 * Converting to Hexadecimal
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1957
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        int v = reader.nextInt();
        reader.close();

        return Integer.toHexString(v).toUpperCase() + System.lineSeparator();
    }

}