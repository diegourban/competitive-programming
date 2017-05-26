package urban.common.algorithm;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class QuickSortTest {

    @Test
    public void shouldSort() {
        final int[] unsortedItems = {4, 5, 1, 9, 2, 3, 6, 7};
        final int[] sortedItems = {1, 2, 3, 4, 5, 6, 7, 9};

        QuickSort quickSort = new QuickSort();
        quickSort.sort(unsortedItems, 0, unsortedItems.length);

        assertThat(unsortedItems, equalTo(sortedItems));
    }
}
