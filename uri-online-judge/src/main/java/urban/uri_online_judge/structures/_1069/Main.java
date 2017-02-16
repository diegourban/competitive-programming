package urban.uri_online_judge.structures._1069;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;

/**
 * Diamonds and Sand
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1069
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        int n = reader.nextInt();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int open = 0;
            int closed = 0;
            String s = reader.readLine();
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '<') {
                    open++;
                } else if (s.charAt(j) == '>' && open > 0) {
                    open--;
                    closed++;
                }
            }
            sb.append(closed).append(System.lineSeparator());
        }

        return sb.toString();
    }

}
