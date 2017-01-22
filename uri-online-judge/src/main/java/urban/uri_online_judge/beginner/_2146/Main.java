package urban.uri_online_judge.beginner._2146;

import urban.common.Reader;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Password
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/2146
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                int c = reader.nextInt();
                sb.append(c - 1).append(System.lineSeparator());
            } catch (EOFException ex) {
                break;
            }
        }
        reader.close();

        return sb.toString();
    }

}
