package urban.uri_online_judge.adhoc._1087;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;

/**
 * Queen
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1087
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

        int x1 = reader.nextInt();
        int y1 = reader.nextInt();
        int x2 = reader.nextInt();
        int y2 = reader.nextInt();
        while (x1 != 0 && y1 != 0 && x2 != 0 && y2 != 0) {
            int moves = queenMoves(x1, y1, x2, y2);
            sb.append(moves).append(System.lineSeparator());

            x1 = reader.nextInt();
            y1 = reader.nextInt();
            x2 = reader.nextInt();
            y2 = reader.nextInt();
        }
        reader.close();

        return sb.toString();
    }

    private static int queenMoves(int x1, int y1, int x2, int y2) {
        if (x1 == x2 && y1 == y2) {
            return 0;
        }

        if (x1 == x2 || y1 == y2 || x1 + y1 == x2 + y2 || x1 - y1 == x2 - y2) {
            return 1;
        }

        return 2;
    }
    
}
