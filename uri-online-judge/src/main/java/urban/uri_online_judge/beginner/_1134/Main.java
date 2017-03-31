package urban.uri_online_judge.beginner._1134;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;

/**
 * Rest of a division
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1133
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);

        int totA = 0;
        int totG = 0;
        int totD = 0;

        loop:
        while (true) {
            int c = reader.nextInt();

            switch (c) {
                case 1:
                    totA++;
                    break;
                case 2:
                    totG++;
                    break;
                case 3:
                    totD++;
                    break;
                case 4:
                    break loop;
                default:
                    break;
            }

        }
        reader.close();

        StringBuilder sb = new StringBuilder();
        sb.append("MUITO OBRIGADO").append(System.lineSeparator());
        sb.append("Alcool: ").append(totA).append(System.lineSeparator());
        sb.append("Gasolina: ").append(totG).append(System.lineSeparator());
        sb.append("Diesel: ").append(totD).append(System.lineSeparator());

        return sb.toString();
    }

}