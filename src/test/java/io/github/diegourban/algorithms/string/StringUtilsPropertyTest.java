package io.github.diegourban.algorithms.string;

import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.constraints.AlphaChars;
import net.jqwik.api.constraints.NotEmpty;
import net.jqwik.api.constraints.StringLength;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Inputs are ASCII letters: both methods compare {@code char} by {@code char}, so the properties check their logic
 * rather than Unicode case-mapping and surrogate-pair corner cases.
 */
class StringUtilsPropertyTest {

    @Property
    void isPalindromeAgreesWithReversing(@ForAll @AlphaChars @NotEmpty @StringLength(max = 20) String s) {
        var reversed = new StringBuilder(s).reverse().toString();

        assertThat(StringUtils.isPalindrome(s)).isEqualTo(s.equals(reversed));
    }

    @Property
    void mirroredStringsArePalindromes(@ForAll @AlphaChars @NotEmpty @StringLength(max = 20) String s,
                                       @ForAll @AlphaChars char middle) {
        var reversed = new StringBuilder(s).reverse().toString();

        assertThat(StringUtils.isPalindrome(s + reversed)).isTrue();
        assertThat(StringUtils.isPalindrome(s + middle + reversed)).isTrue();
    }

    @Property
    void aShuffleIsAnAnagram(@ForAll @AlphaChars String s, @ForAll long seed) {
        var chars = s.chars().mapToObj(c -> (char) c).collect(Collectors.toCollection(ArrayList::new));
        Collections.shuffle(chars, new Random(seed));
        var shuffled = chars.stream().map(String::valueOf).collect(Collectors.joining());

        assertThat(StringUtils.isAnagram(s, shuffled)).isTrue();
        assertThat(StringUtils.isAnagram(s.toUpperCase(), shuffled.toLowerCase())).isTrue();
    }

    @Property
    void isAnagramAgreesWithLetterCounts(@ForAll @AlphaChars @StringLength(max = 6) String a,
                                         @ForAll @AlphaChars @StringLength(max = 6) String b) {
        assertThat(StringUtils.isAnagram(a, b)).isEqualTo(letterCounts(a).equals(letterCounts(b)));
    }

    private static java.util.Map<Integer, Long> letterCounts(String s) {
        return s.toLowerCase().chars().boxed().collect(Collectors.groupingBy(c -> c, Collectors.counting()));
    }
}
