package io.github.diegourban.algorithms.datastructure.set;

import java.util.LinkedList;
import java.util.List;

public class Set {

    private final List<LinkedList<String>> table = new LinkedList<LinkedList<String>>();

    public Set() {
        for (int i = 0; i < 26; i++) {
            this.table.add(new LinkedList<String>());
        }
    }

    public void add(final String word) {
        if (!contains(word)) {
            final int index = calculateTableIndex(word);
            final List<String> list = this.table.get(index);
            list.add(word);
        }
    }

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

    @Override
    public String toString() {
        return this.table.toString();
    }
}
