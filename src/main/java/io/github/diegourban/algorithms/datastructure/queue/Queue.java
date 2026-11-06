package io.github.diegourban.algorithms.datastructure.queue;

import io.github.diegourban.algorithms.datastructure.Element;
import java.util.LinkedList;

public class Queue {

    private final LinkedList<Element> elements = new LinkedList<>();

    public void add(final Element element) {
        this.elements.add(element);
    }

    public Element poll() {
        return this.elements.remove(0);
    }

    @Override
    public String toString() {
        return elements.toString();
    }
}
