package urban.uri_online_judge.beginner._2139;

import urban.common.Reader;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

/**
 * Pedrinho's Christmas
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/2139
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    private static final LocalDate CHRISTMAS = LocalDate.of(2016, 12, 25);

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);

        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                int m = reader.nextInt();
                int d = reader.nextInt();
                LocalDate today = LocalDate.of(2016, m, d);

                String result = "";
                if (today.isEqual(CHRISTMAS)) {
                    result = "E natal!";
                } else if (today.isEqual(CHRISTMAS.minus(1, DAYS))) {
                    result = "E vespera de natal!";
                } else if (today.isAfter(CHRISTMAS)) {
                    result = "Ja passou!";
                } else {
                    long daysBetween = DAYS.between(today, CHRISTMAS);
                    result = "Faltam " + daysBetween + " dias para o natal!";
                }

                sb.append(result).append(System.lineSeparator());
            } catch (EOFException ex) {
                break;
            }
        }
        reader.close();

        return sb.toString();
    }

}
