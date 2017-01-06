package urban.uri_online_judge.beginner._1175;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;

/**
 * Array change 1
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1175
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);

        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[(array.length - 1) - i] = reader.nextInt();
        }
        reader.close();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append("N[").append(i).append("] = ").append(array[i]).append(System.lineSeparator());
        }

        return sb.toString();
    }

}
