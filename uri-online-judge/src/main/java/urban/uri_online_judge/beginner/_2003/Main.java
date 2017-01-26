package urban.uri_online_judge.beginner._2003;

import urban.common.Reader;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * Sunday Morning
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/2003
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
        LocalTime zero = LocalTime.of(0, 0);
        LocalTime combinedTime = LocalTime.of(8, 0);
        while (true) {
            try {
                String line = reader.readLine();
                if ("".equals(line)) {
                    break;
                }
                String[] h = line.split(":");
                LocalTime wakeUpTime = LocalTime.of(Integer.parseInt(h[0]), Integer.parseInt(h[1]));
                if (wakeUpTime.isAfter(LocalTime.of(7, 0))) {
                    LocalTime diff = wakeUpTime.minusHours(combinedTime.getHour()).minusMinutes(combinedTime.getMinute()).plusHours(1);
                    sb.append("Atraso maximo: ").append(zero.until(diff, ChronoUnit.MINUTES));
                } else {
                    sb.append("Atraso maximo: 0");
                }
                sb.append(System.lineSeparator());
            } catch (EOFException ex) {
                break;
            }
        }
        reader.close();

        return sb.toString();
    }

}
