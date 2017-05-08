package urban.common.structure.linkedlist;

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
     * @param headOfList
     * @return previous because when we exit the list, current is null. Which means that the last node we visited—previous—was the tail of the original list, and thus the head of our reversed list
     */
    public static LinkedListNode reverse(final LinkedListNode headOfList) {
        LinkedListNode current = headOfList;
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
}
