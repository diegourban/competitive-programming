package urban.uri_online_judge.strings._1024;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;

/**
 * Encryption
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1024
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        StringBuilder sb = new StringBuilder();

        int n = reader.nextInt();
        for (int i = 0; i < n; i++) {
            String m = reader.readLine();
            String transformed = shiftSecondHalfOneDigitToLeft(reverse(shiftLettersThreeDigitsToRight(m)));
            sb.append(transformed);
            sb.append(System.lineSeparator());
        }
        reader.close();

        return sb.toString();
    }

    private static String shiftLettersThreeDigitsToRight(String msg) {
        String s = "";
        final int len = msg.length();
        for (int x = 0; x < len; x++) {
            if (Character.isAlphabetic(msg.charAt(x))) {
                s += (char) (msg.charAt(x) + 3);
            } else {
                s += msg.charAt(x);
            }
        }
        return s;
    }

    private static String reverse(String msg) {
        return new StringBuffer(msg).reverse().toString();
    }

    private static String shiftSecondHalfOneDigitToLeft(String msg) {
        String s = "";
        final int len = msg.length();
        final int half = len / 2;

        for (int x = 0; x < half; x++) {
            s += msg.charAt(x);
        }

        for (int x = half; x < len; x++) {
            s += (char) (msg.charAt(x) - 1);
        }
        return s;
    }

}