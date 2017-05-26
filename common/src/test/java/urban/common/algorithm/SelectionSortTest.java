package urban.common.algorithm;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class SelectionSortTest {

    @Test
    public void test() {
        final int[] unsortedItems = {5, 7, 2, 9, 4, 8, 1, 10, 3, 6};
        final int[] sortedItems = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(unsortedItems, unsortedItems.length);

        assertThat(unsortedItems, equalTo(sortedItems));
    }
}
