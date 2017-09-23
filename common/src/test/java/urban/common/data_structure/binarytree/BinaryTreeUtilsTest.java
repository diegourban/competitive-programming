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

}
