package io.github.diegourban.algorithms.datastructure.set;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * A set of words implemented as a hash table of 26 buckets, each a {@link java.util.LinkedList}. A word's bucket is
 * the character code of its lower-cased first character modulo 26, so buckets do not line up with alphabetical
 * order ({@code 'a'} goes to bucket 19).
 */
public class WordSet {

    private static final int BUCKET_COUNT = 26;

    private final List<List<String>> buckets = new ArrayList<>(BUCKET_COUNT);

    /** Creates an empty set with 26 empty buckets. */
    public WordSet() {
        for (int i = 0; i < BUCKET_COUNT; i++) {
            this.buckets.add(new LinkedList<>());
        }
    }

    /**
     * Adds a word if it is not already present; duplicates are ignored. Comparison is case-sensitive.
     *
     * @param word the word to add
     * @throws IllegalArgumentException if {@code word} is empty
     */
    public void add(final String word) {
        final List<String> bucket = bucketFor(word);
        if (!bucket.contains(word)) {
            bucket.add(word);
        }
    }

    /**
     * Removes a word if present; otherwise does nothing.
     *
     * @param word the word to remove
     * @throws IllegalArgumentException if {@code word} is empty
     */
    public void remove(final String word) {
        bucketFor(word).remove(word);
    }

    private List<String> bucketFor(final String word) {
        return this.buckets.get(calculateTableIndex(word));
    }

    private int calculateTableIndex(final String word) {
        if (word.isEmpty()) {
            throw new IllegalArgumentException("word must not be empty");
        }
        return word.toLowerCase().charAt(0) % BUCKET_COUNT;
    }

    /**
     * Returns all 26 buckets in index order, each in {@link java.util.AbstractCollection#toString()} format, for
     * example {@code "[[], [], ..., [apple], ...]"}.
     *
     * @return the string form of the buckets
     */
    @Override
    public String toString() {
        return this.buckets.toString();
    }
}
