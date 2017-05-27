package urban.common.algorithm;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BinarySearchTest {

    @Test
    public void shouldHandleNotExistingElement() {
        final int[] items = {1, 2, 3, 5, 6, 7, 8, 9, 10};
        final int element = 4;
        final int expectedPosition = -1;

        final BinarySearch binarySearch = new BinarySearch();
        final int position = binarySearch.find(items, 0, items.length, element);
        assertThat(position, is(expectedPosition));
    }

    @Test
    public void shouldFindOnRightSide() {
        final int[] items = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        final int element = 9;
        final int expectedPosition = 8;

        final BinarySearch binarySearch = new BinarySearch();
        final int position = binarySearch.find(items, 0, items.length, element);
        assertThat(position, is(expectedPosition));
    }

    @Test
    public void shouldFindOnLeftSide() {
        final int[] items = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        final int element = 3;
        final int expectedPosition = 2;

        final BinarySearch binarySearch = new BinarySearch();
        final int position = binarySearch.find(items, 0, items.length, element);
        assertThat(position, is(expectedPosition));
    }
}
