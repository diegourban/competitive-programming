package urban.uri_online_judge.beginner._1095;

import java.io.IOException;
import java.io.InputStream;

/**
 * Sequence IJ 1
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1095
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1, j = 60; j >= 0; i += 3, j -= 5) {
            sb.append("I=").append(i).append(" ").append("J=").append(j).append(System.lineSeparator());
        }

        return sb.toString();
    }

}
