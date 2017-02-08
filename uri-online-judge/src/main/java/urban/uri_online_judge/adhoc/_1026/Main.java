package urban.uri_online_judge.adhoc._1026;

import urban.common.Reader;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/**
 * To Carry or not to Carry
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1026
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    public static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);

        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                final long a = reader.nextLong();
                final long b = reader.nextLong();

                long sum = (~a & b) | (a & ~b);
                sb.append(sum);
                sb.append(System.lineSeparator());
            } catch (EOFException ex) {
                break;
            }
        }
        reader.close();

        return sb.toString();
    }


}
