package urban.common.data_structure.binarytree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * BinaryTreeUtils
 */
public class BinaryTreeUtils {

    private static int findLargest(BinaryTreeNode rootNode) {
        BinaryTreeNode current = rootNode;
        while (current.right != null) {
            current = current.right;
        }
        return current.value;
    }

    /**
     * Find the second largest element on a binary search tree.
     * <p>
     * Solution: We start with a function for getting the largest value. The largest value is simply the "rightmost" one, so we can get it in one walk down the tree by traversing rightward until we don't have a right child anymore.
     * <p>
     * Complexity: We're doing one walk down our BST, which means O(h) time, where hh is the height of the tree (again, that's O(lg n) if the tree is balanced, O(n) otherwise). O(1) space.
     *
     * @param rootNode the root nde
     * @return the value
     */
    public static int findSecondLargest(BinaryTreeNode rootNode) {
        if (rootNode == null || (rootNode.left == null
                && rootNode.right == null)) {
            throw new IllegalArgumentException("Tree must have at least 2 nodes");
        }

        BinaryTreeNode current = rootNode;

        while (true) {

            // case: current is largest and has a left subtree
            // 2nd largest is the largest in that subtree
            if (current.left != null && current.right == null) {
                return findLargest(current.left);
            }

            // case: current is parent of largest, and largest has no children,
            // so current is 2nd largest
            if (current.right != null &&
                    current.right.left == null &&
                    current.right.right == null) {
                return current.value;
            }

            current = current.right;
        }
    }

    /**
     * Function to see if a tree is "superbalanced" (if the difference between the depths of any two leaf nodes is no greater than one.)
     *
     * With a depth-first it walks through our tree, keeping track of the depth as we go. When we find a leaf, we throw its depth into a list of depths if we haven't seen that depth already.
     * Each time we hit a leaf with a new depth, there are two ways that our tree might now be unbalanced:
     * 1 - There are more than 2 different leaf depths
     * 2 - There are exactly 2 leaf depths and they are more than 1 apart.
     *
     * Why are we doing a depth-first walk and not a breadth-first one?
     * You could make a case for either. We chose depth-first because it reaches leaves faster, which allows us to short-circuit earlier in some cases.
     *
     * Complexity: O(n) time and O(n) space.
     *
     * @param treeRoot
     * @return
     */
    public static boolean isBalanced(BinaryTreeNode treeRoot) {
        // a tree with no nodes is superbalanced, since there are no leaves!
        if (treeRoot == null) {
            return true;
        }

        // we short-circuit as soon as we find more than 2
        List<Integer> depths = new ArrayList<>(3);

        // nodes will store pairs of a node and the node's depth
        Stack<NodeDepthPair> nodes = new Stack<>();
        nodes.push(new NodeDepthPair(treeRoot, 0));

        while (!nodes.empty()) {

            // pop a node and its depth from the top of our stack
            NodeDepthPair nodeDepthPair = nodes.pop();
            BinaryTreeNode node = nodeDepthPair.node;
            int depth = nodeDepthPair.depth;

            // case: we found a leaf
            if (node.left == null && node.right == null) {

                // we only care if it's a new depth
                if (!depths.contains(depth)) {
                    depths.add(depth);

                    // two ways we might now have an unbalanced tree:
                    //   1) more than 2 different leaf depths
                    //   2) 2 leaf depths that are more than 1 apart
                    if (depths.size() > 2 || (depths.size() == 2
                            && Math.abs(depths.get(0) - depths.get(1)) > 1)) {
                        return false;
                    }
                }

                // case: this isn't a leaf - keep stepping down
            } else {
                if (node.left != null) {
                    nodes.push(new NodeDepthPair(node.left, depth + 1));
                }
                if (node.right != null) {
                    nodes.push(new NodeDepthPair(node.right, depth + 1));
                }
            }
        }

        return true;
    }

    private static class NodeDepthPair {
        BinaryTreeNode node;
        int depth;

        NodeDepthPair(BinaryTreeNode node, int depth) {
            this.node = node;
            this.depth = depth;
        }
    }
}
