package io.github.diegourban.algorithms.datastructure.stack;

import io.github.diegourban.algorithms.datastructure.Element;
import java.util.LinkedList;
import java.util.List;

public class Stack {

    private final List<Element> elements = new LinkedList<>();

    public void push(final Element element) {
        this.elements.add(element);
    }

    public Element pop() {
        return this.elements.remove(this.elements.size() - 1);
    }

    public boolean empty() {
        return this.elements.isEmpty();
    }

    @Override
    public String toString() {
        return this.elements.toString();
    }
}
