package urban.uri_online_judge.beginner._1984;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;

/**
 * The Pronalância Puzzle
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1984
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        long n = reader.nextLong();
        reader.close();

        long reversed = reverse(n);

        int nLength = String.valueOf(n).length();
        int reversedLength = String.valueOf(reversed).length();

        StringBuilder sb = new StringBuilder();
        if (reversedLength < nLength) {
            for (int i = 0; i < nLength - reversedLength; i++) {
                sb.append("0");
            }
        }
        sb.append(reversed).append(System.lineSeparator());

        return sb.toString();
    }

    public static long reverse(final long number) {
        long theNumber = number;
        long reverse = 0;
        long remainder = 0;
        do {
            remainder = theNumber % 10;
            reverse = reverse * 10 + remainder;
            theNumber = theNumber / 10;

        } while (theNumber > 0);

        return reverse;
    }

}
