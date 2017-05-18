package urban.common.algorithm;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SelectionSortTest {

    @Test
    public void test() {
        final int[] list = new int[]{5,7,2,9,4,8,1,10,3,6};

        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(list, list.length);
        assertThat(list[0], is(1));
        assertThat(list[9], is(10));
    }
}
