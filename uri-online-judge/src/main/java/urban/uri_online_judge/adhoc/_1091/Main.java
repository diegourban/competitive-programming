package urban.uri_online_judge.adhoc._1091;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;

/**
 * Division of Nlogonia
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1091
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

        int k = reader.nextInt();
        while (k != 0) {
            final int xd = reader.nextInt();
            final int yd = reader.nextInt();

            for (int i = 0; i < k; i++) {
                int x = reader.nextInt();
                int y = reader.nextInt();

                if (x == xd || y == yd) {
                    sb.append("divisa");
                } else {
                    if (x < xd) {
                        if (y < yd) {
                            sb.append("SO");
                        } else {
                            sb.append("NO");
                        }
                    } else {
                        if (y < yd) {
                            sb.append("SE");
                        } else {
                            sb.append("NE");
                        }
                    }
                }
                sb.append(System.lineSeparator());
            }

            k = reader.nextInt();
        }
        reader.close();

        return sb.toString();
    }

}
