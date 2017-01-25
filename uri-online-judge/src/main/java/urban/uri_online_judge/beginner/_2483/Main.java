package urban.uri_online_judge.beginner._2483;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;

/**
 * Merry Christmaaas!
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/2483
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        int hi = reader.nextInt();
        reader.close();

        StringBuilder sb = new StringBuilder();
        sb.append("Feliz nat");
        for (int i = 0; i < hi; i++) {
            sb.append("a");
        }
        sb.append("l!");

        return sb.toString() + System.lineSeparator();
    }

}