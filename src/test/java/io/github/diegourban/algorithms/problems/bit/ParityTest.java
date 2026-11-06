package io.github.diegourban.algorithms.problems.bit;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * Parity — beecrowd (formerly URI Online Judge) 2176.
 * <p>
 * https://judge.beecrowd.com/en/problems/view/2176
 * <p>
 * Append an even-parity bit: count the '1' characters (the string can be up to 100 bits, beyond
 * {@code long}) and append '1' when the count is odd. O(n) time.
 */
class ParityTest {

    static String solve(final String bits) {
        final var ones = bits.chars().filter(c -> c == '1').count();
        return bits + (ones % 2 == 0 ? '0' : '1');
    }

    @Test
    void matchesOfficialSample() {
        assertThat(solve("0")).isEqualTo("00");
    }

    @Test
    void singleOneGetsParityOne() {
        assertThat(solve("1")).isEqualTo("11");
    }

    @Test
    void evenCountOfOnesAppendsZero() {
        assertThat(solve("1010101")).isEqualTo("10101010");
    }

    @Test
    void oddCountOfOnesAppendsOne() {
        assertThat(solve("10101")).isEqualTo("101011");
    }

    @Test
    void handlesHundredBits() {
        final var bits =
                "0101011001101010011001010101001010101010101010101011010010101010101011010110101010000101010101010101";
        assertThat(solve(bits)).isEqualTo(bits + "1");
    }
}
