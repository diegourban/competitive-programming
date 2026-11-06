package io.github.diegourban.algorithms.problems.datastructure.tree;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.diegourban.algorithms.datastructure.binarytree.BinaryTreeNode;
import java.util.ArrayDeque;
import org.junit.jupiter.api.Test;

/**
 * Binary Search Tree Checker — Interview Cake.
 * <p>
 * https://www.interviewcake.com/question/java/bst-checker
 * <p>
 * Depth-first walk carrying each node's exclusive (lower, upper) bounds from its ancestors; any node outside its
 * bounds invalidates the tree. O(n) time, O(d) space where d is the tree depth.
 */
class BinarySearchTreeCheckerTest {

    private record NodeBounds(BinaryTreeNode node, long lower, long upper) {}

    static boolean solve(BinaryTreeNode root) {
        if (root == null) {
            return true;
        }
        var stack = new ArrayDeque<NodeBounds>();
        stack.push(new NodeBounds(root, Long.MIN_VALUE, Long.MAX_VALUE));

        while (!stack.isEmpty()) {
            var current = stack.pop();
            var node = current.node();
            if (node.value <= current.lower() || node.value >= current.upper()) {
                return false;
            }
            if (node.left != null) {
                stack.push(new NodeBounds(node.left, current.lower(), node.value));
            }
            if (node.right != null) {
                stack.push(new NodeBounds(node.right, node.value, current.upper()));
            }
        }
        return true;
    }

    @Test
    void descendantViolatingAncestorBoundIsNotABst() {
        var root = new BinaryTreeNode(50);
        var eighty = root.insertRight(80);
        eighty.insertRight(90);
        eighty.insertLeft(70);
        var thirty = root.insertLeft(30);
        thirty.insertRight(60);
        thirty.insertLeft(20);

        assertThat(solve(root)).isFalse();
    }

    @Test
    void validTreeIsABst() {
        var root = new BinaryTreeNode(50);
        var eighty = root.insertRight(80);
        eighty.insertRight(90);
        eighty.insertLeft(70);
        var thirty = root.insertLeft(30);
        thirty.insertRight(40);
        thirty.insertLeft(20);

        assertThat(solve(root)).isTrue();
    }

    @Test
    void duplicateValueIsNotABst() {
        var root = new BinaryTreeNode(5);
        root.insertLeft(5);

        assertThat(solve(root)).isFalse();
    }

    @Test
    void extremeIntValuesAreAllowed() {
        var root = new BinaryTreeNode(0);
        root.insertLeft(Integer.MIN_VALUE);
        root.insertRight(Integer.MAX_VALUE);

        assertThat(solve(root)).isTrue();
    }

    @Test
    void emptyTreeIsABst() {
        assertThat(solve(null)).isTrue();
    }
}
