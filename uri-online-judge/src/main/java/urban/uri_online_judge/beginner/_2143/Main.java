package urban.uri_online_judge.beginner._2143;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;

/**
 * The Return of Radar
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/2143
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
        int t = reader.nextInt();
        while(t != 0) {
            for(int i = 0; i < t; i++) {
                int n = reader.nextInt();
                if(n % 2 == 0) {
                    sb.append((n * 2) - 2);
                } else {
                    sb.append((n * 2) - 1);
                }
                sb.append(System.lineSeparator());
            }
            t = reader.nextInt();
        }
        reader.close();

        return sb.toString();
    }

}
