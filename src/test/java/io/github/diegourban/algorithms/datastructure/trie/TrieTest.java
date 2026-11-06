package io.github.diegourban.algorithms.datastructure.trie;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TrieTest {

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
