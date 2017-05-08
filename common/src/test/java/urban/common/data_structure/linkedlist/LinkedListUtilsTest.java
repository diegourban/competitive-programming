package urban.common.data_structure.linkedlist;

import org.junit.Assert;
import org.junit.Test;
import urban.common.data_structure.Element;

public class LinkedListUtilsTest {

    public void shouldCreateInstance() {
        Assert.assertNotNull(new LinkedListUtils());
    }

    @Test
    public void shouldReverseLinkedList() {
        LinkedList linkedList = new LinkedList();
        linkedList.addAtEnd(new Element("a"));
        linkedList.addAtEnd(new Element("b"));
        linkedList.addAtEnd(new Element("c"));

        LinkedListNode reverse = LinkedListUtils.reverse(linkedList);
        Assert.assertEquals(reverse.getElement().getName(), "c");
        Assert.assertEquals(reverse.getNext().getElement().getName(), "b");
        Assert.assertEquals(reverse.getNext().getNext().getElement().getName(), "a");
    }
}
