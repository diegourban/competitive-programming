package urban.codewars.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SwapperTest {

    @Test
    public void shouldCreateInstance() {
        Swapper instance = new Swapper(null);
        assertNotNull(instance);
    }

    @Test
    public void deveTrocar() {
        Integer[] args = new Integer[]{1, 2};

        Swapper r = new Swapper(args);
        r.swapValues();
        assertEquals("Failed swapping numbers", 2, r.arguments[0]);
        assertEquals("Failed swapping numbers", 1, r.arguments[1]);
    }

}
