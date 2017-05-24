package urban.common.algorithm;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MergeSortTest {

    @Test
    public void shouldSortWithGroupsOfSameSize() {
        final int[] items = {4, 5, 1, 9, 2, 3, 6, 7};

        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(items, 0 , items.length);

        assertThat(items[0], is(1));
        assertThat(items[7], is(9));
    }

    @Test
    public void shouldSortWithLeftoverAtGroup1() {
        final int[] items = {4, 1, 8, 9, 10, 2, 3, 7, 6};

        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(items, 0 , items.length);

        assertThat(items[0], is(1));
        assertThat(items[8], is(10));
    }

    @Test
    public void shouldSortWithLeftoverAtGroup2() {
        final int[] items = {4, 5, 2, 9, 1, 7, 6, 3, 10};

        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(items, 0 , items.length);

        assertThat(items[0], is(1));
        assertThat(items[8], is(10));
    }
}
