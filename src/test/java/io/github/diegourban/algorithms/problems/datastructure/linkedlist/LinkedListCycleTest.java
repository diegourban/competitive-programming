package io.github.diegourban.algorithms.problems.datastructure.linkedlist;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.diegourban.algorithms.datastructure.Element;
import io.github.diegourban.algorithms.datastructure.linkedlist.LinkedListNode;
import org.junit.jupiter.api.Test;

/**
 * Does This Linked List Have A Cycle? — Interview Cake.
 * <p>
 * https://www.interviewcake.com/question/java/linked-list-cycles
 * <p>
 * Floyd's two runners: the slow one moves one node per step, the fast one two; they meet if and only if there is
 * a cycle, otherwise the fast one falls off the end. O(n) time, O(1) space.
 */
class LinkedListCycleTest {

    static boolean solve(LinkedListNode first) {
        var slow = first;
        var fast = first;
        while (fast != null && fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    private static LinkedListNode[] chain(String... names) {
        var nodes = new LinkedListNode[names.length];
        for (var i = 0; i < names.length; i++) {
            nodes[i] = new LinkedListNode(new Element(names[i]));
            if (i > 0) {
                nodes[i - 1].setNext(nodes[i]);
            }
        }
        return nodes;
    }

    @Test
    void acyclicListHasNoCycle() {
        var nodes = chain("A", "B", "C");

        assertThat(solve(nodes[0])).isFalse();
    }

    @Test
    void tailPointingAtHeadIsACycle() {
        var nodes = chain("A", "B", "C");
        nodes[2].setNext(nodes[0]);

        assertThat(solve(nodes[0])).isTrue();
    }

    @Test
    void tailPointingInsideIsACycle() {
        var nodes = chain("A", "B", "C");
        nodes[2].setNext(nodes[1]);

        assertThat(solve(nodes[0])).isTrue();
    }

    @Test
    void emptyListHasNoCycle() {
        assertThat(solve(null)).isFalse();
    }
}
