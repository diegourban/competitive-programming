package io.github.diegourban.algorithms.problems.datastructure.set;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashSet;
import org.junit.jupiter.api.Test;

/**
 * Permutation Palindrome — Interview Cake.
 * <p>
 * https://www.interviewcake.com/question/java/permutation-palindrome
 * <p>
 * Toggle each character in a set of unpaired characters; a palindrome permutation exists when at most one
 * character (the middle one) is left unpaired. O(n) time, O(k) space for k distinct characters.
 */
class PermutationPalindromeTest {

    static boolean solve(final String text) {
        final var unpaired = new HashSet<Character>();
        for (final var c : text.toCharArray()) {
            if (!unpaired.remove(c)) {
                unpaired.add(c);
            }
        }
        return unpaired.size() <= 1;
    }

    @Test
    void palindromesHaveAPalindromePermutation() {
        assertThat(solve("a")).isTrue();
        assertThat(solve("aa")).isTrue();
        assertThat(solve("aba")).isTrue();
        assertThat(solve("civic")).isTrue();
        assertThat(solve("socorrammesubinoonibusemmarrocos")).isTrue();
    }

    @Test
    void rearrangedPalindromesHaveAPalindromePermutation() {
        assertThat(solve("baa")).isTrue();
        assertThat(solve("aab")).isTrue();
        assertThat(solve("vicic")).isTrue();
        assertThat(solve("cciiv")).isTrue();
    }

    @Test
    void moreThanOneUnpairedCharacterHasNoPalindromePermutation() {
        assertThat(solve("ab")).isFalse();
        assertThat(solve("civil")).isFalse();
        assertThat(solve("livci")).isFalse();
    }
}
