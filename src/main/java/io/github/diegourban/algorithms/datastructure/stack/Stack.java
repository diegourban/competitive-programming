package io.github.diegourban.algorithms.datastructure.stack;

import io.github.diegourban.algorithms.datastructure.Element;
import java.util.LinkedList;
import java.util.List;

/**
 * A last-in, first-out stack of {@link Element}s backed by a {@link java.util.LinkedList}, whose end is the top.
 */
public class Stack {

    private final List<Element> elements = new LinkedList<>();

    /** Creates an empty stack. */
    public Stack() {}

    /**
     * Pushes an element onto the top of the stack.
     *
     * @param element the element to push
     */
    public void push(final Element element) {
        this.elements.add(element);
    }

    /**
     * Removes and returns the top element. On an empty stack this fails with the {@code IndexOutOfBoundsException}
     * thrown by the backing list.
     *
     * @return the most recently pushed element
     */
    public Element pop() {
        return this.elements.remove(this.elements.size() - 1);
    }

    /**
     * Tells whether the stack is empty.
     *
     * @return {@code true} if the stack holds no elements
     */
    public boolean empty() {
        return this.elements.isEmpty();
    }

    /**
     * Returns the elements from bottom to top in {@link java.util.AbstractCollection#toString()} format, for example
     * {@code "[a, b]"}.
     *
     * @return the string form of the stack
     */
    @Override
    public String toString() {
        return this.elements.toString();
    }
}
