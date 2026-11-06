package io.github.diegourban.algorithms.problems.string;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.diegourban.algorithms.io.Reader;
import io.github.diegourban.algorithms.testing.SampleLoader;
import java.io.IOException;
import java.io.InputStream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * One-Two-Three — beecrowd (formerly URI Online Judge) 1332.
 * <p>
 * https://judge.beecrowd.com/en/problems/view/1332
 * <p>
 * At most one letter is wrong, so a word within Hamming distance 1 of "one" is 1, of "two" is 2,
 * and anything else (the five-letter "three") is 3. O(1) per word.
 */
class OneTwoThreeTest {

    private static final SampleLoader SAMPLES = new SampleLoader("problems/string/one-two-three");

    static int solve(final String word) {
        if (hammingDistance(word, "one") <= 1) {
            return 1;
        }
        if (hammingDistance(word, "two") <= 1) {
            return 2;
        }
        return 3;
    }

    private static int hammingDistance(final String a, final String b) {
        if (a.length() != b.length()) {
            return Integer.MAX_VALUE;
        }
        var distance = 0;
        for (var i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                distance++;
            }
        }
        return distance;
    }

    static String run(final InputStream in) throws IOException {
        final var reader = new Reader(in);
        final var n = reader.nextInt();
        final var out = new StringBuilder();
        for (var i = 0; i < n; i++) {
            out.append(solve(reader.readLine().trim())).append('\n');
        }
        return out.toString();
    }

    @Test
    void recognisesCorrectSpellings() {
        assertThat(solve("one")).isEqualTo(1);
        assertThat(solve("two")).isEqualTo(2);
        assertThat(solve("three")).isEqualTo(3);
    }

    @Test
    void toleratesOneWrongLetterInAnyPosition() {
        assertThat(solve("une")).isEqualTo(1);
        assertThat(solve("oxe")).isEqualTo(1);
        assertThat(solve("oni")).isEqualTo(1);
        assertThat(solve("xwo")).isEqualTo(2);
        assertThat(solve("tvo")).isEqualTo(2);
        assertThat(solve("twu")).isEqualTo(2);
        assertThat(solve("threi")).isEqualTo(3);
    }

    @ParameterizedTest
    @ValueSource(strings = {"uri", "udebug"})
    void matchesSample(final String name) throws IOException {
        assertThat(run(SAMPLES.loadAsInputStream(name + ".in"))).isEqualTo(SAMPLES.loadAsString(name + ".out"));
    }
}
