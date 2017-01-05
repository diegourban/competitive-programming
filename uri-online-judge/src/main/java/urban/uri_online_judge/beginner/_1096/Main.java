package urban.uri_online_judge.beginner._1096;

import java.io.IOException;
import java.io.InputStream;

/**
 * Sequence IJ 2
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1096
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 9; i += 2) {
            sb.append("I=").append(i).append(" ").append("J=").append(7).append(System.lineSeparator());
            sb.append("I=").append(i).append(" ").append("J=").append(6).append(System.lineSeparator());
            sb.append("I=").append(i).append(" ").append("J=").append(5).append(System.lineSeparator());
        }

        return sb.toString();
    }

}

