package io.github.diegourban.algorithms.search;

import net.jqwik.api.ForAll;
import net.jqwik.api.Property;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * {@link BinarySearch#indexOf(int[], int)} must agree with {@link Arrays#binarySearch(int[], int)} on whether the key
 * is present. With duplicates the two may pick different indexes, so only the found value is compared.
 */
class BinarySearchPropertyTest {

    @Property
    void agreesWithTheJdk(@ForAll int[] items, @ForAll int key) {
        Arrays.sort(items);

        var index = BinarySearch.indexOf(items, key);

        if (Arrays.binarySearch(items, key) >= 0) {
            assertThat(items[index]).isEqualTo(key);
        } else {
            assertThat(index).isEqualTo(-1);
        }
    }

    @Property
    void findsEveryElementThatIsPresent(@ForAll int[] items) {
        Arrays.sort(items);

        for (var item : items) {
            assertThat(items[BinarySearch.indexOf(items, item)]).isEqualTo(item);
        }
    }
}
