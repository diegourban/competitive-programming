package io.github.diegourban.algorithms.datastructure.binarytree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BinaryTreeUtilsTest {

    @Test
    void shouldFindSecondLargest() {
        BinaryTreeNode rootNode = null;
        rootNode = new BinaryTreeNode(5);
        BinaryTreeNode btn = rootNode.insertLeft(3);
        btn.insertLeft(1);
        btn.insertRight(4);

        btn = rootNode.insertRight(8);
        btn.insertLeft(7);
        btn = btn.insertRight(12);
        btn = btn.insertLeft(10);
        btn.insertLeft(9);
        btn.insertRight(11);

        assertThat(BinaryTreeUtils.findSecondLargest(rootNode)).isEqualTo(11);
    }

    @Test
    void shouldConsiderNullBinaryTreeAsSuperBalanced() {
        assertThat(BinaryTreeUtils.isSuperBalanced(null)).isEqualTo(true);
    }

    @Test
    void shouldConsiderOneNodeAsSuperBalanced() {
        assertThat(BinaryTreeUtils.isSuperBalanced(new BinaryTreeNode(1))).isEqualTo(true);
    }

    @Test
    void shouldNotConsiderSuperBalanced() {
        BinaryTreeNode rootNode = new BinaryTreeNode(5);

        BinaryTreeNode btn = rootNode.insertLeft(3);
        btn.insertLeft(1);
        btn = btn.insertRight(4);
        btn.insertLeft(2);

        rootNode.insertRight(8);

        assertThat(BinaryTreeUtils.isSuperBalanced(rootNode)).isEqualTo(false);
    }

    @Test
    void shouldConsiderSuperBalanced() {
        BinaryTreeNode rootNode = new BinaryTreeNode(5);

        BinaryTreeNode btn = rootNode.insertLeft(3);
        btn.insertLeft(1);
        btn = btn.insertRight(4);
        btn.insertLeft(2);

        btn = rootNode.insertRight(8);
        btn.insertLeft(6);

        assertThat(BinaryTreeUtils.isSuperBalanced(rootNode)).isEqualTo(true);
    }

    @Test
    void shouldNotConsiderBinarySearchTree() {
        final BinaryTreeNode rootNode = new BinaryTreeNode(50);

        BinaryTreeNode btn = rootNode.insertRight(80);
        btn.insertRight(90);
        btn.insertLeft(70);

        btn = rootNode.insertLeft(30);
        btn.insertRight(60);
        btn.insertLeft(20);

        assertThat(BinaryTreeUtils.isBinarySearchTree(rootNode)).isEqualTo(false);
    }

    @Test
    void shouldConsiderBinarySearchTree() {
        final BinaryTreeNode rootNode = new BinaryTreeNode(50);

        BinaryTreeNode btn = rootNode.insertRight(80);
        btn.insertRight(90);
        btn.insertLeft(70);

        btn = rootNode.insertLeft(30);
        btn.insertRight(40);
        btn.insertLeft(20);

        assertThat(BinaryTreeUtils.isBinarySearchTree(rootNode)).isEqualTo(true);
    }

}
