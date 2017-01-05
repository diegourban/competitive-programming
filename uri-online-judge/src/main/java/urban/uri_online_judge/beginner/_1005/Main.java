package urban.uri_online_judge.beginner._1005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Locale;

/**
 * Average 1
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1005
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    public static String main(InputStream input) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(input));

        double A = Double.parseDouble(reader.readLine());
        double B = Double.parseDouble(reader.readLine());
        double MEDIA = ((A * 3.5d) + (B * 7.5d)) / 11d;

        reader.close();

        return String.format(Locale.ROOT, "MEDIA = %.5f", MEDIA) + System.lineSeparator();
    }

}
