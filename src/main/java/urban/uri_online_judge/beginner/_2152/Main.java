package urban.uri_online_judge.beginner._2152;

import urban.uri_online_judge.Reader;

import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

/**
 * Pepe, I Already Took the Candle!
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/2152
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        int t = reader.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int h = reader.nextInt();
            int m = reader.nextInt();
            int o = reader.nextInt();
            sb.append(LocalTime.of(h,m).format(dtf)).append(" - A porta ");
            if(o == 1) {
                sb.append("abriu");
            } else {
                sb.append("fechou");
            }
            sb.append("!").append(System.lineSeparator());
        }
        reader.close();

        return sb.toString();
    }

}
