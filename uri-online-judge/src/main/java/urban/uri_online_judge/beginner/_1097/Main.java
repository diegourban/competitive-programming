package urban.uri_online_judge.beginner._1097;

import java.io.IOException;
import java.io.InputStream;

/**
 * Sequence IJ 3
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1097
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        StringBuilder sb = new StringBuilder();

        for (int i = 1, j = 7; i <= 9; i += 2, j += 2) {
            sb.append("I=").append(i).append(" ").append("J=").append(j).append(System.lineSeparator());
            sb.append("I=").append(i).append(" ").append("J=").append(j - 1).append(System.lineSeparator());
            sb.append("I=").append(i).append(" ").append("J=").append(j - 2).append(System.lineSeparator());
        }

        return sb.toString();
    }

}
