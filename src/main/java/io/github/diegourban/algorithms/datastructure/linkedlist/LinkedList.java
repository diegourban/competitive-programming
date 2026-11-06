package io.github.diegourban.algorithms.datastructure.linkedlist;

import io.github.diegourban.algorithms.datastructure.Element;

/**
 * A list of {@link Element}s implemented as a doubly linked chain of {@link LinkedListNode}s, keeping references to
 * the first and last nodes and a running size. Positions are zero-based.
 */
public class LinkedList {

    private LinkedListNode first = null;
    private LinkedListNode last = null;
    private int totalElements = 0;

    /** Creates an empty list. */
    public LinkedList() {}

    /**
     * Inserts an element at the start of the list.
     *
     * @param element the element to insert
     */
    public void addAtStart(final Element element) {
        if (this.totalElements == 0) {
            final LinkedListNode newNode = new LinkedListNode(element);
            this.first = newNode;
            this.last = newNode;
        } else {
            final LinkedListNode newNode = new LinkedListNode(element, this.first);
            this.first.setPrevious(newNode);
            this.first = newNode;
        }

        this.totalElements++;
    }

    /**
     * Appends an element at the end of the list.
     *
     * @param element the element to append
     */
    public void addAtEnd(final Element element) {
        if (this.totalElements == 0) {
            addAtStart(element);
        } else {
            final LinkedListNode newNode = new LinkedListNode(element);
            this.last.setNext(newNode);
            newNode.setPrevious(this.last);
            this.last = newNode;

            this.totalElements++;
        }
    }

    /**
     * Inserts an element at the given position, shifting later elements one position back.
     * <p>
     * If the list is empty the element is added regardless of {@code position}. If {@code position} equals
     * {@link #size()} the element is appended. Otherwise the element is linked after the node at
     * {@code position - 1}, so inserting at position {@code 0} of a non-empty list is not supported.
     *
     * @param position the position for the new element, from {@code 1} to {@link #size()} on a non-empty list
     * @param element the element to insert
     * @throws IllegalArgumentException if the list is not empty and {@code position - 1} is not an occupied position
     *     (including {@code position == 0})
     */
    public void add(final int position, final Element element) {
        if (this.totalElements == 0) {
            addAtStart(element);
        } else if (position == this.totalElements) {
            addAtEnd(element);
        } else {
            final LinkedListNode previous = this.getNode(position - 1);
            final LinkedListNode next = previous.getNext();

            final LinkedListNode newNode = new LinkedListNode(element, previous.getNext());
            newNode.setPrevious(previous);
            previous.setNext(newNode);
            next.setPrevious(newNode);

            this.totalElements++;
        }
    }

    private boolean positionOccupied(final int position) {
        return position >= 0 && position < this.totalElements;
    }

    private LinkedListNode getNode(final int position) {
        if (!positionOccupied(position)) {
            throw new IllegalArgumentException("Posição inexistente");
        }
        LinkedListNode current = this.first;
        for (int i = 0; i < position; i++) {
            current = current.getNext();
        }
        return current;
    }

    /**
     * Returns the first node, giving direct access to the chain.
     *
     * @return the first node, or {@code null} if the list is empty
     */
    public LinkedListNode getFirst() {
        return this.first;
    }

    /**
     * Returns the element at the given position by walking from the first node.
     *
     * @param position the zero-based position
     * @return the element at {@code position}
     * @throws IllegalArgumentException if {@code position} is negative or not less than {@link #size()}
     */
    public Element get(final int position) {
        return this.getNode(position).getElement();
    }

    /**
     * Removes the first element.
     *
     * @throws IllegalStateException if the list is empty
     */
    public void removeFromStart() {
        if (this.totalElements == 0) {
            throw new IllegalStateException("Lista vazia");
        }

        this.first = this.first.getNext();
        this.totalElements--;

        if (this.totalElements == 0) {
            this.last = null;
        }
    }

    /**
     * Removes the last element. Unlike {@link #removeFromStart()}, calling this on an empty list fails with a
     * {@code NullPointerException} rather than an {@code IllegalStateException}.
     */
    public void removeFromEnd() {
        if (this.totalElements == 1) {
            this.removeFromStart();
        } else {
            final LinkedListNode previous = this.last.getPrevious();
            previous.setNext(null);
            this.last = previous;
            this.totalElements--;
        }
    }

    /**
     * Removes the element at the given position.
     * <p>
     * Position {@code 0} delegates to {@link #removeFromStart()} and position {@code size() - 1} to
     * {@link #removeFromEnd()}; any other position unlinks the node after {@code position - 1}.
     * <p>
     * Positions are not fully validated: on a non-empty list, {@code position == size()} fails with a
     * {@code NullPointerException}, as does {@code -1} on an empty list.
     *
     * @param position the zero-based position, from {@code 0} to {@code size() - 1}
     * @throws IllegalStateException if {@code position} is {@code 0} and the list is empty
     * @throws IllegalArgumentException if {@code position} is negative or greater than {@link #size()}, except
     *     {@code -1} on an empty list
     */
    public void remove(final int position) {
        if (position == 0) {
            this.removeFromStart();
        } else if (position == totalElements - 1) {
            this.removeFromEnd();
        } else {
            final LinkedListNode previous = this.getNode(position - 1);
            final LinkedListNode current = previous.getNext();
            final LinkedListNode next = current.getNext();
            previous.setNext(next);
            next.setPrevious(previous);

            this.totalElements--;
        }
    }

    /**
     * Returns the number of elements.
     *
     * @return the number of elements in the list
     */
    public int size() {
        return this.totalElements;
    }

    /**
     * Tells whether the list holds an element equal to the given one, comparing with {@link Element#equals(Object)}.
     *
     * @param element the element to look for
     * @return {@code true} if an equal element is found
     */
    public boolean contains(final Element element) {
        LinkedListNode current = this.first;
        while (current != null) {
            if (current.getElement().equals(element)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    /**
     * Returns the element names in order, each followed by a comma, inside brackets, for example {@code "[a,b,]"};
     * an empty list gives {@code "[]"}.
     *
     * @return the string form of the list
     */
    @Override
    public String toString() {
        if (this.totalElements == 0) {
            return "[]";
        }
        LinkedListNode current = this.first;

        final StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < this.totalElements; i++) {
            sb.append(current.getElement().getName());
            sb.append(",");
            current = current.getNext();
        }
        sb.append("]");

        return sb.toString();
    }
}
