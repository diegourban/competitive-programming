package urban.uri_online_judge.beginner._1131;

import java.io.IOException;
import java.io.InputStream;

import urban.common.Reader;

/**
 * Grenais
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1131
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

        int totalGrenais = 0;
        int iv = 0;
        int gv = 0;
        int d = 0;

        while (true) {
            int i = reader.nextInt();
            int g = reader.nextInt();

            totalGrenais++;
            if (i > g) {
                iv++;
            } else if (g > i) {
                gv++;
            } else {
                d++;
            }

            sb.append("Novo grenal (1-sim 2-nao)").append(System.lineSeparator());
            int n = reader.nextInt();
            if (n == 2) {
                break;
            }
        }
        reader.close();

        sb.append(totalGrenais).append(" grenais").append(System.lineSeparator());
        sb.append("Inter:").append(iv).append(System.lineSeparator());
        sb.append("Gremio:").append(gv).append(System.lineSeparator());
        sb.append("Empates:").append(d).append(System.lineSeparator());
        if (iv > gv) {
            sb.append("Inter venceu mais").append(System.lineSeparator());
        } else if (gv > iv) {
            sb.append("Gremio venceu mais").append(System.lineSeparator());
        } else {
            sb.append("Não houve vencedor").append(System.lineSeparator());
        }

        return sb.toString();
    }

}