package urban.common.data_structure.linkedlist;

public class Node {

    private final int data;
    private Node next;

    public Node(final int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
