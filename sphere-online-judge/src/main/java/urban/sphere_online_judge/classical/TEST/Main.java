package urban.sphere_online_judge.classical.TEST;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;

/**
 * TEST - Life, the Universe, and Everything
 * <p>
 * http://www.spoj.com/problems/TEST/
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(System.in);
        StringBuilder sb = new StringBuilder();
        while (true) {
            int n = reader.nextInt();
            if (n == 42) {
                break;
            }
            sb.append(n).append(System.lineSeparator());
        }
        return sb.toString();
    }

}
