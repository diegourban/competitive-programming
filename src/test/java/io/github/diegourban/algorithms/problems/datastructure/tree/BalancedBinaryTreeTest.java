package io.github.diegourban.algorithms.problems.datastructure.tree;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.diegourban.algorithms.datastructure.binarytree.BinaryTreeNode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

/**
 * Balanced Binary Tree — Interview Cake.
 * <p>
 * https://www.interviewcake.com/question/java/balanced-binary-tree
 * <p>
 * A tree is "superbalanced" when no two leaf depths differ by more than one. Depth-first walk collecting distinct
 * leaf depths, short-circuiting on a third depth or two depths more than one apart. O(n) time, O(n) space.
 */
class BalancedBinaryTreeTest {

    private record NodeDepth(BinaryTreeNode node, int depth) {}

    static boolean solve(final BinaryTreeNode root) {
        if (root == null) {
            return true;
        }
        final var depths = new ArrayList<Integer>(3);
        final var nodes = new ArrayDeque<NodeDepth>();
        nodes.push(new NodeDepth(root, 0));

        while (!nodes.isEmpty()) {
            final var current = nodes.pop();
            final var node = current.node();
            final var depth = current.depth();

            if (node.left == null && node.right == null) {
                if (!depths.contains(depth)) {
                    depths.add(depth);
                    if (depths.size() > 2 || (depths.size() == 2 && Math.abs(depths.get(0) - depths.get(1)) > 1)) {
                        return false;
                    }
                }
            } else {
                if (node.left != null) {
                    nodes.push(new NodeDepth(node.left, depth + 1));
                }
                if (node.right != null) {
                    nodes.push(new NodeDepth(node.right, depth + 1));
                }
            }
        }
        return true;
    }

    @Test
    void emptyTreeIsSuperBalanced() {
        assertThat(solve(null)).isTrue();
    }

    @Test
    void singleNodeIsSuperBalanced() {
        assertThat(solve(new BinaryTreeNode(1))).isTrue();
    }

    @Test
    void leavesTwoLevelsApartAreNotSuperBalanced() {
        final var root = new BinaryTreeNode(5);
        final var three = root.insertLeft(3);
        three.insertLeft(1);
        three.insertRight(4).insertLeft(2);
        root.insertRight(8);

        assertThat(solve(root)).isFalse();
    }

    @Test
    void leavesAtMostOneLevelApartAreSuperBalanced() {
        final var root = new BinaryTreeNode(5);
        final var three = root.insertLeft(3);
        three.insertLeft(1);
        three.insertRight(4).insertLeft(2);
        root.insertRight(8).insertLeft(6);

        assertThat(solve(root)).isTrue();
    }
}
