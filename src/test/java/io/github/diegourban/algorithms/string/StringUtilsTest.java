package io.github.diegourban.algorithms.string;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class StringUtilsTest {

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
}
