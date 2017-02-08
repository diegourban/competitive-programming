package urban.sphere_online_judge.basics.strhh;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;

/**
 * Half of the half
 * <p>
 * http://www.spoj.com/problems/STRHH/
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        StringBuilder sb = new StringBuilder();

        final int t = reader.nextInt();
        for (int i = 0; i < t; i++) {
            String k = reader.readLine();
            String half = k.substring(0, k.length() / 2);
            for (int j = 0; j < half.length(); j += 2) {
                sb.append(half.charAt(j));
            }
            sb.append(System.lineSeparator());
        }
        reader.close();

        return sb.toString();
    }

}
