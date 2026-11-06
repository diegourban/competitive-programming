package io.github.diegourban.algorithms.problems.datastructure.trie;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

/**
 * MillionGazillion — Interview Cake.
 * <p>
 * https://www.interviewcake.com/question/java/compress-url-list
 * <p>
 * Store visited URLs in a trie so shared prefixes are stored once; an explicit end-of-word marker distinguishes a
 * word from a prefix of a longer one. O(L) time per insert/check, where L is the word length.
 */
class MillionGazillionTest {

    static class Trie {

        private static final char END_OF_WORD = '\0';

        private final Node root = new Node();

        /** Adds {@code word} and returns {@code true} if it was not already present. */
        boolean checkPresentAndAdd(String word) {
            var current = root;
            var isNewWord = false;
            for (var character : word.toCharArray()) {
                if (!current.children.containsKey(character)) {
                    isNewWord = true;
                }
                current = current.children.computeIfAbsent(character, _ -> new Node());
            }
            if (!current.children.containsKey(END_OF_WORD)) {
                isNewWord = true;
                current.children.put(END_OF_WORD, new Node());
            }
            return isNewWord;
        }

        private static final class Node {
            private final Map<Character, Node> children = new HashMap<>();
        }
    }

    private final Trie trie = new Trie();

    @Test
    void firstInsertionIsNew() {
        assertThat(trie.checkPresentAndAdd("tea")).isTrue();
    }

    @Test
    void repeatedInsertionIsNotNew() {
        trie.checkPresentAndAdd("tea");

        assertThat(trie.checkPresentAndAdd("tea")).isFalse();
    }

    @Test
    void prefixOfExistingWordIsNew() {
        trie.checkPresentAndAdd("team");

        assertThat(trie.checkPresentAndAdd("tea")).isTrue();
        assertThat(trie.checkPresentAndAdd("tea")).isFalse();
    }

    @Test
    void extensionOfExistingWordIsNew() {
        trie.checkPresentAndAdd("tea");

        assertThat(trie.checkPresentAndAdd("team")).isTrue();
    }

    @Test
    void emptyWordIsTrackedLikeAnyOther() {
        assertThat(trie.checkPresentAndAdd("")).isTrue();
        assertThat(trie.checkPresentAndAdd("")).isFalse();
    }
}
