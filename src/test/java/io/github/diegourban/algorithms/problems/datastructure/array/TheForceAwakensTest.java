package io.github.diegourban.algorithms.problems.datastructure.array;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.diegourban.algorithms.io.Reader;
import io.github.diegourban.algorithms.testing.SampleLoader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * The Force Awakens — beecrowd (formerly URI Online Judge) 2163.
 * <p>
 * https://judge.beecrowd.com/en/problems/view/2163
 * <p>
 * Find the interior cell holding 42 whose eight neighbours are all 7, scanning row by row.
 * O(n·m) time, O(1) extra space.
 */
class TheForceAwakensTest {

    private static final int LIGHTSABER = 42;
    private static final int GUARD = 7;

    /** A 1-based terrain position. */
    record Position(int row, int column) {}

    static Optional<Position> solve(final int[][] terrain) {
        for (var i = 1; i < terrain.length - 1; i++) {
            for (var j = 1; j < terrain[i].length - 1; j++) {
                if (terrain[i][j] == LIGHTSABER && isSurroundedByGuards(terrain, i, j)) {
                    return Optional.of(new Position(i + 1, j + 1));
                }
            }
        }
        return Optional.empty();
    }

    private static boolean isSurroundedByGuards(final int[][] terrain, final int row, final int column) {
        for (var di = -1; di <= 1; di++) {
            for (var dj = -1; dj <= 1; dj++) {
                if ((di != 0 || dj != 0) && terrain[row + di][column + dj] != GUARD) {
                    return false;
                }
            }
        }
        return true;
    }

    static String run(final InputStream in) throws IOException {
        final var reader = new Reader(in);
        final var n = reader.nextInt();
        final var m = reader.nextInt();
        final var terrain = new int[n][m];
        for (var i = 0; i < n; i++) {
            for (var j = 0; j < m; j++) {
                terrain[i][j] = reader.nextInt();
            }
        }
        final var position = solve(terrain).orElse(new Position(0, 0));
        return position.row() + " " + position.column() + "\n";
    }

    @Test
    void findsTheGuardedLightsaber() {
        final int[][] terrain = {
            {7, 7, 7, 1},
            {7, 42, 7, 1},
            {7, 7, 7, 1},
        };
        assertThat(solve(terrain)).contains(new Position(2, 2));
    }

    @Test
    void ignoresLightsaberMissingAGuard() {
        final int[][] terrain = {
            {7, 7, 7},
            {7, 42, 7},
            {7, 7, 0},
        };
        assertThat(solve(terrain)).isEmpty();
    }

    @Test
    void ignoresLightsaberOnTheBorder() {
        final int[][] terrain = {
            {42, 7, 7},
            {7, 7, 7},
            {7, 7, 7},
        };
        assertThat(solve(terrain)).isEmpty();
    }

    @Test
    void skipsUnguardedCandidateAndFindsTheNextOne() {
        final int[][] terrain = {
            {7, 7, 7, 7, 7},
            {0, 42, 7, 42, 7},
            {7, 7, 7, 7, 7},
        };
        assertThat(solve(terrain)).contains(new Position(2, 4));
    }

    @ParameterizedTest
    @ValueSource(strings = {"uri1", "uri2", "uri3", "udebug"})
    void matchesSample(final String name) throws IOException {
        final var samples = new SampleLoader("problems/datastructure/array/the-force-awakens");
        assertThat(run(samples.loadAsInputStream(name + ".in"))).isEqualTo(samples.loadAsString(name + ".out"));
    }
}
