package io.github.diegourban.algorithms.datastructure.linkedlist;

import org.junit.jupiter.api.Test;
import io.github.diegourban.algorithms.datastructure.Element;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class LinkedListUtilsTest {

    public void shouldCreateInstance() {
        assertThat(new LinkedListUtils()).isNotNull();
    }

    @Test
    void shouldReverseLinkedList() {
        LinkedList linkedList = new LinkedList();
        linkedList.addAtEnd(new Element("a"));
        linkedList.addAtEnd(new Element("b"));
        linkedList.addAtEnd(new Element("c"));

        LinkedListNode reverse = LinkedListUtils.reverse(linkedList);
        assertThat(reverse.getElement().getName()).isEqualTo("c");
        assertThat(reverse.getNext().getElement().getName()).isEqualTo("b");
        assertThat(reverse.getNext().getNext().getElement().getName()).isEqualTo("a");
    }

    @Test
    void shouldDeleteNode() {
        LinkedListNode a = new LinkedListNode(new Element("A"));
        LinkedListNode b = new LinkedListNode(new Element("B"));
        LinkedListNode c = new LinkedListNode(new Element("C"));

        a.setNext(b);
        b.setNext(c);

        LinkedListUtils.deleteNode(b);
        assertThat(a.getNext().getElement().getName()).isEqualTo(c.getElement().getName());
    }

    @Test
    void shouldHandleDeleteLastNode() {
        LinkedListNode a = new LinkedListNode(new Element("A"));
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() ->
                LinkedListUtils.deleteNode(a));
    }

    @Test
    void shouldNotDetectCycle() {
        LinkedListNode a = new LinkedListNode(new Element("A"));
        LinkedListNode b = new LinkedListNode(new Element("B"));
        LinkedListNode c = new LinkedListNode(new Element("C"));

        a.setNext(b);
        b.setNext(c);

        assertThat(LinkedListUtils.containsCycle(a)).isFalse();
    }

    @Test
    void shouldDetectHeadCycle() {
        LinkedListNode a = new LinkedListNode(new Element("A"));
        LinkedListNode b = new LinkedListNode(new Element("B"));
        LinkedListNode c = new LinkedListNode(new Element("C"));

        a.setNext(b);
        b.setNext(c);
        c.setNext(a);

        assertThat(LinkedListUtils.containsCycle(a)).isTrue();
    }

    @Test
    void shouldDetectInnerCycle() {
        LinkedListNode a = new LinkedListNode(new Element("A"));
        LinkedListNode b = new LinkedListNode(new Element("B"));
        LinkedListNode c = new LinkedListNode(new Element("C"));

        a.setNext(b);
        b.setNext(c);
        c.setNext(b);

        assertThat(LinkedListUtils.containsCycle(a)).isTrue();
    }

    @Test
    void shouldMergeLinkedListWithEmptyOne() {
        Node headA = new Node(1);
        Node node = new Node(2);
        node.setNext(new Node(3));
        headA.setNext(node);

        Node headB = null;

        Node merged = LinkedListUtils.merge(headA, headB);
        assertThat(merged.getData()).isEqualTo(1);
        assertThat(merged.getNext().getData()).isEqualTo(2);
        assertThat(merged.getNext().getNext().getData()).isEqualTo(3);
    }

    @Test
    void shouldMergeEmptyLinkedListWithNotEmpty() {
        Node headA = null;

        Node headB = new Node(1);
        Node node = new Node(2);
        node.setNext(new Node(3));
        headB.setNext(node);

        Node merged = LinkedListUtils.merge(headA, headB);
        assertThat(merged.getData()).isEqualTo(1);
        assertThat(merged.getNext().getData()).isEqualTo(2);
        assertThat(merged.getNext().getNext().getData()).isEqualTo(3);
    }

    @Test
    void shouldMergeLinkedLists() {
        Node headA = new Node(1);
        headA.setNext(new Node(3));

        Node headB = new Node(2);
        headB.setNext(new Node(4));

        Node merged = LinkedListUtils.merge(headA, headB);
        assertThat(merged.getData()).isEqualTo(1);
        assertThat(merged.getNext().getData()).isEqualTo(2);
        assertThat(merged.getNext().getNext().getData()).isEqualTo(3);
        assertThat(merged.getNext().getNext().getNext().getData()).isEqualTo(4);
    }
}
