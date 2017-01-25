package urban.uri_online_judge.beginner._1827;

import urban.common.Reader;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Square Array IV
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1827
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
        while(true) {
            try {
                int n = reader.nextInt();
                int innerRange = n / 3;
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if(i >= innerRange && j >= innerRange && i < n - innerRange && j < n - innerRange) {
                            if(n / 2 == i && i == j) {
                                sb.append(4);
                            } else {
                                sb.append(1);
                            }
                        } else {
                            if (j + i == n - 1) {
                                sb.append(3);
                            } else if (j - i == 0) {
                                sb.append(2);
                            } else {
                                sb.append(0);
                            }
                        }
                    }
                    sb.append(System.lineSeparator());
                }

                sb.append(System.lineSeparator());
            } catch(EOFException ex) {
                break;
            }
        }
        reader.close();

        return sb.toString();
    }

}
