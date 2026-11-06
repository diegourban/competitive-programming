package io.github.diegourban.algorithms.problems.datastructure.stack;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.diegourban.algorithms.io.Reader;
import io.github.diegourban.algorithms.testing.SampleLoader;
import java.io.IOException;
import java.io.InputStream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * Diamonds and Sand — beecrowd (formerly URI Online Judge) 1069.
 * <p>
 * https://judge.beecrowd.com/en/problems/view/1069
 * <p>
 * Count matched {@code <>} pairs, ignoring sand ({@code .}). The stack of open {@code <} is just a
 * counter; each {@code >} pops one if available. O(n) time, O(1) space.
 */
class DiamondsAndSandTest {

    static int solve(String mine) {
        var open = 0;
        var diamonds = 0;
        for (var c : mine.toCharArray()) {
            if (c == '<') {
                open++;
            } else if (c == '>' && open > 0) {
                open--;
                diamonds++;
            }
        }
        return diamonds;
    }

    static String run(InputStream in) throws IOException {
        var reader = new Reader(in);
        var n = reader.nextInt();
        var out = new StringBuilder();
        for (var i = 0; i < n; i++) {
            out.append(solve(reader.readLine())).append('\n');
        }
        return out.toString();
    }

    @Test
    void countsNestedAndSequentialDiamonds() {
        assertThat(solve("<..><.<..>>")).isEqualTo(3);
    }

    @Test
    void unmatchedOpeningsDoNotCount() {
        assertThat(solve("<<<..<......<<<<....>")).isEqualTo(1);
        assertThat(solve("<")).isZero();
    }

    @Test
    void closingWithoutOpeningIsIgnored() {
        assertThat(solve(">")).isZero();
        assertThat(solve("><")).isZero();
        assertThat(solve(".>><..<<<>.<.>>..>...<<.>....")).isEqualTo(5);
    }

    @ParameterizedTest
    @ValueSource(strings = {"uri", "udebug"})
    void matchesSample(String name) throws IOException {
        var samples = new SampleLoader("problems/datastructure/stack/diamonds-and-sand");
        assertThat(run(samples.loadAsInputStream(name + ".in"))).isEqualTo(samples.loadAsString(name + ".out"));
    }
}
