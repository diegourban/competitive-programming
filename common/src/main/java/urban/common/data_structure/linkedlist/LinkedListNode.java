package urban.common.data_structure.linkedlist;

import urban.common.data_structure.Element;

public class LinkedListNode {

    private Element element;
    private LinkedListNode next;

    public LinkedListNode(final Element element, final LinkedListNode next) {
        this.element = element;
        this.next = next;
    }

    public Element getElement() {
        return element;
    }

    public void setElement(Element element) {
        this.element = element;
    }

    public LinkedListNode getNext() {
        return next;
    }

    public void setNext(LinkedListNode next) {
        this.next = next;
    }
}
