package urban.uri_online_judge.beginner._1080;

import java.io.IOException;
import java.io.InputStream;

import urban.common.Reader;

/**
 * Highest and Position
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1080
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);

        int highest = 0;
        int position = 0;

        for (int i = 1; i <= 100; i++) {
            int n = reader.nextInt();
            if (n > highest) {
                highest = n;
                position = i;
            }
        }
        reader.close();

        return highest + System.lineSeparator() + position + System.lineSeparator();
    }

}
