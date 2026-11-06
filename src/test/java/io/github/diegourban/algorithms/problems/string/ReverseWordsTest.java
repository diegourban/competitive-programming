package io.github.diegourban.algorithms.problems.string;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * Reverse Words — Interview Cake.
 * <p>
 * https://www.interviewcake.com/question/java/reverse-words
 * <p>
 * Reverse the whole character array, giving the right word order with each word backwards, then reverse each word
 * back in place. O(n) time, O(n) space for the character array (O(1) extra on top of it).
 */
class ReverseWordsTest {

    static String solve(String message) {
        var chars = message.toCharArray();
        reverse(chars, 0, chars.length - 1);
        var wordStart = 0;
        for (var i = 0; i <= chars.length; i++) {
            if (i == chars.length || chars[i] == ' ') {
                reverse(chars, wordStart, i - 1);
                wordStart = i + 1;
            }
        }
        return new String(chars);
    }

    private static void reverse(char[] chars, int start, int end) {
        for (int front = start, back = end; front < back; front++, back--) {
            var tmp = chars[front];
            chars[front] = chars[back];
            chars[back] = tmp;
        }
    }

    @Test
    void reversesWordOrder() {
        assertThat(solve("the eagle has landed")).isEqualTo("landed has eagle the");
    }

    @Test
    void decodesTheHeistMessage() {
        assertThat(solve("find you will pain only go you recordings security the into if"))
                .isEqualTo("if into the security recordings you go only pain will you find");
    }
}
