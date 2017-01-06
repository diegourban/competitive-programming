package urban.uri_online_judge.beginner._1052;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;

/**
 * Month
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1052
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    private static final String[] MONTHS = {"January", "February", "March", "April", "May", "June", "July", "August",
            "September", "October", "November", "December"};

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        int month = reader.nextInt();
        reader.close();

        return MONTHS[month - 1] + System.lineSeparator();
    }

}
