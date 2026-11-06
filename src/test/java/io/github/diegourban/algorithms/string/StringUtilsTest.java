package io.github.diegourban.algorithms.string;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class StringUtilsTest {

    @Test
    void shouldCreateInstance() {
        assertThat(new StringUtils()).isNotNull();
    }

    @Test
    void shouldFindRotationPoint() {
        assertThat(StringUtils.findRotationPoint(new String[]{"k", "v", "a", "b", "c", "d", "e", "g", "i"})).isEqualTo(2);
        assertThat(StringUtils.findRotationPoint(new String[]{"ptolemaic", "retrograde", "supplant", "undulate", "xenoepist", "asymptote", "babka", "banoffee", "engender", "karpatka", "othellolagkage",})).isEqualTo(5);
    }

    @Test
    void shouldConsiderPalindrome() {
        assertThat(StringUtils.isPalindrome("a")).isTrue();
        assertThat(StringUtils.isPalindrome("aa")).isTrue();
        assertThat(StringUtils.isPalindrome("aba")).isTrue();
        assertThat(StringUtils.isPalindrome("abba")).isTrue();
        assertThat(StringUtils.isPalindrome("civic")).isTrue();
        assertThat(StringUtils.isPalindrome("iaracarai")).isTrue();
        assertThat(StringUtils.isPalindrome("socorrammesubinoonibusemmarrocos")).isTrue();
    }

    @Test
    void shouldNotConsiderPalindrome() {
        assertThat(StringUtils.isPalindrome(null)).isFalse();
        assertThat(StringUtils.isPalindrome("")).isFalse();
        assertThat(StringUtils.isPalindrome("ab")).isFalse();
        assertThat(StringUtils.isPalindrome("abb")).isFalse();
    }

    @Test
    void shouldConsiderPalindromePermutations() {
        assertThat(StringUtils.hasPalindromePermutation("a")).isTrue();
        assertThat(StringUtils.hasPalindromePermutation("aa")).isTrue();
        assertThat(StringUtils.hasPalindromePermutation("aba")).isTrue();
        assertThat(StringUtils.hasPalindromePermutation("baa")).isTrue();
        assertThat(StringUtils.hasPalindromePermutation("aab")).isTrue();
        assertThat(StringUtils.hasPalindromePermutation("civic")).isTrue();
        assertThat(StringUtils.hasPalindromePermutation("vicic")).isTrue();
        assertThat(StringUtils.hasPalindromePermutation("cciiv")).isTrue();
        assertThat(StringUtils.hasPalindromePermutation("socorrammesubinoonibusemmarrocos")).isTrue();
    }

    @Test
    void shouldNotConsiderPalindromePermutations() {
        assertThat(StringUtils.hasPalindromePermutation("ab")).isFalse();
        assertThat(StringUtils.hasPalindromePermutation("civil")).isFalse();
        assertThat(StringUtils.hasPalindromePermutation("livci")).isFalse();
    }

    @Test
    void shouldValidateBrackets() {
        assertThat(StringUtils.bracketValidator("{[]()}")).isTrue();
        assertThat(StringUtils.bracketValidator("{[(])}")).isFalse();
        assertThat(StringUtils.bracketValidator("{[}")).isFalse();
    }

    @Test
    void shouldReverseWords() {
        assertThat(StringUtils.reverseWords("the eagle has landed")).isEqualTo("landed has eagle the");
        assertThat(StringUtils.reverseWords("find you will pain only go you recordings security the into if")).isEqualTo("if into the security recordings you go only pain will you find");
    }

    @Test
    void shouldNotFindClosingParenthesis() {
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() ->
                StringUtils.getClosingParenthesis("a(bc", 2));
    }

    @Test
    void shouldFindClosingParenthesis() {
        assertThat(StringUtils.getClosingParenthesis("()", 0)).isOne();
        assertThat(StringUtils.getClosingParenthesis("(())", 0)).isEqualTo(3);
        assertThat(StringUtils.getClosingParenthesis("a(b(c)d)e", 1)).isEqualTo(7);
    }

    @Test
    void shouldFindPermutations() {
        assertThat(StringUtils.getPermutations("ABC")).contains("ABC", "CAB", "BAC", "ACB", "BCA", "CBA");
    }

}
