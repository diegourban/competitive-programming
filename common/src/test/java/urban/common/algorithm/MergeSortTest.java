package urban.common.algorithm;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MergeSortTest {

    @Test
    public void shouldSortWithGroupsOfSameSize() {
        // already sorted groups
        final int[] items = {4, 5, 8, 9, 1, 3, 6, 7};

        MergeSort mergeSort = new MergeSort();
        final int[] merged = mergeSort.sort(items, 0 , 4, items.length);

        assertThat(merged[0], is(1));
        assertThat(merged[7], is(9));
    }

    @Test
    public void shouldSortWithLeftoverAtGroup1() {
        // already sorted groups
        final int[] items = {4, 5, 8, 9, 10, 1, 3, 6, 7};

        MergeSort mergeSort = new MergeSort();
        final int[] merged = mergeSort.sort(items, 0, 5, items.length);

        assertThat(merged[0], is(1));
        assertThat(merged[8], is(10));
    }

    @Test
    public void shouldSortWithLeftoverAtGroup2() {
        // already sorted groups
        final int[] items = {4, 5, 8, 9, 1, 3, 6, 7, 10};

        MergeSort mergeSort = new MergeSort();
        final int[] merged = mergeSort.sort(items, 0, 4, items.length);

        assertThat(merged[0], is(1));
        assertThat(merged[8], is(10));
    }
}
