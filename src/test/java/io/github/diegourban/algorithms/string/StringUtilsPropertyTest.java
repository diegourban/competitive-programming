package io.github.diegourban.algorithms.string;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.stream.Collectors;
import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.constraints.AlphaChars;
import net.jqwik.api.constraints.NotEmpty;
import net.jqwik.api.constraints.StringLength;

/**
 * Inputs are ASCII letters: both methods compare {@code char} by {@code char}, so the properties check their logic
 * rather than Unicode case-mapping and surrogate-pair corner cases.
 */
class StringUtilsPropertyTest {

    @Property
    void isPalindromeAgreesWithReversing(@ForAll @AlphaChars @NotEmpty @StringLength(max = 20) final String s) {
        final var reversed = new StringBuilder(s).reverse().toString();

        assertThat(StringUtils.isPalindrome(s)).isEqualTo(s.equals(reversed));
    }

    @Property
    void mirroredStringsArePalindromes(
            @ForAll @AlphaChars @NotEmpty @StringLength(max = 20) final String s,
            @ForAll @AlphaChars final char middle) {
        final var reversed = new StringBuilder(s).reverse().toString();

        assertThat(StringUtils.isPalindrome(s + reversed)).isTrue();
        assertThat(StringUtils.isPalindrome(s + middle + reversed)).isTrue();
    }

    @Property
    void aShuffleIsAnAnagram(@ForAll @AlphaChars final String s, @ForAll final long seed) {
        final var chars = s.chars().mapToObj(c -> (char) c).collect(Collectors.toCollection(ArrayList::new));
        Collections.shuffle(chars, new Random(seed));
        final var shuffled = chars.stream().map(String::valueOf).collect(Collectors.joining());

        assertThat(StringUtils.isAnagram(s, shuffled)).isTrue();
        assertThat(StringUtils.isAnagram(s.toUpperCase(), shuffled.toLowerCase()))
                .isTrue();
    }

    @Property
    void isAnagramAgreesWithLetterCounts(
            @ForAll @AlphaChars @StringLength(max = 6) final String a,
            @ForAll @AlphaChars @StringLength(max = 6) final String b) {
        assertThat(StringUtils.isAnagram(a, b)).isEqualTo(letterCounts(a).equals(letterCounts(b)));
    }

    private static java.util.Map<Integer, Long> letterCounts(final String s) {
        return s.toLowerCase().chars().boxed().collect(Collectors.groupingBy(c -> c, Collectors.counting()));
    }
}
