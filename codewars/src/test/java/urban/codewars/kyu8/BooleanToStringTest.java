package urban.codewars.kyu8;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class BooleanToStringTest {

    @Test
    public void deveInstanciar() {
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
