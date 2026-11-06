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
 * Contract Revision — beecrowd (formerly URI Online Judge) 1120.
 * <p>
 * https://judge.beecrowd.com/en/problems/view/1120
 * <p>
 * Drop every occurrence of the faulty digit, then strip leading zeros (an empty result is "0").
 * Works on the string directly since the number can have up to 100 digits. O(n) time.
 */
class ContractRevisionTest {

    private static final SampleLoader SAMPLES = new SampleLoader("problems/string/contract-revision");

    static String solve(final char faultyDigit, final String number) {
        final var kept = new StringBuilder(number.length());
        for (final var c : number.toCharArray()) {
            if (c != faultyDigit && !(c == '0' && kept.isEmpty())) {
                kept.append(c);
            }
        }
        return kept.isEmpty() ? "0" : kept.toString();
    }

    static String run(final InputStream in) throws IOException {
        final var reader = new Reader(in);
        final var out = new StringBuilder();
        for (var line = reader.readLine(); !line.equals("0 0"); line = reader.readLine()) {
            final var parts = line.trim().split("\\s+");
            out.append(solve(parts[0].charAt(0), parts[1])).append('\n');
        }
        return out.toString();
    }

    @Test
    void removesFaultyDigit() {
        assertThat(solve('3', "123456")).isEqualTo("12456");
    }

    @Test
    void stripsLeadingZerosLeftBehind() {
        assertThat(solve('1', "10000800001")).isEqualTo("80000");
        assertThat(solve('5', "5000000")).isEqualTo("0");
    }

    @Test
    void returnsZeroWhenEveryDigitIsRemoved() {
        assertThat(solve('7', "777")).isEqualTo("0");
    }

    @Test
    void keepsNumberWithoutFaultyDigitUnchanged() {
        assertThat(solve('9', "23454324543423")).isEqualTo("23454324543423");
    }

    @Test
    void handlesNumbersBeyondLongRange() {
        assertThat(solve('1', "1" + "0".repeat(96) + "120")).isEqualTo("20");
    }

    @ParameterizedTest
    @ValueSource(strings = {"uri", "udebug"})
    void matchesSample(final String name) throws IOException {
        assertThat(run(SAMPLES.loadAsInputStream(name + ".in"))).isEqualTo(SAMPLES.loadAsString(name + ".out"));
    }
}
