package urban.codewars.kyu8;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class GirlAgeTest {

    @Test
    public void shouldCreateInstance() {
        GirlAge instance = new GirlAge();
        Assert.assertNotNull(instance);
    }

    @Test
    public void deveRetornar9Anos() {
        assertEquals(9, GirlAge.howOld("9 years Old"));
    }

    @Test
    public void deveRetornar1Ano() {
        assertEquals(1, GirlAge.howOld("1 year Old"));
    }

}
