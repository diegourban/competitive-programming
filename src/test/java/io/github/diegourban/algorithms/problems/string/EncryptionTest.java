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
 * Encryption — beecrowd (formerly URI Online Judge) 1024.
 * <p>
 * https://judge.beecrowd.com/en/problems/view/1024
 * <p>
 * Three passes: shift every letter 3 positions right in ASCII, reverse the line, then shift every
 * character from the middle (index {@code length / 2}) onwards 1 position left. O(n) time and space.
 */
class EncryptionTest {

    private static final SampleLoader SAMPLES = new SampleLoader("problems/string/encryption");

    static String solve(final String message) {
        final var shifted = new StringBuilder(message.length());
        for (final var c : message.toCharArray()) {
            shifted.append(Character.isLetter(c) ? (char) (c + 3) : c);
        }
        final var chars = shifted.reverse().toString().toCharArray();
        for (var i = chars.length / 2; i < chars.length; i++) {
            chars[i]--;
        }
        return new String(chars);
    }

    static String run(final InputStream in) throws IOException {
        final var reader = new Reader(in);
        final var n = reader.nextInt();
        final var out = new StringBuilder();
        for (var i = 0; i < n; i++) {
            out.append(solve(reader.readLine())).append('\n');
        }
        return out.toString();
    }

    @Test
    void shiftsLettersOnly() {
        assertThat(solve("abcABC1")).isEqualTo("1FECedc");
    }

    @Test
    void keepsSymbolsInFirstHalfAndShiftsSecondHalf() {
        assertThat(solve("Texto #3")).isEqualTo("3# rvzgV");
    }

    @Test
    void shiftsPastZIntoPunctuation() {
        assertThat(solve("aZ")).isEqualTo("]c");
        assertThat(solve("z")).isEqualTo("|");
    }

    @Test
    void oddLengthPutsMiddleCharacterInSecondHalf() {
        assertThat(solve("abcde")).isEqualTo("hgedc");
    }

    @ParameterizedTest
    @ValueSource(strings = {"uri", "udebug"})
    void matchesSample(final String name) throws IOException {
        assertThat(run(SAMPLES.loadAsInputStream(name + ".in"))).isEqualTo(SAMPLES.loadAsString(name + ".out"));
    }
}
