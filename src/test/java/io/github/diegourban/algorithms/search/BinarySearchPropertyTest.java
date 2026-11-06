package io.github.diegourban.algorithms.search;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import net.jqwik.api.ForAll;
import net.jqwik.api.Property;

/**
 * {@link BinarySearch#indexOf(int[], int)} must agree with {@link Arrays#binarySearch(int[], int)} on whether the key
 * is present. With duplicates the two may pick different indexes, so only the found value is compared.
 */
class BinarySearchPropertyTest {

    @Property
    void agreesWithTheJdk(@ForAll final int[] items, @ForAll final int key) {
        Arrays.sort(items);

        final var index = BinarySearch.indexOf(items, key);

        if (Arrays.binarySearch(items, key) >= 0) {
            assertThat(items[index]).isEqualTo(key);
        } else {
            assertThat(index).isEqualTo(-1);
        }
    }

    @Property
    void findsEveryElementThatIsPresent(@ForAll final int[] items) {
        Arrays.sort(items);

        for (final var item : items) {
            assertThat(items[BinarySearch.indexOf(items, item)]).isEqualTo(item);
        }
    }
}
