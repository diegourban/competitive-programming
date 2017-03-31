package urban.uri_online_judge.beginner._1914;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;

/**
 * Whose Turn Is It?
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1914
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        int qt = reader.nextInt();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < qt; i++) {
            String[] game = reader.readLine().split(" ");
            String p1Name = game[0];
            String p1Choice = game[1];
            String p2Name = game[2];
            // String p2Choice = game[3]; // p2Choice will be different from
            // p1Choice, I do not need to compare with it, so i do not need it

            long p1Move = reader.nextLong();
            long p2Move = reader.nextLong();

            boolean isEven = (p1Move + p2Move) % 2 == 0;
            if (isEven) {
                if ("PAR".equals(p1Choice)) {
                    sb.append(p1Name);
                } else {
                    sb.append(p2Name);
                }
            } else {
                if ("IMPAR".equals(p1Choice)) {
                    sb.append(p1Name);
                } else {
                    sb.append(p2Name);
                }
            }

            sb.append(System.lineSeparator());
        }
        reader.close();

        return sb.toString();
    }

}
