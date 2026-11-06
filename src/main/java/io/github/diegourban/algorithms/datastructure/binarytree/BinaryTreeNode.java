package io.github.diegourban.algorithms.datastructure.binarytree;

public class BinaryTreeNode {

    public int value;
    public BinaryTreeNode left;
    public BinaryTreeNode right;

    public BinaryTreeNode(final int value) {
        this.value = value;
    }

    public BinaryTreeNode insertLeft(final int leftValue) {
        this.left = new BinaryTreeNode(leftValue);
        return this.left;
    }

    public BinaryTreeNode insertRight(final int rightValue) {
        this.right = new BinaryTreeNode(rightValue);
        return this.right;
    }
}
