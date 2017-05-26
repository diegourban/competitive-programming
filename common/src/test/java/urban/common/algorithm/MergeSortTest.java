package urban.common.algorithm;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class MergeSortTest {

    @Test
    public void shouldSortWithGroupsOfSameSize() {
        final int[] unsortedItems = {4, 5, 1, 9, 2, 3, 6, 7};
        final int[] sortedItems = {1, 2, 3, 4, 5, 6, 7, 9};

        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(unsortedItems, 0 , unsortedItems.length);

        assertThat(unsortedItems, equalTo(sortedItems));
    }

    @Test
    public void shouldSortWithLeftoverAtGroup1() {
        final int[] unsortedItems = {4, 1, 8, 9, 10, 2, 3, 7, 6};
        final int[] sortedItems = {1, 2, 3, 4, 6, 7, 8, 9, 10};

        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(unsortedItems, 0 , unsortedItems.length);

        assertThat(unsortedItems, equalTo(sortedItems));
    }

    @Test
    public void shouldSortWithLeftoverAtGroup2() {
        final int[] unsortedItems = {4, 5, 2, 9, 1, 7, 6, 3, 10};
        final int[] sortedItems = {1, 2, 3, 4, 5, 6, 7, 9, 10};

        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(unsortedItems, 0 , unsortedItems.length);

        assertThat(unsortedItems, equalTo(sortedItems));
    }
}
