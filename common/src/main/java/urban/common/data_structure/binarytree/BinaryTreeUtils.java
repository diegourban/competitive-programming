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
     * <p>
     * With a depth-first it walks through our tree, keeping track of the depth as we go. When we find a leaf, we throw its depth into a list of depths if we haven't seen that depth already.
     * Each time we hit a leaf with a new depth, there are two ways that our tree might now be unbalanced:
     * 1 - There are more than 2 different leaf depths
     * 2 - There are exactly 2 leaf depths and they are more than 1 apart.
     * <p>
     * Why are we doing a depth-first walk and not a breadth-first one?
     * You could make a case for either. We chose depth-first because it reaches leaves faster, which allows us to short-circuit earlier in some cases.
     * <p>
     * Complexity: O(n) time and O(n) space.
     *
     * @param treeRoot
     * @return
     */
    public static boolean isSuperBalanced(BinaryTreeNode treeRoot) {
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

    /**
     * Utilitary class to encapsulate the node and its depth
     */
    private static class NodeDepthPair {
        private BinaryTreeNode node;
        private int depth;

        private NodeDepthPair(BinaryTreeNode node, int depth) {
            this.node = node;
            this.depth = depth;
        }
    }

    /**
     * Check if a binary tree is a valid binary search tree.
     * <p>
     * A binary search tree is a binary tree in which, for each node:
     * 1 - The node's value is greater than all values in the left subtree.
     * 2 - The node's value is less than all values in the right subtree.
     * <p>
     * Solution: We do a depth-first walk through the tree, testing each node for validity as we go.
     * A given node is valid if it's greater than all the ancestral nodes it's in the right sub-tree of and less than all the ancestral nodes it's in the left-subtree of.
     * Instead of keeping track of each ancestor to check these inequalities, we just check the largest number it must be greater than (its lowerBound) and the smallest number it must be less than (its upperBound)
     * <p>
     * Complexity: O(n) time and O(n) space.
     * The time cost is easy: for valid binary search trees, we’ll have to check all n nodes.
     * Space is a little more complicated. Because we’re doing a depth first search, nodeAndBoundsStack will hold at most dd nodes where dd is the depth of the tree (the number of levels in the tree from the root node down to the lowest node). So we could say our space cost is O(d).
     * But we can also relate d to n. In a balanced tree, d is \log_{2}{n}.
     * And the more unbalanced the tree gets, the closer d gets to n.
     *
     * @param root the tree root
     * @return true if the binary tree is a valid binary search tree, false otherwise.
     */
    public static boolean isBinarySearchTree(BinaryTreeNode root) {
        // start at the root, with an arbitrarily low lower bound
        // and an arbitrarily high upper bound
        Stack<NodeBounds> nodeAndBoundsStack = new Stack<>();
        nodeAndBoundsStack.push(new NodeBounds(root, Integer.MIN_VALUE, Integer.MAX_VALUE));

        // depth-first traversal
        while (!nodeAndBoundsStack.empty()) {
            NodeBounds nb = nodeAndBoundsStack.pop();
            BinaryTreeNode node = nb.node;
            int lowerBound = nb.lowerBound;
            int upperBound = nb.upperBound;

            // if this node is invalid, we return false right away
            if (node.value <= lowerBound || node.value >= upperBound) {
                return false;
            }

            if (node.left != null) {
                // this node must be less than the current node
                nodeAndBoundsStack.push(new NodeBounds(node.left, lowerBound, node.value));
            }
            if (node.right != null) {
                // this node must be greater than the current node
                nodeAndBoundsStack.push(new NodeBounds(node.right, node.value, upperBound));
            }
        }

        // if none of the nodes were invalid, return true
        // (at this point we have checked all nodes)
        return true;
    }

    private static class NodeBounds {

        private final BinaryTreeNode node;
        private final int lowerBound;
        private final int upperBound;

        private NodeBounds(final BinaryTreeNode node, final int lowerBound, final int upperBound) {
            this.node = node;
            this.lowerBound = lowerBound;
            this.upperBound = upperBound;
        }
    }
}
