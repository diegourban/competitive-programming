package io.github.diegourban.algorithms.problems.simulation;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.diegourban.algorithms.io.Reader;
import io.github.diegourban.algorithms.testing.SampleLoader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * Maester's Map — beecrowd (formerly URI Online Judge) 1855.
 * <p>
 * https://judge.beecrowd.com/en/problems/view/1855
 * <p>
 * Walk the map from the top-left corner, turning on every arrow, until reaching the chest ({@code *}),
 * leaving the map, or stepping on an arrow already used (a loop). Each arrow is used at most once and
 * dots between arrows are crossed at most once per arrow, so O(width * height) time and space.
 */
class MaestersMapTest {

    private final SampleLoader samples = new SampleLoader("problems/simulation/maesters-map");

    static boolean solve(List<String> rows) {
        var height = rows.size();
        var width = height == 0 ? 0 : rows.getFirst().length();
        var usedArrows = new boolean[height][width];
        var row = 0;
        var col = 0;
        var dRow = 0;
        var dCol = 0;
        while (row >= 0 && row < height && col >= 0 && col < width) {
            var cell = rows.get(row).charAt(col);
            if (cell == '*') {
                return true;
            }
            if (cell != '.') {
                if (usedArrows[row][col]) {
                    return false;
                }
                usedArrows[row][col] = true;
                dRow = switch (cell) {
                    case '^' -> -1;
                    case 'v' -> 1;
                    default -> 0;
                };
                dCol = switch (cell) {
                    case '<' -> -1;
                    case '>' -> 1;
                    default -> 0;
                };
            }
            if (dRow == 0 && dCol == 0) {
                return false;
            }
            row += dRow;
            col += dCol;
        }
        return false;
    }

    static String run(InputStream in) throws IOException {
        var reader = new Reader(in);
        var width = reader.nextInt();
        var height = reader.nextInt();
        var rows = new ArrayList<String>(height);
        for (var i = 0; i < height; i++) {
            rows.add(reader.readLine().substring(0, width));
        }
        return (solve(rows) ? "*" : "!") + "\n";
    }

    @Test
    void followsArrowsToTheChest() {
        assertThat(solve(List.of(">..v", "....", "*..<"))).isTrue();
    }

    @Test
    void walksStraightIntoTheChest() {
        assertThat(solve(List.of(">....*"))).isTrue();
    }

    @Test
    void reusingAnArrowIsALoop() {
        assertThat(solve(List.of(">.....v", ".......", "^.....<"))).isFalse();
    }

    @Test
    void walkingOffTheMapIsAFailure() {
        assertThat(solve(List.of(">....>"))).isFalse();
        assertThat(solve(List.of("^....*"))).isFalse();
    }

    @ParameterizedTest
    @ValueSource(
            strings = {
                "sampleFindChest1", "sampleFindChest2", "sampleFindChest3",
                "sampleFindChest4", "sampleFindChest5", "sampleFindChest6",
            })
    void samplesThatReachTheChest(String name) throws IOException {
        assertThat(run(samples.loadAsInputStream(name + ".in"))).isEqualTo("*\n");
    }

    @ParameterizedTest
    @ValueSource(
            strings = {
                "sampleLoop1", "sampleLoop2", "sampleLoop3", "sampleLoop4",
                "sampleOutOfBounds1", "sampleOutOfBounds2", "sampleOutOfBounds3", "sampleOutOfBounds4",
            })
    void samplesThatLoopOrLeaveTheMap(String name) throws IOException {
        assertThat(run(samples.loadAsInputStream(name + ".in"))).isEqualTo("!\n");
    }
}
