package urban.uri_online_judge.beginner._1020;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;

/**
 * Age in Days
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1020
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        int ageInDays = reader.nextInt();
        reader.close();

        int years = ageInDays / 365;
        ageInDays -= years * 365;

        int months = ageInDays / 30;
        ageInDays -= months * 30;

        int days = ageInDays;

        StringBuilder sb = new StringBuilder();
        sb.append(years).append(" ano(s)").append(System.lineSeparator());
        sb.append(months).append(" mes(es)").append(System.lineSeparator());
        sb.append(days).append(" dia(s)").append(System.lineSeparator());
        return sb.toString();
    }

}
