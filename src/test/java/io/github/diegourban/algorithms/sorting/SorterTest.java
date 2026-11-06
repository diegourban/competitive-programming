package io.github.diegourban.algorithms.sorting;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * Example-based checks run against every {@link Sorter}; {@link SorterPropertyTest} covers random inputs.
 */
class SorterTest {

    static Stream<Sorter> sorters() {
        return Stream.of(new InsertionSort(), new SelectionSort(), new MergeSort(), new QuickSort());
    }

    private static int[] sorted(Sorter sorter, int... items) {
        sorter.sort(items);
        return items;
    }

    @ParameterizedTest
    @MethodSource("sorters")
    void sortsEvenLengthInput(Sorter sorter) {
        assertThat(sorted(sorter, 4, 5, 1, 9, 2, 3, 6, 7)).containsExactly(1, 2, 3, 4, 5, 6, 7, 9);
    }

    @ParameterizedTest
    @MethodSource("sorters")
    void sortsOddLengthInput(Sorter sorter) {
        assertThat(sorted(sorter, 4, 1, 8, 9, 10, 2, 3, 7, 6)).containsExactly(1, 2, 3, 4, 6, 7, 8, 9, 10);
        assertThat(sorted(sorter, 4, 5, 2, 9, 1, 7, 6, 3, 10)).containsExactly(1, 2, 3, 4, 5, 6, 7, 9, 10);
    }

    @ParameterizedTest
    @MethodSource("sorters")
    void keepsDuplicatesAndNegatives(Sorter sorter) {
        assertThat(sorted(sorter, 3, -1, 3, 0, -1, Integer.MIN_VALUE, Integer.MAX_VALUE))
                .containsExactly(Integer.MIN_VALUE, -1, -1, 0, 3, 3, Integer.MAX_VALUE);
    }

    @ParameterizedTest
    @MethodSource("sorters")
    void handlesTrivialInputs(Sorter sorter) {
        assertThat(sorted(sorter)).isEmpty();
        assertThat(sorted(sorter, 42)).containsExactly(42);
        assertThat(sorted(sorter, 1, 2, 3)).containsExactly(1, 2, 3);
        assertThat(sorted(sorter, 3, 2, 1)).containsExactly(1, 2, 3);
    }
}
