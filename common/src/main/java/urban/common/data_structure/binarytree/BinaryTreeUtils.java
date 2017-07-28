package urban.common.data_structure.binarytree;

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
}
