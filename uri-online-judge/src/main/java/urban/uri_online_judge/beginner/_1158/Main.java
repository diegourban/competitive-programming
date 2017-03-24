package urban.uri_online_judge.beginner._1158;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;

/**
 * Sum of Consecutive Odd Numbers III
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1158
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

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int x = reader.nextInt();
            int y = reader.nextInt();

            int sum = 0;

            int count = 0;
            while (count < y) {
                if (x % 2 != 0) {
                    sum += x;
                    count++;
                }
                x++;
            }

            sb.append(sum).append(System.lineSeparator());
        }
        reader.close();

        return sb.toString();
    }

}