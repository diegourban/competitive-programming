package urban.uri_online_judge.beginner._2126;

import urban.common.Reader;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Searching Subsequences
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/2126
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
        int caso = 0;
        while (true) {
            try {
                caso++;
                String n1 = reader.readLine();
                String n2 = reader.readLine();

                int pos = 0;
                int qtd = 0;
                int from = 0;
                int indexOf = n2.indexOf(n1, from);
                boolean contains = false;
                while (indexOf != -1) {
                    contains = true;
                    qtd++;
                    pos = indexOf;
                    from = indexOf + 1;
                    indexOf = n2.indexOf(n1, from);
                }
                pos++;

                sb.append("Caso #").append(caso).append(":").append(System.lineSeparator());
                if (contains) {
                    sb.append("Qtd.Subsequencias: ").append(qtd).append(System.lineSeparator());
                    sb.append("Pos: ").append(pos).append(System.lineSeparator());
                } else {
                    sb.append("Nao existe subsequencia").append(System.lineSeparator());
                }
                sb.append(System.lineSeparator());
            } catch (EOFException ex) {
                break;
            }
        }
        reader.close();

        return sb.toString();
    }
    
}
