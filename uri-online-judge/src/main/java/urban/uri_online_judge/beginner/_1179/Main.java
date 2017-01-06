package urban.uri_online_judge.beginner._1179;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Array Fill IV
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1179
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);

        List<Integer> evens = new ArrayList<>(5);
        List<Integer> odds = new ArrayList<>(5);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 15; i++) {
            int n = reader.nextInt();
            if (n % 2 == 0) {
                evens.add(n);
            } else {
                odds.add(n);
            }

            if (evens.size() == 5) {
                printTo(evens, true, sb);
                evens.clear();
            }
            if (odds.size() == 5) {
                printTo(odds, false, sb);
                odds.clear();
            }
        }
        reader.close();

        printTo(odds, false, sb);
        printTo(evens, true, sb);
        return sb.toString();
    }

    private static void printTo(List<Integer> list, boolean isEven, StringBuilder sb) {
        for (int i = 0; i < list.size(); i++) {
            if (isEven) {
                sb.append("par[").append(i).append("] = ");
            } else {
                sb.append("impar[").append(i).append("] = ");
            }
            sb.append(list.get(i)).append(System.lineSeparator());
        }
    }

}
