package urban.uri_online_judge.mathematics._1197;

import urban.common.Reader;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Back to High School Physics
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1197
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    public static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);

        StringBuilder output = new StringBuilder();
        while (true) {
            try {
                final int v = reader.nextInt();
                final int t = reader.nextInt();
                output.append((v * 2) * t).append(System.lineSeparator());
            } catch (EOFException ex) {
                break;
            }
        }
        reader.close();

        return output.toString();
    }

}
