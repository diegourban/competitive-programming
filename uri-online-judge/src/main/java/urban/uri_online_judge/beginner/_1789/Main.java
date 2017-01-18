package urban.uri_online_judge.beginner._1789;

import urban.common.Reader;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/**
 * The Race of Slugs
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1789
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
                int l = reader.nextInt();
                int fasterSlugSpeed = 0;
                for (int i = 0; i < l; i++) {
                    int v = reader.nextInt();
                    if (v > fasterSlugSpeed) {
                        fasterSlugSpeed = v;
                    }
                }
                if (fasterSlugSpeed >= 20) {
                    sb.append(3);
                } else if (fasterSlugSpeed >= 10) {
                    sb.append(2);
                } else {
                    sb.append(1);
                }
                sb.append(System.lineSeparator());
            } catch (EOFException ex) {
                break;
            }
        }
        reader.close();

        return sb.toString();
    }

}
