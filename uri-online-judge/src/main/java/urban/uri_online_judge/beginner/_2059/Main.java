package urban.uri_online_judge.beginner._2059;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;

/**
 * Odd, Even or Cheating
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/2059
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        int p = reader.nextInt();
        int j1 = reader.nextInt();
        int j2 = reader.nextInt();
        int r = reader.nextInt();
        int a = reader.nextInt();
        reader.close();

        String result = null;

        if (r == 1) {
            if (a == 1) {
                result = "Jogador 2 ganha!";
            } else {
                result = "Jogador 1 ganha!";
            }
        } else {
            if (a == 1) {
                result = "Jogador 1 ganha!";
            } else {
                boolean isEven = (j1 + j2) % 2 == 0;
                if ((p == 1 && isEven) || (p == 0 && !isEven)) {
                    result = "Jogador 1 ganha!";
                } else {
                    result = "Jogador 2 ganha!";
                }
            }
        }

        return result + System.lineSeparator();
    }

}
