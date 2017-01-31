package urban.uri_online_judge.beginner._2163;

import urban.common.Reader;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * The Force Awakens
 * <p>
 * https://www.urionlinejudge.com.br/judge/en/problems/view/2163
 *
 * @author Diego Leonardo Urban
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print(main(System.in));
    }

    protected static String main(InputStream input) throws IOException {
        Reader reader = new Reader(input);

        int n = reader.nextInt();
        int m = reader.nextInt();
        int[][] terrain = new int[n][m];

        List<int[]> possibleLightsaberCoordinates = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int t = reader.nextInt();
                terrain[i][j] = t;
                if (t == 42) {
                    possibleLightsaberCoordinates.add(new int[]{i, j});
                }
            }
        }
        reader.close();

        int[] lightsaberCoordinate = {-1, -1};
        for (int[] coordinate : possibleLightsaberCoordinates) {
            if (containsLightsaberAt(coordinate, terrain)) {
                lightsaberCoordinate = coordinate;
                break;
            }
        }

        return (lightsaberCoordinate[0] + 1) + " " + (lightsaberCoordinate[1] + 1) + System.lineSeparator();
    }

    private static boolean containsLightsaberAt(final int[] coordinate, final int[][] terrain) {
        int x = coordinate[0];
        int y = coordinate[1];
        if (x > 0 && x < terrain.length - 1 && y > 0 && y < terrain[0].length - 1) {
            return (terrain[x - 1][y - 1] == 7 && terrain[x - 1][y] == 7 && terrain[x - 1][y + 1] == 7
                    && terrain[x][y - 1] == 7 && terrain[x][y + 1] == 7
                    && terrain[x + 1][y - 1] == 7 && terrain[x + 1][y] == 7 && terrain[x + 1][y + 1] == 7);
        }
        return false;
    }

}
