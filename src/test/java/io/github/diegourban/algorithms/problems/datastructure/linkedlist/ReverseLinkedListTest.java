package io.github.diegourban.algorithms.problems.datastructure.linkedlist;

import io.github.diegourban.algorithms.datastructure.Element;
import io.github.diegourban.algorithms.datastructure.linkedlist.LinkedList;
import io.github.diegourban.algorithms.datastructure.linkedlist.LinkedListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Reverse A Linked List — Interview Cake.
 * <p>
 * https://www.interviewcake.com/question/java/reverse-linked-list
 * <p>
 * In place, in one pass: point each node's next at the previous node; the last node visited is the new head.
 * O(n) time, O(1) space.
 */
class ReverseLinkedListTest {

    static LinkedListNode solve(LinkedList list) {
        LinkedListNode previous = null;
        var current = list.getFirst();
        while (current != null) {
            var next = current.getNext();
            current.setNext(previous);
            previous = current;
            current = next;
        }
        return previous;
    }

    @Test
    void reversesTheList() {
        var list = new LinkedList();
        list.addAtEnd(new Element("a"));
        list.addAtEnd(new Element("b"));
        list.addAtEnd(new Element("c"));

        var head = solve(list);

        assertThat(head.getElement().getName()).isEqualTo("c");
        assertThat(head.getNext().getElement().getName()).isEqualTo("b");
        assertThat(head.getNext().getNext().getElement().getName()).isEqualTo("a");
        assertThat(head.getNext().getNext().getNext()).isNull();
    }

    @Test
    void emptyListReversesToNull() {
        assertThat(solve(new LinkedList())).isNull();
    }
}
