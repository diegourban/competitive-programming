package urban.uri_online_judge.strings._1120;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;

/**
 * Contract Revision
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1120
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

        String line = reader.readLine();
        while (!"0 0".equals(line)) {
            sb.append(new BigInteger(correct(line)));
            sb.append(System.lineSeparator());
            line = reader.readLine();
        }
        reader.close();

        return sb.toString();
    }

    private static String correct(String line) {
        final String[] splittedLine = line.split("\\s");
        final char d = splittedLine[0].charAt(0);
        final String n = splittedLine[1];

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n.length(); i++) {
            char currentChar = n.charAt(i);
            if (d != currentChar) {
                sb.append(currentChar);
            }
        }

        if (sb.length() == 0) {
            sb.append("0");
        }

        return sb.toString();
    }

}