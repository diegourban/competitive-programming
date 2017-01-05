package urban.uri_online_judge.beginner._1115;

import java.io.IOException;
import java.io.InputStream;

import urban.common.Reader;

/**
 * Quadrant
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1115
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        int x = reader.nextInt();
        int y = reader.nextInt();

        StringBuilder sb = new StringBuilder();

        while (x != 0 && y != 0) {
            if (x > 0) {
                if (y > 0) {
                    sb.append("primeiro");
                } else {
                    sb.append("quarto");
                }
            } else {
                if (y > 0) {
                    sb.append("segundo");
                } else {
                    sb.append("terceiro");
                }
            }

            sb.append(System.lineSeparator());
            x = reader.nextInt();
            y = reader.nextInt();
        }
        reader.close();

        return sb.toString();
    }

}
