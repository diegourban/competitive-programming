package urban.sphere_online_judge.classical.prime1;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;

/**
 * Prime Generator
 * <p>
 * http://www.spoj.com/problems/PRIME1/
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        int t = reader.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int m = reader.nextInt();
            int n = reader.nextInt();
            for (int j = m; j <= n; j++) {
                if (isPrime(j)) {
                    sb.append(j).append(System.lineSeparator());
                }
            }
            if (i < t - 1) {
                sb.append(System.lineSeparator());
            }
        }
        reader.close();
        return sb.toString();
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        } else if (number <= 3) {
            return true;
        } else if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }

        int i = 5;
        while (i * i <= number) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
            i += 6;
        }

        return true;
    }

}
