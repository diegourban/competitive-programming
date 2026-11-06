package io.github.diegourban.algorithms.sorting;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import net.jqwik.api.Arbitraries;
import net.jqwik.api.Arbitrary;
import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.Provide;

/**
 * Every {@link Sorter} must agree with {@link Arrays#sort(int[])} on any input.
 */
class SorterPropertyTest {

    @Provide
    Arbitrary<Sorter> sorters() {
        return Arbitraries.of(new InsertionSort(), new SelectionSort(), new MergeSort(), new QuickSort());
    }

    @Property
    void agreesWithTheJdk(@ForAll("sorters") final Sorter sorter, @ForAll final int[] items) {
        final var expected = items.clone();
        Arrays.sort(expected);

        sorter.sort(items);

        assertThat(items).as(sorter.getClass().getSimpleName()).containsExactly(expected);
    }
}
