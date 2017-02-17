package urban.uri_online_judge.strings._1168;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;

/**
 * LED
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1168
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    private static final int[] LEDS = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        StringBuilder sb = new StringBuilder();

        final int n = reader.nextInt();
        for (int i = 0; i < n; i++) {
            BigInteger ledSum = new BigInteger("0");
            String line = reader.readLine();
            for (int j = 0; j < line.length(); j++) {
                int digit = Character.digit(line.charAt(j), 10);
                ledSum = ledSum.add(new BigInteger(String.valueOf(LEDS[digit])));
            }
            sb.append(ledSum).append(" leds").append(System.lineSeparator());
        }
        reader.close();

        return sb.toString();
    }

}