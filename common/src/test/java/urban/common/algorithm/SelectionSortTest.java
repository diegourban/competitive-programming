package urban.common.algorithm;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class SelectionSortTest {

    @Test
    public void test() {
        List<Integer> list = Arrays.asList(5,7,1,4,9,10,2,8);

        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(list);
        assertThat(list.get(0), is(1));
        assertThat(list.get(7), is(10));
    }
}
