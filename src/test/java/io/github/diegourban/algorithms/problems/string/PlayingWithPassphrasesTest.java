package io.github.diegourban.algorithms.problems.string;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * Playing with passphrases — Codewars (6 kyu).
 * <p>
 * Single pass: circularly shift letters by {@code shift}, replace digits by their complement to 9,
 * upcase letters at even and downcase letters at odd positions, keep everything else; then reverse.
 * O(n) time and space.
 */
class PlayingWithPassphrasesTest {

    static String solve(final String text, final int shift) {
        final var out = new StringBuilder(text.length());
        for (var i = 0; i < text.length(); i++) {
            final var c = text.charAt(i);
            if (Character.isLetter(c)) {
                final var base = Character.isUpperCase(c) ? 'A' : 'a';
                final var shifted = (char) (base + (c - base + shift) % 26);
                out.append(i % 2 == 0 ? Character.toUpperCase(shifted) : Character.toLowerCase(shifted));
            } else if (Character.isDigit(c)) {
                out.append((char) ('9' - c + '0'));
            } else {
                out.append(c);
            }
        }
        return out.reverse().toString();
    }

    @Test
    void wrapsAroundTheAlphabet() {
        assertThat(solve("Z", 2)).isEqualTo("B");
    }

    @Test
    void upcasesLettersAtEvenPositions() {
        assertThat(solve("z", 2)).isEqualTo("B");
    }

    @Test
    void keepsPunctuationAndReverses() {
        assertThat(solve("I LOVE YOU!!!", 1)).isEqualTo("!!!vPz fWpM J");
    }

    @Test
    void complementsDigits() {
        assertThat(solve("MY GRANMA CAME FROM NY ON THE 23RD OF APRIL 2015", 2))
                .isEqualTo("4897 NkTrC Hq fT67 GjV Pq aP OqTh gOcE CoPcTi aO");
    }
}
