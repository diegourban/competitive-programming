package urban.common.data_structure.binarytree;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinaryTreeUtilsTest {

    private BinaryTreeNode rootNode = null;

    @Before
    public void before() {
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
    }

    @Test
    public void shouldFindSecondLargest() {
        Assert.assertThat(BinaryTreeUtils.findSecondLargest(rootNode), Matchers.equalTo(11));
    }

}
