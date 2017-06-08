package urban.common.data_structure.linkedlist;

/**
 * Utility methods for LinkedLists
 */
public class LinkedListUtils {

    /**
     * Reverses a linked list.
     * <p>
     * In one pass from head to tail of our input list, we point each node's next pointer to the previous item.
     * <p>
     * Complexity: O(1) space and O(n) time.
     *
     * @param linkedList
     * @return previous because when we exit the list, current is null. Which means that the last node we visited—previous—was the tail of the original list, and thus the head of our reversed list
     */
    public static LinkedListNode reverse(final LinkedList linkedList) {
        LinkedListNode current = linkedList.getFirst();
        LinkedListNode previous = null;
        LinkedListNode nextNode = null;

        // until we have 'fallen off' the end of the list
        while (current != null) {

            // copy a pointer to the next element
            // before we overwrite current.next
            nextNode = current.getNext();

            // reverse the 'next' pointer
            current.setNext(previous);

            // step forward in the list
            previous = current;
            current = nextNode;
        }

        return previous;
    }

    /**
     * Delete a node from a singly-linked list, given only a variable pointing to that node.
     * <p>
     * We take value and next from the input node's next node and copy them into the input node. Now the input node's previous node effectively skips the input node's old value!
     * <p>
     * Complexity: O(1) space and O(1) time
     *
     * @param nodeToDelete the node to delete
     */
    public static void deleteNode(final LinkedListNode nodeToDelete) {
        // get the input node's next node, the one we want to skip to
        LinkedListNode nextNode = nodeToDelete.getNext();

        if (nextNode != null) {
            // replace the input node's value and pointer with the next
            // node's value and pointer. the previous node now effectively
            // skips over the input node
            nodeToDelete.setElement(nextNode.getElement());
            nodeToDelete.setNext(nextNode.getNext());

        } else {
            // eep, we're trying to delete the last node!
            throw new IllegalArgumentException("Can't delete the last node with this method!");
        }
    }
}
