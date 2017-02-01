package urban.uri_online_judge.beginner._2176;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;

/**
 * Parity
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/2176
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        String s = reader.readLine();
        reader.close();

        int count = 0;
        try {
            long n = Long.parseLong(s, 2);
            count = bitCount(n);
        } catch (Exception ex) {
            count = bitCount(s);
        }

        if (count % 2 == 0) {
            s += "0";
        } else {
            s += "1";
        }

        return s + System.lineSeparator();
    }

    private static int bitCount(long value) {
        int count = 0;
        while (value > 0) {           // until all bits are zero
            if ((value & 1) == 1)     // check lower bit
                count++;
            value >>= 1;              // shift bits, removing lower bit
        }
        return count;
    }

    private static int bitCount(String value) {
        String[] split = value.split("");
        int count = 0;
        for (String s : split) {
            if ("1".equals(s)) {
                count++;
            }
        }
        return count;
    }

}
