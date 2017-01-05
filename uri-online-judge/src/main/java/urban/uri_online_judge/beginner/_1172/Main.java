package urban.uri_online_judge.beginner._1172;

import java.io.IOException;
import java.io.InputStream;

import urban.common.Reader;

/**
 * Array Replacement I
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1172
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);

        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            int x = reader.nextInt();
            if (x <= 0) {
                x = 1;
            }
            array[i] = x;
        }

        reader.close();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            sb.append("X[").append(i).append("] = ").append(array[i]).append(System.lineSeparator());
        }

        return sb.toString();
    }

}
