package io.github.diegourban.algorithms.datastructure.linkedlist;

import io.github.diegourban.algorithms.datastructure.Element;

/**
 * A node of a doubly linked {@link LinkedList}, holding an {@link Element} and links to the previous and next nodes.
 */
public class LinkedListNode {

    private Element element;

    private LinkedListNode previous;
    private LinkedListNode next;

    /**
     * Creates a node with no previous or next node.
     *
     * @param element the element to hold
     */
    public LinkedListNode(final Element element) {
        this(element, null);
    }

    /**
     * Creates a node linked forward to {@code next}. The previous link is left {@code null}, and {@code next} is not
     * updated to point back.
     *
     * @param element the element to hold
     * @param next the next node, or {@code null}
     */
    public LinkedListNode(final Element element, final LinkedListNode next) {
        this.element = element;
        this.next = next;
    }

    /**
     * Returns the element held by this node.
     *
     * @return the element
     */
    public Element getElement() {
        return element;
    }

    /**
     * Replaces the element held by this node.
     *
     * @param element the new element
     */
    public void setElement(final Element element) {
        this.element = element;
    }

    /**
     * Returns the next node.
     *
     * @return the next node, or {@code null} if this is the last node
     */
    public LinkedListNode getNext() {
        return next;
    }

    /**
     * Sets the next node.
     *
     * @param next the next node, or {@code null}
     */
    public void setNext(final LinkedListNode next) {
        this.next = next;
    }

    /**
     * Returns the previous node.
     *
     * @return the previous node, or {@code null} if none is linked
     */
    public LinkedListNode getPrevious() {
        return previous;
    }

    /**
     * Sets the previous node.
     *
     * @param previous the previous node, or {@code null}
     */
    public void setPrevious(final LinkedListNode previous) {
        this.previous = previous;
    }
}
