package urban.uri_online_judge.adhoc._1103;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.time.LocalDateTime;

/**
 * Alarm Clock
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1103
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    public static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        StringBuilder sb = new StringBuilder();

        int h1 = reader.nextInt();
        int m1 = reader.nextInt();
        int h2 = reader.nextInt();
        int m2 = reader.nextInt();
        while (!(h1 == 0 && m1 == 0 && h2 == 0 && m2 == 0)) {
            LocalDateTime begin = LocalDateTime.now().withHour(h1).withMinute(m1);
            LocalDateTime end = LocalDateTime.now().withHour(h2).withMinute(m2);
            if (end.isBefore(begin)) {
                end = end.plusDays(1);
            }
            long minutes = Duration.between(begin, end).toMinutes();
            sb.append(minutes).append(System.lineSeparator());

            h1 = reader.nextInt();
            m1 = reader.nextInt();
            h2 = reader.nextInt();
            m2 = reader.nextInt();
        }
        reader.close();

        return sb.toString();
    }
    
}
