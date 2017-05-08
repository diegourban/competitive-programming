package urban.common.structure.linkedlist;

import urban.common.structure.Element;

public class LinkedList {

    private LinkedListNode first = null;
    private LinkedListNode last = null;
    private int totalElements = 0;

    public void addAtStart(final Element element) {
        LinkedListNode newNode = new LinkedListNode(element, first);
        this.first = newNode;

        if(this.totalElements == 0) {
            this.last = this.first;
        }

        this.totalElements++;
    }

    public void addAtEnd(final Element element) {
        if(this.totalElements == 0) {
            addAtStart(element);
        } else {
            LinkedListNode newNode = new LinkedListNode(element, null);
            this.last.setNext(newNode);
            this.last = newNode;
            this.totalElements++;
        }
    }

    public void add(final int position, final Element element) {
        if(this.totalElements == 0) {
            addAtStart(element);
        } else if(position == this.totalElements) {
            addAtEnd(element);
        } else {
            LinkedListNode previous = this.getNode(position - 1);
            LinkedListNode newNode = new LinkedListNode(element, previous.getNext());
            previous.setNext(newNode);
            this.totalElements++;
        }
    }

    private boolean positionOccupied(final int position) {
        return position >= 0 && position < this.totalElements;
    }

    private LinkedListNode getNode(final int position) {
        if(!positionOccupied(position)) {
            throw new IllegalArgumentException("Posição inexistente");
        }
        LinkedListNode current = this.first;
        for(int i = 0; i < position; i++) {
            current = current.getNext();
        }
        return current;
    }

    public LinkedListNode getFirst() {
        return this.first;
    }

    public Element get(final int position) {
        return this.getNode(position).getElement();
    }

    public void removeFromStart() {
        if(this.totalElements == 0) {
            throw new IllegalStateException("Lista vazia");
        }

        this.first = this.first.getNext();
        this.totalElements--;

        if(this.totalElements == 0) {
            this.last = null;
        }
    }

    public void remove(final int position) {

    }

    public int size() {
        return this.totalElements;
    }

    public boolean contains(Element element) {
        return false;
    }

    @Override
    public String toString() {
        if(this.totalElements == 0) {
            return "[]";
        }
        LinkedListNode current = this.first;

        StringBuilder sb = new StringBuilder("[");
        for(int i = 0; i < this.totalElements; i++) {
            sb.append(current.getElement().getName());
            sb.append(",");
            current = current.getNext();
        }
        sb.append("]");

        return sb.toString();
    }
}
