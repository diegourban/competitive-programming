package urban.uri_online_judge.beginner._1019;

import java.io.IOException;
import java.io.InputStream;

import urban.common.Reader;

/**
 * Time Conversion
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1019
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        int N = reader.nextInt();
        reader.close();

        int hours = N / 60 / 60;
        N -= hours * 60 * 60;

        int minutes = N / 60;
        N -= minutes * 60;

        int seconds = N;

        return hours + ":" + minutes + ":" + seconds + System.lineSeparator();
    }

}
