package urban.uri_online_judge.beginner._1142;

import java.io.IOException;
import java.io.InputStream;

import urban.common.Reader;

/**
 * PUM
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1142
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
        reader.close();

        StringBuilder sb = new StringBuilder();
        for (int i = 0, j = 1; i < n; i++, j += 4) {
            sb.append(j).append(" ").append(j + 1).append(" ").append(j + 2).append(" ").append("PUM")
                    .append(System.lineSeparator());
        }

        return sb.toString();
    }

}
