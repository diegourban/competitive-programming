package urban.uri_online_judge.beginner._1160;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;

/**
 * Population Increase
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1160
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        int t = reader.nextInt();

        StringBuilder sb = new StringBuilder();

        loop:
        for (int i = 0; i < t; i++) {
            int pa = reader.nextInt();
            int pb = reader.nextInt();

            double ga = reader.nextDouble();
            double gb = reader.nextDouble();

            int sumA = pa;
            int sumB = pb;
            for (int y = 0; y <= 100; y++) {
                if (sumA > sumB) {
                    sb.append(y).append(" anos.").append(System.lineSeparator());
                    continue loop;
                }
                sumA += sumA * (ga / 100);
                sumB += sumB * (gb / 100);
            }
            sb.append("Mais de 1 seculo.").append(System.lineSeparator());
        }
        reader.close();

        return sb.toString();
    }

}
