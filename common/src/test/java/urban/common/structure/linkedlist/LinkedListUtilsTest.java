package urban.common.structure.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListUtilsTest {

    public void shouldCreateInstance() {
        Assert.assertNotNull(new LinkedListUtils());
    }

    @Test
    public void shouldReverseLinkedList() {
        LinkedListNode head = new LinkedListNode(1);
        LinkedListNode middle = new LinkedListNode(1);
        LinkedListNode tail = new LinkedListNode(1);

        head.next = middle;
        middle.next = tail;

        LinkedListNode reverse = LinkedListUtils.reverse(head);
        Assert.assertEquals(reverse, tail);
        Assert.assertEquals(reverse.next, middle);
        Assert.assertEquals(reverse.next.next, head);
    }
}
