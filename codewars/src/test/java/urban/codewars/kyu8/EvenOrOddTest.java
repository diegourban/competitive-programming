package urban.codewars.kyu8;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EvenOrOddTest {

    @Test
    public void shouldCreateInstance() {
        EvenOrOdd instance = new EvenOrOdd();
        Assert.assertNotNull(instance);
    }

    @Test
    public void deveRetornarEven() {
        assertEquals("Even", EvenOrOdd.evenOrOdd(2));
    }

    @Test
    public void deveRetornarOdd() {
        assertEquals("Odd", EvenOrOdd.evenOrOdd(1));
    }

}
