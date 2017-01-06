package urban.uri_online_judge.beginner._1929;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;

/**
 * Triangle
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1929
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
        int d = reader.nextInt();
        reader.close();

        final String S = "S" + System.lineSeparator();

        if (isTriangle(a, b, c)) {
            return S;
        } else if (isTriangle(a, b, d)) {
            return S;
        } else if (isTriangle(a, c, d)) {
            return S;
        } else if (isTriangle(b, c, d)) {
            return S;
        }

        return "N" + System.lineSeparator();
    }

    private static boolean isTriangle(int a, int b, int c) {
        return (a + b > c) && (b + c > a) && (a + c > b);
    }

}