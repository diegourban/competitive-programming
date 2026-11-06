package io.github.diegourban.algorithms.datastructure.queue;

import io.github.diegourban.algorithms.datastructure.Element;
import java.util.LinkedList;

/**
 * A first-in, first-out queue of {@link Element}s backed by a {@link java.util.LinkedList}.
 */
public class Queue {

    private final LinkedList<Element> elements = new LinkedList<>();

    /** Creates an empty queue. */
    public Queue() {}

    /**
     * Adds an element to the back of the queue.
     *
     * @param element the element to add
     */
    public void add(final Element element) {
        this.elements.add(element);
    }

    /**
     * Removes and returns the element at the front of the queue. On an empty queue this fails with the
     * {@code IndexOutOfBoundsException} thrown by the backing list, instead of returning {@code null}.
     *
     * @return the oldest element in the queue
     */
    public Element poll() {
        return this.elements.remove(0);
    }

    /**
     * Returns the elements from front to back in {@link java.util.AbstractCollection#toString()} format, for example
     * {@code "[a, b]"}.
     *
     * @return the string form of the queue
     */
    @Override
    public String toString() {
        return elements.toString();
    }
}
