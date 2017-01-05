package urban.uri_online_judge.beginner._1173;

import java.io.IOException;
import java.io.InputStream;

import urban.common.Reader;

/**
 * Array fill I
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1173
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        int v = reader.nextInt();
        reader.close();

        int[] array = new int[10];
        for (int i = 0, x = v; i < 10; i++, x *= 2) {
            array[i] = x;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            sb.append("N[").append(i).append("] = ").append(array[i]).append(System.lineSeparator());
        }

        return sb.toString();
    }

}
