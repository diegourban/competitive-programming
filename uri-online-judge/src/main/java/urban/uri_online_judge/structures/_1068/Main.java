package urban.uri_online_judge.structures._1068;

import urban.common.Reader;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Parenthesis Balance I
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1068
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

        while (true) {
            try {
                String n = reader.readLine();
                if (n.isEmpty()) {
                    break;
                }
                int openCount = 0;
                for (int i = 0; i < n.length(); i++) {
                    if (n.charAt(i) == '(') {
                        openCount++;
                    } else if (n.charAt(i) == ')') {
                        openCount--;
                    }
                    if (openCount < 0) {
                        break;
                    }
                }
                if (openCount == 0) {
                    sb.append("correct");
                } else {
                    sb.append("incorrect");
                }
                sb.append(System.lineSeparator());
            } catch (EOFException ex) {
                break;
            }
        }

        return sb.toString();
    }

}
