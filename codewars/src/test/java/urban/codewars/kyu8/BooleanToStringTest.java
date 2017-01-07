package urban.codewars.kyu8;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BooleanToStringTest {

    @Test
    public void shouldCreateInstance() {
        BooleanToString instance = new BooleanToString();
        Assert.assertNotNull(instance);
    }

    @Test
    public void deveTestarTrue() {
        assertEquals(BooleanToString.convert(true), "true");
    }

    @Test
    public void deveTestarFalse() {
        assertEquals(BooleanToString.convert(false), "false");
    }

}
