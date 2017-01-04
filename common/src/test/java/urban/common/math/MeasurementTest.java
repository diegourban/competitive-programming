package urban.common.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MeasurementTest {

    @Test
    public void shouldCreateInstance() {
        assertNotNull(new Measurement());
    }

    @Test
    public void shouldConvertMilesToKilometers() {
        assertEquals(1.609344, Measurement.milesToKilometers(1), 0.1);
        assertEquals(3.218688, Measurement.milesToKilometers(2), 0.1);
    }

    @Test
    public void shouldConvertKilometersToMiles() {
        assertEquals(0.621371, Measurement.kilometersToMiles(1), 0.1);
        assertEquals(1.242742, Measurement.kilometersToMiles(2), 0.1);
    }
}
