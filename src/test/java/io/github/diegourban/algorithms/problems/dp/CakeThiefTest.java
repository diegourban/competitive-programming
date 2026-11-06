package io.github.diegourban.algorithms.problems.dp;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

/**
 * The Cake Thief — Interview Cake.
 * <p>
 * https://www.interviewcake.com/question/java/cake-thief
 * <p>
 * Unbounded knapsack, bottom-up: compute the max value at every capacity from 0 to {@code capacity}, each one
 * reusing the best value at {@code capacity - box.weight}. A weightless box with value means infinite value.
 * O(n * k) time, O(k) space, where n is the number of boxes and k the capacity.
 */
class CakeThiefTest {

    record Box(int weight, int value) {
    }

    static class InfinityException extends RuntimeException {
        InfinityException() {
            super("Max value is infinity!");
        }
    }

    static long solve(Box[] boxes, int capacity) {
        var maxValuesAtCapacities = new long[capacity + 1];
        for (var currentCapacity = 0; currentCapacity <= capacity; currentCapacity++) {
            var currentMaxValue = 0L;
            for (var box : boxes) {
                if (box.weight() == 0 && box.value() != 0) {
                    throw new InfinityException();
                }
                if (box.weight() <= currentCapacity) {
                    var maxValueUsingBox = box.value() + maxValuesAtCapacities[currentCapacity - box.weight()];
                    currentMaxValue = Math.max(maxValueUsingBox, currentMaxValue);
                }
            }
            maxValuesAtCapacities[currentCapacity] = currentMaxValue;
        }
        return maxValuesAtCapacities[capacity];
    }

    @Test
    void takesAsManyOfTheBestBoxesAsFit() {
        var boxes = new Box[]{new Box(1, 3), new Box(2, 2), new Box(4, 5)};

        assertThat(solve(boxes, 15)).isEqualTo(45L);
    }

    @Test
    void weightlessValuableBoxIsInfinite() {
        var boxes = new Box[]{new Box(0, 1), new Box(2, 2)};

        assertThatExceptionOfType(InfinityException.class).isThrownBy(() -> solve(boxes, 5));
    }
}
