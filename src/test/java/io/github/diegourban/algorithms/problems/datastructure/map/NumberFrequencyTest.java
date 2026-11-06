package io.github.diegourban.algorithms.problems.datastructure.map;

import io.github.diegourban.algorithms.io.Reader;
import io.github.diegourban.algorithms.testing.SampleLoader;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.IOException;
import java.io.InputStream;
import java.util.SortedMap;
import java.util.TreeMap;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.entry;

/**
 * Number Frequence — beecrowd (formerly URI Online Judge) 1171.
 * <p>
 * https://judge.beecrowd.com/en/problems/view/1171
 * <p>
 * Count occurrences in a sorted map so the values come out in ascending order. O(n log n) time.
 */
class NumberFrequencyTest {

    static SortedMap<Integer, Integer> solve(int[] numbers) {
        var frequency = new TreeMap<Integer, Integer>();
        for (var x : numbers) {
            frequency.merge(x, 1, Integer::sum);
        }
        return frequency;
    }

    static String run(InputStream in) throws IOException {
        var reader = new Reader(in);
        var numbers = new int[reader.nextInt()];
        for (var i = 0; i < numbers.length; i++) {
            numbers[i] = reader.nextInt();
        }
        var out = new StringBuilder();
        solve(numbers).forEach((x, count) -> out.append(x).append(" aparece ").append(count).append(" vez(es)\n"));
        return out.toString();
    }

    @Test
    void countsOccurrencesInAscendingOrder() {
        assertThat(solve(new int[]{8, 10, 8, 260, 4, 10, 10}))
                .containsExactly(entry(4, 1), entry(8, 2), entry(10, 3), entry(260, 1));
    }

    @Test
    void singleValue() {
        assertThat(solve(new int[]{5})).containsExactly(entry(5, 1));
    }

    @Test
    void emptyInputHasNoFrequencies() {
        assertThat(solve(new int[]{})).isEmpty();
    }

    @ParameterizedTest
    @ValueSource(strings = {"uri", "udebug"})
    void matchesSample(String name) throws IOException {
        var samples = new SampleLoader("problems/datastructure/map/number-frequency");
        assertThat(run(samples.loadAsInputStream(name + ".in"))).isEqualTo(samples.loadAsString(name + ".out"));
    }
}
