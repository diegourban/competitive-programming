package io.github.diegourban.algorithms.problems.datastructure.linkedlist;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

/**
 * Merge two sorted linked lists — HackerRank.
 * <p>
 * https://www.hackerrank.com/challenges/merge-two-sorted-linked-lists/problem
 * <p>
 * Splice nodes behind a sentinel head, always taking the smaller head, then append whatever list remains.
 * O(n + m) time, O(1) extra space.
 */
class MergeSortedLinkedListsTest {

    private static final class Node {
        private final int data;
        private Node next;

        private Node(final int data) {
            this.data = data;
        }
    }

    static Node solve(final Node headA, final Node headB) {
        final var sentinel = new Node(0);
        var tail = sentinel;
        var a = headA;
        var b = headB;
        while (a != null && b != null) {
            if (a.data < b.data) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }
        tail.next = a != null ? a : b;
        return sentinel.next;
    }

    private static Node list(final int... values) {
        final var sentinel = new Node(0);
        var tail = sentinel;
        for (final var value : values) {
            tail.next = new Node(value);
            tail = tail.next;
        }
        return sentinel.next;
    }

    private static List<Integer> values(final Node head) {
        final var values = new ArrayList<Integer>();
        for (var node = head; node != null; node = node.next) {
            values.add(node.data);
        }
        return values;
    }

    @Test
    void mergesListWithEmptyOne() {
        assertThat(values(solve(list(1, 2, 3), null))).containsExactly(1, 2, 3);
    }

    @Test
    void mergesEmptyListWithNonEmptyOne() {
        assertThat(values(solve(null, list(1, 2, 3)))).containsExactly(1, 2, 3);
    }

    @Test
    void interleavesSortedLists() {
        assertThat(values(solve(list(1, 3), list(2, 4)))).containsExactly(1, 2, 3, 4);
    }

    @Test
    void keepsDuplicates() {
        assertThat(values(solve(list(1, 2, 2), list(2, 5)))).containsExactly(1, 2, 2, 2, 5);
    }

    @Test
    void mergesTwoEmptyLists() {
        assertThat(solve(null, null)).isNull();
    }
}
