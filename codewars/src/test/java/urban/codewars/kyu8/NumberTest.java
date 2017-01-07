package urban.codewars.kyu8;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberTest {

    private Number num;

    @Before
    public void setUp() throws Exception {
        num = new Number();
    }

    @After
    public void setDown() throws Exception {
        num = null;
    }

    @Test
    public void shouldCreateInstance() {
        Assert.assertNotNull(num);
    }

    @Test
    public void test() {
        assertEquals(true, num.isEven(0));
        assertEquals(false, num.isEven(0.5));
        assertEquals(false, num.isEven(1));
        assertEquals(true, num.isEven(2));
        assertEquals(true, num.isEven(-4));
    }

}
