package urban.uri_online_judge.beginner._2031;

import java.io.IOException;
import java.io.InputStream;

import urban.common.Reader;

/**
 * Rock, Paper, Airstrike
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/2031
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    private static final String PAPER = "papel";
    private static final String AIRSTRIKE = "ataque";

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        int n = reader.nextInt();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String p1Sign = reader.readLine();
            String p2Sign = reader.readLine();

            if (p1Sign.equals(p2Sign)) {
                if (AIRSTRIKE.equals(p1Sign)) {
                    sb.append("Aniquilacao mutua");
                } else if (PAPER.equals(p1Sign)) {
                    sb.append("Ambos venceram");
                } else { // ROCK
                    sb.append("Sem ganhador");
                }
            } else {
                if (AIRSTRIKE.equals(p1Sign) || PAPER.equals(p2Sign)) {
                    sb.append("Jogador 1 venceu");
                } else {
                    sb.append("Jogador 2 venceu");
                }
            }
            sb.append(System.lineSeparator());
        }
        reader.close();

        return sb.toString();
    }

}
