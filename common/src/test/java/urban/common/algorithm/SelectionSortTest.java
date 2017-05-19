package urban.common.algorithm;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SelectionSortTest {

    @Test
    public void test() {
        final int[] items = new int[]{5,7,2,9,4,8,1,10,3,6};

        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(items, items.length);
        assertThat(items[0], is(1));
        assertThat(items[9], is(10));
    }
}
