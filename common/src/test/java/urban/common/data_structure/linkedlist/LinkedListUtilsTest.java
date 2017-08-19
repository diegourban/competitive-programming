package urban.common.data_structure.linkedlist;

import org.junit.Assert;
import org.junit.Test;
import urban.common.data_structure.Element;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

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

    @Test
    public void shouldDeleteNode() {
        LinkedListNode a = new LinkedListNode(new Element("A"));
        LinkedListNode b = new LinkedListNode(new Element("B"));
        LinkedListNode c = new LinkedListNode(new Element("C"));

        a.setNext(b);
        b.setNext(c);

        LinkedListUtils.deleteNode(b);
        assertThat(a.getNext().getElement().getName(), is(c.getElement().getName()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldHandleDeleteLastNode() {
        LinkedListNode a = new LinkedListNode(new Element("A"));
        LinkedListUtils.deleteNode(a);
    }

    @Test
    public void shouldNotDetectCycle() {
        LinkedListNode a = new LinkedListNode(new Element("A"));
        LinkedListNode b = new LinkedListNode(new Element("B"));
        LinkedListNode c = new LinkedListNode(new Element("C"));

        a.setNext(b);
        b.setNext(c);

        assertFalse(LinkedListUtils.containsCycle(a));
    }

    @Test
    public void shouldDetectHeadCycle() {
        LinkedListNode a = new LinkedListNode(new Element("A"));
        LinkedListNode b = new LinkedListNode(new Element("B"));
        LinkedListNode c = new LinkedListNode(new Element("C"));

        a.setNext(b);
        b.setNext(c);
        c.setNext(a);

        assertTrue(LinkedListUtils.containsCycle(a));
    }

    @Test
    public void shouldDetectInnerCycle() {
        LinkedListNode a = new LinkedListNode(new Element("A"));
        LinkedListNode b = new LinkedListNode(new Element("B"));
        LinkedListNode c = new LinkedListNode(new Element("C"));

        a.setNext(b);
        b.setNext(c);
        c.setNext(b);

        assertTrue(LinkedListUtils.containsCycle(a));
    }
}
