package urban.uri_online_judge.beginner._1018;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;

/**
 * Banknotes
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1018
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    private static final String LS = System.lineSeparator();

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        int N = reader.nextInt();
        reader.close();

        int notasDe100 = 0;
        int notasDe50 = 0;
        int notasDe20 = 0;
        int notasDe10 = 0;
        int notasDe5 = 0;
        int notasDe2 = 0;

        StringBuilder sb = new StringBuilder();
        sb.append(N).append(LS);
        if (N / 100.0 >= 1.0) {
            notasDe100 = N / 100;
            N -= notasDe100 * 100;
        }
        sb.append(notasDe100).append(" nota(s) de R$ 100,00").append(LS);

        if (N / 50.0 >= 1.0) {
            notasDe50 = N / 50;
            N -= notasDe50 * 50;
        }
        sb.append(notasDe50).append(" nota(s) de R$ 50,00").append(LS);

        if (N / 20.0 >= 1.0) {
            notasDe20 = N / 20;
            N -= notasDe20 * 20;
        }
        sb.append(notasDe20).append(" nota(s) de R$ 20,00").append(LS);

        if (N / 10.0 >= 1.0) {
            notasDe10 = N / 10;
            N -= notasDe10 * 10;
        }
        sb.append(notasDe10).append(" nota(s) de R$ 10,00").append(LS);

        if (N / 5.0 >= 1.0) {
            notasDe5 = N / 5;
            N -= notasDe5 * 5;
        }
        sb.append(notasDe5).append(" nota(s) de R$ 5,00").append(LS);

        if (N / 2.0 >= 1.0) {
            notasDe2 = N / 2;
            N -= notasDe2 * 2;
        }
        sb.append(notasDe2).append(" nota(s) de R$ 2,00").append(LS);

        sb.append(N).append(" nota(s) de R$ 1,00").append(LS);

        return sb.toString();
    }

}
