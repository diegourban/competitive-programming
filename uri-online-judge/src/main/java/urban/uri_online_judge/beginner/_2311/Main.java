package urban.uri_online_judge.beginner._2311;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;

/**
 * Diving
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/2311
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    private static final NumberFormat fmt;

    static {
        DecimalFormatSymbols dfs = DecimalFormatSymbols.getInstance();
        dfs.setDecimalSeparator('.');
        fmt = new DecimalFormat("#0.00", dfs);
    }

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        final int n = reader.nextInt();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            final String competitorName = reader.readLine();
            final double degreeOfDifficulty = reader.nextDouble();
            double scoreSum = 0;
            double lowestScore = 11;
            double highestScore = -1;
            for (int j = 0; j < 7; j++) {
                double score = reader.nextDouble();
                scoreSum += score;
                if (score > highestScore) {
                    highestScore = score;
                }
                if (score < lowestScore) {
                    lowestScore = score;
                }
            }
            scoreSum -= lowestScore;
            scoreSum -= highestScore;
            sb.append(competitorName).append(" ").append(fmt.format(scoreSum * degreeOfDifficulty)).append(System.lineSeparator());
        }
        reader.close();

        return sb.toString();
    }

}