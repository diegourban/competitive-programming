package urban.common.data_structure.binarytree;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class BinaryTreeUtilsTest {

    @Test
    public void shouldFindSecondLargest() {
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

        assertThat(BinaryTreeUtils.findSecondLargest(rootNode), Matchers.equalTo(11));
    }

    @Test
    public void shouldConsiderNullBinaryTreeAsSuperBalanced() {
        assertThat(BinaryTreeUtils.isSuperBalanced(null), Matchers.is(true));
    }

    @Test
    public void shouldConsiderOneNodeAsSuperBalanced() {
        assertThat(BinaryTreeUtils.isSuperBalanced(new BinaryTreeNode(1)), Matchers.is(true));
    }

    @Test
    public void shouldNotConsiderSuperBalanced() {
        BinaryTreeNode rootNode = new BinaryTreeNode(5);

        BinaryTreeNode btn = rootNode.insertLeft(3);
        btn.insertLeft(1);
        btn = btn.insertRight(4);
        btn.insertLeft(2);

        rootNode.insertRight(8);

        assertThat(BinaryTreeUtils.isSuperBalanced(rootNode), Matchers.is(false));
    }

    @Test
    public void shouldConsiderSuperBalanced() {
        BinaryTreeNode rootNode = new BinaryTreeNode(5);

        BinaryTreeNode btn = rootNode.insertLeft(3);
        btn.insertLeft(1);
        btn = btn.insertRight(4);
        btn.insertLeft(2);

        btn = rootNode.insertRight(8);
        btn.insertLeft(6);

        assertThat(BinaryTreeUtils.isSuperBalanced(rootNode), Matchers.is(true));
    }

    @Test
    public void shouldNotConsiderBinarySearchTree() {
        final BinaryTreeNode rootNode = new BinaryTreeNode(50);

        BinaryTreeNode btn = rootNode.insertRight(80);
        btn.insertRight(90);
        btn.insertLeft(70);

        btn = rootNode.insertLeft(30);
        btn.insertRight(60);
        btn.insertLeft(20);

        assertThat(BinaryTreeUtils.isBinarySearchTree(rootNode), Matchers.is(false));
    }

    @Test
    public void shouldConsiderBinarySearchTree() {
        final BinaryTreeNode rootNode = new BinaryTreeNode(50);

        BinaryTreeNode btn = rootNode.insertRight(80);
        btn.insertRight(90);
        btn.insertLeft(70);

        btn = rootNode.insertLeft(30);
        btn.insertRight(40);
        btn.insertLeft(20);

        assertThat(BinaryTreeUtils.isBinarySearchTree(rootNode), Matchers.is(true));
    }

}
