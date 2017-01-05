package urban.codewars.kyu8;

import org.junit.Assert;
import org.junit.Test;

public class UnderPressureTest {

    @Test
    public void shouldCreateInstance() {
        UnderPressure instance = new UnderPressure();
        Assert.assertNotNull(instance);
    }

    @Test
    public final void deveDobrar2() {
        Assert.assertEquals(4, UnderPressure.doubleInteger(2));
    }

    @Test
    public final void deveDobrar0() {
        Assert.assertEquals(0, UnderPressure.doubleInteger(0));
    }

    @Test
    public final void deveDobrar1() {
        Assert.assertEquals(2, UnderPressure.doubleInteger(1));
    }

}
