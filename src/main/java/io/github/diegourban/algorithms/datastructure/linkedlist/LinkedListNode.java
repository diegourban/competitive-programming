package io.github.diegourban.algorithms.datastructure.linkedlist;

import io.github.diegourban.algorithms.datastructure.Element;

public class LinkedListNode {

    private Element element;

    private LinkedListNode previous;
    private LinkedListNode next;

    public LinkedListNode(final Element element) {
        this(element, null);
    }

    public LinkedListNode(final Element element, final LinkedListNode next) {
        this.element = element;
        this.next = next;
    }

    public Element getElement() {
        return element;
    }

    public void setElement(final Element element) {
        this.element = element;
    }

    public LinkedListNode getNext() {
        return next;
    }

    public void setNext(final LinkedListNode next) {
        this.next = next;
    }

    public LinkedListNode getPrevious() {
        return previous;
    }

    public void setPrevious(final LinkedListNode previous) {
        this.previous = previous;
    }
}
