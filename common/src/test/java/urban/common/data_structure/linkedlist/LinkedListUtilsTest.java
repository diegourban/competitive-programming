package urban.common.data_structure.linkedlist;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import urban.common.data_structure.Element;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

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

    @Test
    public void shouldMergeLinkedListWithEmptyOne() {
        Node headA = new Node(1);
        Node node = new Node(2);
        node.setNext(new Node(3));
        headA.setNext(node);

        Node headB = null;

        Node merged = LinkedListUtils.merge(headA, headB);
        Assert.assertThat(merged.getData(), Matchers.is(1));
        Assert.assertThat(merged.getNext().getData(), Matchers.is(2));
        Assert.assertThat(merged.getNext().getNext().getData(), Matchers.is(3));
    }

    @Test
    public void shouldMergeEmptyLinkedListWithNotEmpty() {
        Node headA = null;

        Node headB = new Node(1);
        Node node = new Node(2);
        node.setNext(new Node(3));
        headB.setNext(node);

        Node merged = LinkedListUtils.merge(headA, headB);
        Assert.assertThat(merged.getData(), Matchers.is(1));
        Assert.assertThat(merged.getNext().getData(), Matchers.is(2));
        Assert.assertThat(merged.getNext().getNext().getData(), Matchers.is(3));
    }

    @Test
    public void shouldMergeLinkedLists() {
        Node headA = new Node(1);
        headA.setNext(new Node(3));

        Node headB = new Node(2);
        headB.setNext(new Node(4));

        Node merged = LinkedListUtils.merge(headA, headB);
        Assert.assertThat(merged.getData(), Matchers.is(1));
        Assert.assertThat(merged.getNext().getData(), Matchers.is(2));
        Assert.assertThat(merged.getNext().getNext().getData(), Matchers.is(3));
        Assert.assertThat(merged.getNext().getNext().getNext().getData(), Matchers.is(4));
    }
}
