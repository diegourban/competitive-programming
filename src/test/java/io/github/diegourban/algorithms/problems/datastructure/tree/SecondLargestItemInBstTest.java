package io.github.diegourban.algorithms.problems.datastructure.tree;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import io.github.diegourban.algorithms.datastructure.binarytree.BinaryTreeNode;
import org.junit.jupiter.api.Test;

/**
 * Find The Second Largest Item In A Binary Search Tree — Interview Cake.
 * <p>
 * https://www.interviewcake.com/question/java/second-largest-item-in-bst
 * <p>
 * Walk right: if the current node is the largest and has a left subtree, the answer is the rightmost node of
 * that subtree; if the current node is the parent of a childless largest, it is the answer. O(h) time, O(1) space.
 */
class SecondLargestItemInBstTest {

    static int solve(final BinaryTreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            throw new IllegalArgumentException("Tree must have at least 2 nodes");
        }
        var current = root;
        while (true) {
            if (current.left != null && current.right == null) {
                return largest(current.left);
            }
            if (current.right != null && current.right.left == null && current.right.right == null) {
                return current.value;
            }
            current = current.right;
        }
    }

    private static int largest(final BinaryTreeNode node) {
        var current = node;
        while (current.right != null) {
            current = current.right;
        }
        return current.value;
    }

    @Test
    void largestHasALeftSubtree() {
        final var root = new BinaryTreeNode(5);
        final var three = root.insertLeft(3);
        three.insertLeft(1);
        three.insertRight(4);
        final var eight = root.insertRight(8);
        eight.insertLeft(7);
        final var ten = eight.insertRight(12).insertLeft(10);
        ten.insertLeft(9);
        ten.insertRight(11);

        assertThat(solve(root)).isEqualTo(11);
    }

    @Test
    void parentOfChildlessLargest() {
        final var root = new BinaryTreeNode(5);
        root.insertLeft(3);
        root.insertRight(8);

        assertThat(solve(root)).isEqualTo(5);
    }

    @Test
    void rootIsLargestWithOnlyLeftSubtree() {
        final var root = new BinaryTreeNode(5);
        root.insertLeft(3).insertRight(4);

        assertThat(solve(root)).isEqualTo(4);
    }

    @Test
    void treeWithFewerThanTwoNodesIsRejected() {
        assertThatIllegalArgumentException().isThrownBy(() -> solve(null));
        assertThatIllegalArgumentException().isThrownBy(() -> solve(new BinaryTreeNode(1)));
    }
}
