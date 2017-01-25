package urban.uri_online_judge.beginner._2162;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;

/**
 * Peaks and Valleys
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/2162
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
        int h1 = reader.nextInt();
        int h2 = reader.nextInt();
        boolean isPeak = false;
        if (h2 == h1) {
            return 0 + System.lineSeparator();
        }
        isPeak = h2 > h1;
        int previousH = h2;
        for (int i = 2; i < n; i++) {
            int h = reader.nextInt();
            if (isPeak) {
                if (h >= previousH) {
                    return 0 + System.lineSeparator();
                }
            } else {
                if (h <= previousH) {
                    return 0 + System.lineSeparator();
                }
            }
            previousH = h;
            isPeak = !isPeak;
        }
        reader.close();

        return 1 + System.lineSeparator();
    }

}
