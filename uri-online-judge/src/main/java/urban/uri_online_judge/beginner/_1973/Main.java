package urban.uri_online_judge.beginner._1973;

import java.io.IOException;
import java.io.InputStream;

import urban.common.Reader;

/**
 * Star Trek
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1973
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
        long totalSheeps = 0;
        long farmsStolen = 0;
        long stolenOneWay = 0;
        long stolenTwoWay = 0;
        boolean foundAnEven = false;
        for (int i = 0; i < n; i++) {
            int x = reader.nextInt();
            totalSheeps += x;

            if (!foundAnEven) {

                boolean isEven = x % 2 == 0;

                if (x > 0) {
                    stolenOneWay++;
                    stolenTwoWay++;
                }
                if (x - 1 > 0 && !isEven) {
                    stolenTwoWay++;
                }

                farmsStolen++;

                if (isEven) {
                    foundAnEven = true;
                }
            }

        }
        reader.close();

        long stolen = foundAnEven ? stolenTwoWay : stolenOneWay;

        return farmsStolen + " " + (totalSheeps - stolen) + System.lineSeparator();
    }

}