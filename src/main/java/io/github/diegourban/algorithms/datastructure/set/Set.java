package io.github.diegourban.algorithms.datastructure.set;

import java.util.LinkedList;
import java.util.List;

/**
 * A set of words implemented as a hash table of 26 buckets, each a {@link java.util.LinkedList}. A word's bucket is
 * the character code of its lower-cased first character modulo 26, so buckets do not line up with alphabetical
 * order ({@code 'a'} goes to bucket 19).
 */
public class Set {

    private final List<LinkedList<String>> table = new LinkedList<LinkedList<String>>();

    /** Creates an empty set with 26 empty buckets. */
    public Set() {
        for (int i = 0; i < 26; i++) {
            this.table.add(new LinkedList<String>());
        }
    }

    /**
     * Adds a word if it is not already present; duplicates are ignored. Comparison is case-sensitive. An empty
     * string fails with a {@code StringIndexOutOfBoundsException}.
     *
     * @param word the word to add
     */
    public void add(final String word) {
        if (!contains(word)) {
            final int index = calculateTableIndex(word);
            final List<String> list = this.table.get(index);
            list.add(word);
        }
    }

    /**
     * Removes a word if present; otherwise does nothing. An empty string fails with a
     * {@code StringIndexOutOfBoundsException}.
     *
     * @param word the word to remove
     */
    public void remove(final String word) {
        if (contains(word)) {
            final int index = calculateTableIndex(word);
            final List<String> list = this.table.get(index);
            list.remove(word);
        }
    }

    private boolean contains(final String word) {
        final int index = calculateTableIndex(word);
        return this.table.get(index).contains(word);
    }

    private int calculateTableIndex(final String word) {
        return word.toLowerCase().charAt(0) % 26;
    }

    /**
     * Returns all 26 buckets in index order, each in {@link java.util.AbstractCollection#toString()} format, for
     * example {@code "[[], [], ..., [apple], ...]"}.
     *
     * @return the string form of the bucket table
     */
    @Override
    public String toString() {
        return this.table.toString();
    }
}
