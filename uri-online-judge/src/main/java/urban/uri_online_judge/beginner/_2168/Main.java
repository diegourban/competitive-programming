package urban.uri_online_judge.beginner._2168;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;

/**
 * Twilight at Portland
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/2168
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        final int[][] downtown = buildDowntown(reader);
        reader.close();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < downtown.length - 1; i++) {
            for (int j = 0; j < downtown.length - 1; j++) {
                int[] block = getBlock(downtown, i, j);
                sb.append(getBlockSecurity(block));
            }
            if (i < downtown.length - 2) {
                sb.append(System.lineSeparator());
            }
        }
        return sb.toString() + System.lineSeparator();
    }

    private static int[][] buildDowntown(Reader reader) throws IOException {
        int n = reader.nextInt();
        int size = n + 1;
        int[][] downtown = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                downtown[i][j] = reader.nextInt();
            }
        }
        return downtown;
    }

    private static String getBlockSecurity(int[] block) {
        int totCam = 0;
        for (int c : block) {
            totCam += c;
            if (totCam > 1) {
                return "S";
            }
        }
        return "U";
    }

    private static int[] getBlock(int[][] downtown, int i, int j) {
        return new int[]{downtown[i][j], downtown[i][j + 1], downtown[i + 1][j], downtown[i + 1][j + 1]};
    }
    
}
