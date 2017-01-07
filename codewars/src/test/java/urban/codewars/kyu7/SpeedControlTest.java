package urban.codewars.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SpeedControlTest {

    @Test
    public void mustInstantiate() {
        assertNotNull(new SpeedControl());
    }

    @Test
    public void mustNotCalculateAverageIfHasNotMoved() {
        assertEquals(0, SpeedControl.gps(15, new double[]{0.0}));
    }

    @Test
    public void mustCalculateAverageOneSection() {
        assertEquals(45, SpeedControl.gps(15, new double[]{0.0, 0.19}), 0.0);
    }

    @Test
    public void mustCalculateAverage1() {
        assertEquals(74, SpeedControl.gps(15, new double[]{0.0, 0.19, 0.5, 0.75, 1.0, 1.25, 1.5, 1.75, 2.0, 2.25}));
    }

    @Test
    public void mustCalculateAverage2() {
        assertEquals(41, SpeedControl.gps(20, new double[]{0.0, 0.23, 0.46, 0.69, 0.92, 1.15, 1.38, 1.61}));
    }

}
