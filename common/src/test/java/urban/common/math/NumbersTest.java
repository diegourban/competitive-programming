package urban.common.math;


import org.junit.Test;

import static org.junit.Assert.*;

public class NumbersTest {

    @Test
    public void shouldCreateInstance() {
        assertNotNull(new Numbers());
    }

    @Test
    public void shouldHandleContainsDigit() {
        assertTrue(Numbers.containsDigit(124, 4));
        assertFalse(Numbers.containsDigit(124, 3));
        assertTrue(Numbers.containsDigit(-417, 7));
    }

    @Test
    public void shouldHandleContainsRepatingDigit() {
        assertTrue(Numbers.containsRepeatingDigits(12334, 2));
        assertFalse(Numbers.containsRepeatingDigits(11223344, 3));
    }

    @Test
    public void shouldConvertNumberToArray() {
        assertArrayEquals(new int[]{3, 2, 1}, Numbers.toArray(123));
        assertArrayEquals(new int[]{1, 2, 3}, Numbers.toArray(321));
    }
}
