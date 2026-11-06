package io.github.diegourban.algorithms.datastructure.array;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class ArrayUtilsTest {

    @Test
    void shouldNotShuffleSmallArray() {
        final int[] array = new int[] {1};
        ArrayUtils.shuffle(array);
        assertThat(array).hasSize(1);

        final Integer[] what = Arrays.stream(array).boxed().toArray(Integer[]::new);
        assertThat(what).containsExactlyInAnyOrder(1);
    }

    @Test
    void shouldShuffle() {
        final int[] array = new int[] {1, 2, 3, 4, 5};
        ArrayUtils.shuffle(array);
        assertThat(array).hasSize(5);

        final Integer[] what = Arrays.stream(array).boxed().toArray(Integer[]::new);
        assertThat(what).containsExactlyInAnyOrder(1, 2, 3, 4, 5);
    }

    @Test
    void shouldSwapTwoPositions() {
        final int[] values = {1, 2, 3};

        ArrayUtils.swap(values, 0, 2);
        assertThat(values).containsExactly(3, 2, 1);

        ArrayUtils.swap(values, 1, 1);
        assertThat(values).containsExactly(3, 2, 1);
    }
}
