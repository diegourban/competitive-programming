package urban.common.data_structure.array;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayUtilsTest {

    @Test
    public void shouldCreateInstance() {
        Assert.assertNotNull(new ArrayUtils());
    }

    @Test
    public void shouldFindRepeatingTest() {
        Assert.assertEquals(1, ArrayUtils.findRepeat(new int[]{1}));
        Assert.assertEquals(1, ArrayUtils.findRepeat(new int[]{1, 1}));
        Assert.assertEquals(1, ArrayUtils.findRepeat(new int[]{1, 1, 1}));
        Assert.assertEquals(1, ArrayUtils.findRepeat(new int[]{1, 1, 2, 3, 4, 5, 6, 7, 8, 9}));
        Assert.assertEquals(2, ArrayUtils.findRepeat(new int[]{1, 2, 2, 3, 4, 5, 6, 7, 8, 9}));
        Assert.assertEquals(3, ArrayUtils.findRepeat(new int[]{1, 2, 3, 3, 4, 5, 6, 7, 8, 9}));
        Assert.assertEquals(4, ArrayUtils.findRepeat(new int[]{1, 2, 3, 4, 4, 5, 6, 7, 8, 9}));
        Assert.assertEquals(5, ArrayUtils.findRepeat(new int[]{1, 2, 3, 4, 5, 5, 6, 7, 8, 9}));
        Assert.assertEquals(6, ArrayUtils.findRepeat(new int[]{1, 2, 3, 4, 5, 6, 6, 7, 8, 9}));
        Assert.assertEquals(7, ArrayUtils.findRepeat(new int[]{1, 2, 3, 4, 5, 6, 7, 7, 8, 9}));
        Assert.assertEquals(8, ArrayUtils.findRepeat(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 8, 9}));
        Assert.assertEquals(9, ArrayUtils.findRepeat(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 9}));
        Assert.assertEquals(1, ArrayUtils.findRepeat(new int[]{1, 2, 1, 3, 4, 5, 6, 7, 8}));
        Assert.assertEquals(1, ArrayUtils.findRepeat(new int[]{1, 2, 3, 1, 4, 5, 6, 7, 8}));
        Assert.assertEquals(1, ArrayUtils.findRepeat(new int[]{1, 2, 3, 4, 1, 5, 6, 7, 8}));
        Assert.assertEquals(1, ArrayUtils.findRepeat(new int[]{1, 2, 3, 4, 5, 1, 6, 7, 8}));
        Assert.assertEquals(1, ArrayUtils.findRepeat(new int[]{1, 2, 3, 4, 5, 6, 1, 7, 8}));
        Assert.assertEquals(1, ArrayUtils.findRepeat(new int[]{1, 2, 3, 4, 5, 6, 7, 1, 8}));
        Assert.assertEquals(1, ArrayUtils.findRepeat(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 1}));
    }

    @Test
    public void shouldFindDuplicatesTest() {
        Assert.assertEquals(1, ArrayUtils.findDuplicate(new int[]{1}));
        Assert.assertEquals(1, ArrayUtils.findDuplicate(new int[]{1, 1}));
        Assert.assertEquals(1, ArrayUtils.findDuplicate(new int[]{1, 1, 1}));
        Assert.assertEquals(1, ArrayUtils.findDuplicate(new int[]{1, 1, 2, 3, 4, 5, 6, 7, 8, 9}));
        Assert.assertEquals(2, ArrayUtils.findDuplicate(new int[]{1, 2, 2, 3, 4, 5, 6, 7, 8, 9}));
        Assert.assertEquals(3, ArrayUtils.findDuplicate(new int[]{1, 2, 3, 3, 4, 5, 6, 7, 8, 9}));
        Assert.assertEquals(4, ArrayUtils.findDuplicate(new int[]{1, 2, 3, 4, 4, 5, 6, 7, 8, 9}));
        Assert.assertEquals(5, ArrayUtils.findDuplicate(new int[]{1, 2, 3, 4, 5, 5, 6, 7, 8, 9}));
        Assert.assertEquals(6, ArrayUtils.findDuplicate(new int[]{1, 2, 3, 4, 5, 6, 6, 7, 8, 9}));
        Assert.assertEquals(7, ArrayUtils.findDuplicate(new int[]{1, 2, 3, 4, 5, 6, 7, 7, 8, 9}));
        Assert.assertEquals(8, ArrayUtils.findDuplicate(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 8, 9}));
        Assert.assertEquals(9, ArrayUtils.findDuplicate(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 9}));
        Assert.assertEquals(1, ArrayUtils.findDuplicate(new int[]{1, 2, 1, 3, 4, 5, 6, 7, 8}));
        Assert.assertEquals(1, ArrayUtils.findDuplicate(new int[]{1, 2, 3, 1, 4, 5, 6, 7, 8}));
        Assert.assertEquals(1, ArrayUtils.findDuplicate(new int[]{1, 2, 3, 4, 1, 5, 6, 7, 8}));
        Assert.assertEquals(1, ArrayUtils.findDuplicate(new int[]{1, 2, 3, 4, 5, 1, 6, 7, 8}));
        Assert.assertEquals(1, ArrayUtils.findDuplicate(new int[]{1, 2, 3, 4, 5, 6, 1, 7, 8}));
        Assert.assertEquals(1, ArrayUtils.findDuplicate(new int[]{1, 2, 3, 4, 5, 6, 7, 1, 8}));
        Assert.assertEquals(1, ArrayUtils.findDuplicate(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 1}));
    }

    @Test
    public void shouldFindTwoMatchingLengthsTest() {
        Assert.assertTrue(ArrayUtils.canTwoLengthsFillMaxLength(new int[]{1, 1}, 2));
        Assert.assertTrue(ArrayUtils.canTwoLengthsFillMaxLength(new int[]{1, 1, 2}, 3));
        Assert.assertFalse(ArrayUtils.canTwoLengthsFillMaxLength(new int[]{1, 1}, 3));
        Assert.assertFalse(ArrayUtils.canTwoLengthsFillMaxLength(new int[]{2, 3}, 2));
    }

    @Test
    public void shouldFindUniqueId() {
        assertThat(ArrayUtils.findUniqueId(new int[]{1, 2, 2}), is(1));
        assertThat(ArrayUtils.findUniqueId(new int[]{1, 2, 1}), is(2));
        assertThat(ArrayUtils.findUniqueId(new int[]{1, 5, 8, 2, 4, 9, 9, 8, 4, 1, 2}), is(5));
    }
}
