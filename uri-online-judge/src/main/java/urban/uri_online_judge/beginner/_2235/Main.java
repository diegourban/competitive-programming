package urban.uri_online_judge.beginner._2235;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;

/**
 * Walking in Time
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/2235
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        int a = reader.nextInt();
        int b = reader.nextInt();
        int c = reader.nextInt();
        reader.close();

        char t = 'N';
        if (canTravelTimeAndGoBackToPresent(a, b, c)) {
            t = 'S';
        }

        return t + System.lineSeparator();
    }

    private static boolean canTravelTimeAndGoBackToPresent(int a, int b, int c) {
        return hasTwoEqualCredits(a, b, c) || twoCreditsSumUpToTheThird(a, b, c);
    }

    private static boolean twoCreditsSumUpToTheThird(int a, int b, int c) {
        return Math.abs(a - b) == c || a + b == c;
    }

    private static boolean hasTwoEqualCredits(int a, int b, int c) {
        return a == b || b == c || a == c;
    }

}