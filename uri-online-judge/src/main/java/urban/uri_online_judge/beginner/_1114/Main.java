package urban.uri_online_judge.beginner._1114;

import java.io.IOException;
import java.io.InputStream;

import urban.common.Reader;

/**
 * Fixed Password
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1114
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        int pass = reader.nextInt();

        StringBuilder sb = new StringBuilder();

        while (pass != 2002) {
            sb.append("Senha Invalida").append(System.lineSeparator());
            pass = reader.nextInt();
        }
        sb.append("Acesso Permitido").append(System.lineSeparator());
        reader.close();

        return sb.toString();
    }

}
