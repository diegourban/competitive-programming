package io.github.diegourban.algorithms.datastructure.binarytree;

/**
 * A node of a binary tree holding an {@code int} value. The tree is built by linking nodes through the public
 * {@link #left} and {@link #right} fields.
 */
public class BinaryTreeNode {

    /** The value stored in this node. */
    public int value;
    /** The left child, or {@code null} if there is none. */
    public BinaryTreeNode left;
    /** The right child, or {@code null} if there is none. */
    public BinaryTreeNode right;

    /**
     * Creates a leaf node with the given value.
     *
     * @param value the value to store
     */
    public BinaryTreeNode(final int value) {
        this.value = value;
    }

    /**
     * Sets a new leaf node as the left child, replacing any existing left subtree.
     *
     * @param leftValue the value of the new left child
     * @return the new left child
     */
    public BinaryTreeNode insertLeft(final int leftValue) {
        this.left = new BinaryTreeNode(leftValue);
        return this.left;
    }

    /**
     * Sets a new leaf node as the right child, replacing any existing right subtree.
     *
     * @param rightValue the value of the new right child
     * @return the new right child
     */
    public BinaryTreeNode insertRight(final int rightValue) {
        this.right = new BinaryTreeNode(rightValue);
        return this.right;
    }
}
