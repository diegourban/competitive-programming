package urban.uri_online_judge.beginner._1855;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;

/**
 * Maester's Map
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/1855
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);
        int x = reader.nextInt();
        int y = reader.nextInt();
        char[][] map = readMap(x, y, reader);
        reader.close();

        Set<String> terrainsPassed = new HashSet<>();

        String result = "!";

        int i = 0;
        int j = 0;
        char direction = ' ';
        loop:
        while (true) {
            if (pointsToOutOfBounds(i, j, x, y)) {
                break loop;
            }

            char c = map[i][j];

            if (c == '*') {
                result = "*";
                break loop;
            }

            if (c != '.') {
                String terrain = i + "," + j;
                if (terrainsPassed.contains(terrain)) {
                    break loop;
                }
                terrainsPassed.add(terrain);
                direction = c;
            }

            if (direction == '>') {
                j++;
            } else if (direction == '<') {
                j--;
            } else if (direction == '^') {
                i--;
            } else if (direction == 'v') {
                i++;
            }
        }

        return result + System.lineSeparator();
    }

    private static char[][] readMap(int x, int y, Reader reader) throws IOException {
        char[][] map = new char[y][x];

        for (int i = 0; i < y; i++) {
            char[] split = reader.readLine().toCharArray();
            for (int j = 0; j < x; j++) {
                map[i][j] = split[j];
            }
        }
        return map;
    }

    private static boolean pointsToOutOfBounds(int i, int j, int mapWidth, int mapHeight) {
        return i < 0 || i >= mapHeight || j < 0 || j >= mapWidth;
    }

}
