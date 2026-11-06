package io.github.diegourban.algorithms.datastructure.array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class ArrayUtilsTest {

    @Test
    void shouldCreateInstance() {
        assertThat(new ArrayUtils()).isNotNull();
    }

    @Test
    void shouldFindRepeatingTest() {
        assertThat(ArrayUtils.findRepeat(new int[]{1})).isOne();
        assertThat(ArrayUtils.findRepeat(new int[]{1, 1})).isOne();
        assertThat(ArrayUtils.findRepeat(new int[]{1, 1, 1})).isOne();
        assertThat(ArrayUtils.findRepeat(new int[]{1, 1, 2, 3, 4, 5, 6, 7, 8, 9})).isOne();
        assertThat(ArrayUtils.findRepeat(new int[]{1, 2, 2, 3, 4, 5, 6, 7, 8, 9})).isEqualTo(2);
        assertThat(ArrayUtils.findRepeat(new int[]{1, 2, 3, 3, 4, 5, 6, 7, 8, 9})).isEqualTo(3);
        assertThat(ArrayUtils.findRepeat(new int[]{1, 2, 3, 4, 4, 5, 6, 7, 8, 9})).isEqualTo(4);
        assertThat(ArrayUtils.findRepeat(new int[]{1, 2, 3, 4, 5, 5, 6, 7, 8, 9})).isEqualTo(5);
        assertThat(ArrayUtils.findRepeat(new int[]{1, 2, 3, 4, 5, 6, 6, 7, 8, 9})).isEqualTo(6);
        assertThat(ArrayUtils.findRepeat(new int[]{1, 2, 3, 4, 5, 6, 7, 7, 8, 9})).isEqualTo(7);
        assertThat(ArrayUtils.findRepeat(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 8, 9})).isEqualTo(8);
        assertThat(ArrayUtils.findRepeat(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 9})).isEqualTo(9);
        assertThat(ArrayUtils.findRepeat(new int[]{1, 2, 1, 3, 4, 5, 6, 7, 8})).isOne();
        assertThat(ArrayUtils.findRepeat(new int[]{1, 2, 3, 1, 4, 5, 6, 7, 8})).isOne();
        assertThat(ArrayUtils.findRepeat(new int[]{1, 2, 3, 4, 1, 5, 6, 7, 8})).isOne();
        assertThat(ArrayUtils.findRepeat(new int[]{1, 2, 3, 4, 5, 1, 6, 7, 8})).isOne();
        assertThat(ArrayUtils.findRepeat(new int[]{1, 2, 3, 4, 5, 6, 1, 7, 8})).isOne();
        assertThat(ArrayUtils.findRepeat(new int[]{1, 2, 3, 4, 5, 6, 7, 1, 8})).isOne();
        assertThat(ArrayUtils.findRepeat(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 1})).isOne();
    }

    @Test
    void shouldFindDuplicatesTest() {
        assertThat(ArrayUtils.findDuplicate(new int[]{1})).isOne();
        assertThat(ArrayUtils.findDuplicate(new int[]{1, 1})).isOne();
        assertThat(ArrayUtils.findDuplicate(new int[]{1, 1, 1})).isOne();
        assertThat(ArrayUtils.findDuplicate(new int[]{1, 1, 2, 3, 4, 5, 6, 7, 8, 9})).isOne();
        assertThat(ArrayUtils.findDuplicate(new int[]{1, 2, 2, 3, 4, 5, 6, 7, 8, 9})).isEqualTo(2);
        assertThat(ArrayUtils.findDuplicate(new int[]{1, 2, 3, 3, 4, 5, 6, 7, 8, 9})).isEqualTo(3);
        assertThat(ArrayUtils.findDuplicate(new int[]{1, 2, 3, 4, 4, 5, 6, 7, 8, 9})).isEqualTo(4);
        assertThat(ArrayUtils.findDuplicate(new int[]{1, 2, 3, 4, 5, 5, 6, 7, 8, 9})).isEqualTo(5);
        assertThat(ArrayUtils.findDuplicate(new int[]{1, 2, 3, 4, 5, 6, 6, 7, 8, 9})).isEqualTo(6);
        assertThat(ArrayUtils.findDuplicate(new int[]{1, 2, 3, 4, 5, 6, 7, 7, 8, 9})).isEqualTo(7);
        assertThat(ArrayUtils.findDuplicate(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 8, 9})).isEqualTo(8);
        assertThat(ArrayUtils.findDuplicate(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 9})).isEqualTo(9);
        assertThat(ArrayUtils.findDuplicate(new int[]{1, 2, 1, 3, 4, 5, 6, 7, 8})).isOne();
        assertThat(ArrayUtils.findDuplicate(new int[]{1, 2, 3, 1, 4, 5, 6, 7, 8})).isOne();
        assertThat(ArrayUtils.findDuplicate(new int[]{1, 2, 3, 4, 1, 5, 6, 7, 8})).isOne();
        assertThat(ArrayUtils.findDuplicate(new int[]{1, 2, 3, 4, 5, 1, 6, 7, 8})).isOne();
        assertThat(ArrayUtils.findDuplicate(new int[]{1, 2, 3, 4, 5, 6, 1, 7, 8})).isOne();
        assertThat(ArrayUtils.findDuplicate(new int[]{1, 2, 3, 4, 5, 6, 7, 1, 8})).isOne();
        assertThat(ArrayUtils.findDuplicate(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 1})).isOne();
    }

    @Test
    void shouldFindTwoMatchingLengthsTest() {
        assertThat(ArrayUtils.canTwoLengthsFillMaxLength(new int[]{1, 1}, 2)).isTrue();
        assertThat(ArrayUtils.canTwoLengthsFillMaxLength(new int[]{1, 1, 2}, 3)).isTrue();
        assertThat(ArrayUtils.canTwoLengthsFillMaxLength(new int[]{1, 1}, 3)).isFalse();
        assertThat(ArrayUtils.canTwoLengthsFillMaxLength(new int[]{2, 3}, 2)).isFalse();
    }

    @Test
    void shouldFindUniqueId() {
        assertThat(ArrayUtils.findUniqueId(new int[]{1, 2, 2})).isEqualTo(1);
        assertThat(ArrayUtils.findUniqueId(new int[]{1, 2, 1})).isEqualTo(2);
        assertThat(ArrayUtils.findUniqueId(new int[]{1, 5, 8, 2, 4, 9, 9, 8, 4, 1, 2})).isEqualTo(5);
    }

    @Test
    void shouldNotShuffleSmallArray() {
        int[] array = new int[]{1};
        ArrayUtils.shuffle(array);
        assertThat(array).hasSize(1);

        Integer[] what = Arrays.stream(array).boxed().toArray(Integer[]::new);
        assertThat(what).containsExactlyInAnyOrder(1);
    }

    @Test
    void shouldShuffle() {
        int[] array = new int[]{1, 2, 3, 4, 5};
        ArrayUtils.shuffle(array);
        assertThat(array).hasSize(5);

        Integer[] what = Arrays.stream(array).boxed().toArray(Integer[]::new);
        assertThat(what).containsExactlyInAnyOrder(1, 2, 3, 4, 5);
    }
}
