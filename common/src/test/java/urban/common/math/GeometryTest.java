package urban.common.math;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeometryTest {

    @Test
    public void shouldCreateInstance() {
        assertNotNull(new Geometry());
    }

    @Test
    public void shouldCalculateDistance() {
        assertEquals(5.0, Geometry.distance(-2, 1, 1, 5), 0.1);
    }
}
