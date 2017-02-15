package urban.uri_online_judge.mathematics._1170;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Blobs
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1170
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    public static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        final int n = reader.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            double x = reader.nextDouble();
            int days = 0;
            while (x > 1.0) {
                x = x / 2;
                days++;
            }
            sb.append(days).append(" dias").append(System.lineSeparator());
        }
        reader.close();

        Integer[] x= {1,2,3};
        Arrays.sort(x, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });

        return sb.toString();
    }

}
