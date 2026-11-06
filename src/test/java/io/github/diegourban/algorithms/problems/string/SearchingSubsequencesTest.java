package io.github.diegourban.algorithms.problems.string;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.diegourban.algorithms.io.Reader;
import io.github.diegourban.algorithms.testing.SampleLoader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * Searching Subsequences — beecrowd (formerly URI Online Judge) 2126.
 * <p>
 * https://judge.beecrowd.com/en/problems/view/2126
 * <p>
 * Count (possibly overlapping) occurrences of {@code pattern} in {@code text} with repeated
 * {@code indexOf}, remembering the last 1-based position. O(n·m) worst case on tiny inputs.
 */
class SearchingSubsequencesTest {

    private static final SampleLoader SAMPLES = new SampleLoader("problems/string/searching-subsequences");

    /** {@code count} occurrences, the last one starting at 1-based {@code lastPosition} (0 when none). */
    record Occurrences(int count, int lastPosition) {}

    static Occurrences solve(final String pattern, final String text) {
        var count = 0;
        var last = -1;
        for (var i = text.indexOf(pattern); i != -1; i = text.indexOf(pattern, i + 1)) {
            count++;
            last = i;
        }
        return new Occurrences(count, last + 1);
    }

    static String run(final InputStream in) throws IOException {
        final var reader = new Reader(in);
        final var out = new StringBuilder();
        var caseNumber = 0;
        while (true) {
            final String pattern;
            final String text;
            try {
                pattern = reader.readLine();
                text = reader.readLine();
            } catch (EOFException e) {
                break;
            }
            if (pattern.isEmpty() || text.isEmpty()) {
                break;
            }
            final var result = solve(pattern, text);
            out.append("Caso #").append(++caseNumber).append(":\n");
            if (result.count() == 0) {
                out.append("Nao existe subsequencia\n");
            } else {
                out.append("Qtd.Subsequencias: ").append(result.count()).append('\n');
                out.append("Pos: ").append(result.lastPosition()).append('\n');
            }
            out.append('\n');
        }
        return out.toString();
    }

    @Test
    void noOccurrence() {
        assertThat(solve("1", "23456789")).isEqualTo(new Occurrences(0, 0));
    }

    @Test
    void singleOccurrenceReportsItsPosition() {
        assertThat(solve("1", "1")).isEqualTo(new Occurrences(1, 1));
        assertThat(solve("1", "213")).isEqualTo(new Occurrences(1, 2));
        assertThat(solve("1", "231")).isEqualTo(new Occurrences(1, 3));
    }

    @Test
    void patternEqualToText() {
        final var number = "1" + "0".repeat(32);
        assertThat(solve(number, number)).isEqualTo(new Occurrences(1, 1));
    }

    @Test
    void overlappingOccurrencesAreCounted() {
        assertThat(solve("1", "1111")).isEqualTo(new Occurrences(4, 4));
        assertThat(solve("11", "1111")).isEqualTo(new Occurrences(3, 3));
    }

    @ParameterizedTest
    @ValueSource(strings = {"uri"})
    void matchesSample(final String name) throws IOException {
        assertThat(run(SAMPLES.loadAsInputStream(name + ".in"))).isEqualTo(SAMPLES.loadAsString(name + ".out"));
    }
}
