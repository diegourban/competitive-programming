package urban.uri_online_judge.adhoc._1329;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;

/**
 * Head or Tail
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1329
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

        int n = reader.nextInt();
        while (n != 0) {
            int mary = 0;
            int john = 0;
            for (int i = 0; i < n; i++) {
                int r = reader.nextInt();
                if (r == 0) {
                    mary++;
                } else {
                    john++;
                }
            }
            sb.append("Mary won ").append(mary).append(" times");
            sb.append(" and John won ").append(john).append(" times");
            sb.append(System.lineSeparator());
            n = reader.nextInt();
        }
        reader.close();

        return sb.toString();
    }

}
