package urban.uri_online_judge.beginner._1564;

import urban.common.Reader;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Brazil World Cup
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1564
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
                int a = reader.nextInt();
                if (a > 0) {
                    sb.append("vai ter duas!");
                } else {
                    sb.append("vai ter copa!");
                }
                sb.append(System.lineSeparator());
            } catch (EOFException ex) {
                break;
            }
        }

        return sb.toString();
    }

}
