package urban.common.math;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class StatisticsTest {

    @Test
    public void shouldCreateInstance() {
        assertNotNull(new Statistics());
    }

    @Test
    public void shouldCalculateMean() {
        assertEquals(0.0, Statistics.mean(new int[]{}), 0.1);
        assertEquals(1.0, Statistics.mean(new int[]{1}), 0.1);
        assertEquals(0.5, Statistics.mean(new int[]{1, 0}), 0.1);
        assertEquals(2.0, Statistics.mean(new int[]{3, 2, 1}), 0.1);
        assertEquals(5.5, Statistics.mean(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}), 0.1);
        assertEquals(5.0, Statistics.mean(new int[]{2, 2, 3, 4, 14}), 0.1);
    }

    @Test
    public void shouldCalculateMedian() {
        assertEquals(1.0, Statistics.median(new int[]{1}), 0.1);
        assertEquals(0.5, Statistics.median(new int[]{1, 0}), 0.1);
        assertEquals(2.0, Statistics.median(new int[]{3, 2, 1}), 0.1);
        assertEquals(2.0, Statistics.median(new int[]{1, 2, 3}), 0.1);
        assertEquals(2.0, Statistics.median(new int[]{2, 1, 3}), 0.1);
        assertEquals(2.0, Statistics.median(new int[]{3, 1, 2}), 0.1);
        assertEquals(5.5, Statistics.median(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}), 0.1);
        assertEquals(3.0, Statistics.median(new int[]{2, 2, 3, 4, 14}), 0.1);
    }

    @Test
    public void shouldCalculateMode() {
        assertEquals(1, Statistics.mode(new int[]{1}));
        assertEquals(1, Statistics.mode(new int[]{1, 0, 1}));
        assertEquals(4, Statistics.mode(new int[]{1, 2, 2, 3, 3, 3, 4, 4, 5, 4, 4}));
        assertEquals(5, Statistics.mode(new int[]{1, 2, 2, 3, 3, 3, 4, 4, 5, 5, 5, 5, 4, 4, 5}));
        assertEquals(2, Statistics.mode(new int[]{2, 2, 3, 4, 14}));
    }

    @Test
    public void shouldCalculateAverageAbsoluteDeviation() {
        assertEquals(3.6, Statistics.meanAbsoluteDeviation(new int[]{2, 2, 3, 4, 14}), 0.1);
    }
}
