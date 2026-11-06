package io.github.diegourban.algorithms.problems.datastructure.linkedlist;

import io.github.diegourban.algorithms.datastructure.Element;
import io.github.diegourban.algorithms.datastructure.linkedlist.LinkedListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

/**
 * Delete Node — Interview Cake.
 * <p>
 * https://www.interviewcake.com/question/java/delete-node
 * <p>
 * Given only the node to delete, copy the next node's value and pointer into it so the previous node effectively
 * skips it; the last node cannot be deleted this way. O(1) time, O(1) space.
 */
class DeleteNodeTest {

    static void solve(LinkedListNode nodeToDelete) {
        var next = nodeToDelete.getNext();
        if (next == null) {
            throw new IllegalArgumentException("Can't delete the last node with this method!");
        }
        nodeToDelete.setElement(next.getElement());
        nodeToDelete.setNext(next.getNext());
    }

    @Test
    void deletesAMiddleNode() {
        var a = new LinkedListNode(new Element("A"));
        var b = new LinkedListNode(new Element("B"));
        var c = new LinkedListNode(new Element("C"));
        a.setNext(b);
        b.setNext(c);

        solve(b);

        assertThat(a.getNext().getElement().getName()).isEqualTo("C");
        assertThat(a.getNext().getNext()).isNull();
    }

    @Test
    void lastNodeCannotBeDeleted() {
        var a = new LinkedListNode(new Element("A"));

        assertThatIllegalArgumentException().isThrownBy(() -> solve(a));
    }
}
