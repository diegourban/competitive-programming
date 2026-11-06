package io.github.diegourban.algorithms.problems.math;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * Rectangular Love — Interview Cake.
 * <p>
 * https://www.interviewcake.com/question/java/rectangular-love
 * <p>
 * Overlap each axis independently: the overlap starts at the highest start point and ends at the lowest end
 * point; if either axis has no overlap, the rectangles don't intersect. O(1) time and space.
 */
class RectangularLoveTest {

    /** {@code (leftX, bottomY)} is the bottom-left corner. */
    record Rectangle(int leftX, int bottomY, int width, int height) {}

    private record RangeOverlap(int startPoint, int length) {}

    private static final Rectangle NO_OVERLAP = new Rectangle(0, 0, 0, 0);

    static Rectangle solve(final Rectangle rect1, final Rectangle rect2) {
        final var xOverlap = findRangeOverlap(rect1.leftX(), rect1.width(), rect2.leftX(), rect2.width());
        final var yOverlap = findRangeOverlap(rect1.bottomY(), rect1.height(), rect2.bottomY(), rect2.height());
        if (xOverlap.length() == 0 || yOverlap.length() == 0) {
            return NO_OVERLAP;
        }
        return new Rectangle(xOverlap.startPoint(), yOverlap.startPoint(), xOverlap.length(), yOverlap.length());
    }

    private static RangeOverlap findRangeOverlap(
            final int point1, final int length1, final int point2, final int length2) {
        final var highestStartPoint = Math.max(point1, point2);
        final var lowestEndPoint = Math.min(point1 + length1, point2 + length2);
        if (highestStartPoint >= lowestEndPoint) {
            return new RangeOverlap(0, 0);
        }
        return new RangeOverlap(highestStartPoint, lowestEndPoint - highestStartPoint);
    }

    @Test
    void partialOverlap() {
        assertThat(solve(new Rectangle(5, 5, 10, 10), new Rectangle(7, 7, 10, 10)))
                .isEqualTo(new Rectangle(7, 7, 8, 8));
    }

    @Test
    void containedRectangleIsTheOverlap() {
        assertThat(solve(new Rectangle(1, 1, 10, 10), new Rectangle(2, 2, 3, 3)))
                .isEqualTo(new Rectangle(2, 2, 3, 3));
    }

    @Test
    void disjointRectanglesDoNotOverlap() {
        assertThat(solve(new Rectangle(1, 1, 3, 3), new Rectangle(5, 5, 3, 3))).isEqualTo(NO_OVERLAP);
    }

    @Test
    void touchingCornersDoNotOverlap() {
        assertThat(solve(new Rectangle(1, 1, 1, 1), new Rectangle(2, 2, 1, 1))).isEqualTo(NO_OVERLAP);
    }
}
