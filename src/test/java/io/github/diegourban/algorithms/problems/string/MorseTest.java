package io.github.diegourban.algorithms.problems.string;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

/**
 * Morse — beecrowd (formerly URI Online Judge) 2338.
 * <p>
 * https://judge.beecrowd.com/en/problems/view/2338
 * <p>
 * Split words on 7 dots and letters on 3 dots; within a letter "=" is a dit and "===" a dah, so
 * each letter maps to standard Morse notation and is looked up in the A–Z table. O(n) time.
 */
class MorseTest {

    private static final String[] MORSE = {
        ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
        "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."
    };

    static String solve(String code) {
        return Arrays.stream(code.split("\\.{7}"))
                .map(word -> Arrays.stream(word.split("\\.{3}"))
                        .map(letter -> String.valueOf(decode(letter)))
                        .collect(Collectors.joining()))
                .collect(Collectors.joining(" "));
    }

    private static char decode(String letter) {
        var morse = Arrays.stream(letter.split("\\."))
                .map(signal -> signal.equals("=") ? "." : "-")
                .collect(Collectors.joining());
        return (char) ('a' + Arrays.asList(MORSE).indexOf(morse));
    }

    @Test
    void decodesSingleLetters() {
        assertThat(solve("=.===")).isEqualTo("a");
        assertThat(solve("===.=.=.=")).isEqualTo("b");
        assertThat(solve("=")).isEqualTo("e");
        assertThat(solve("===")).isEqualTo("t");
        assertThat(solve("===.===.=.=")).isEqualTo("z");
    }

    @Test
    void decodesOfficialSamples() {
        assertThat(solve("===.===...===.===.===...=.===.=...=.=.=...=.......===.=.===.=...===.===.===...===.=.=...="))
                .isEqualTo("morse code");
        assertThat(solve("=.=.=...===.===.===...=.=.=")).isEqualTo("sos");
    }
}
