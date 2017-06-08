package urban.common.math;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
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

    @Test
    public void shouldCalculateNumberLength() {
        assertThat(Numbers.length(1), is(1));
        assertThat(Numbers.length(12), is(2));
        assertThat(Numbers.length(123), is(3));
        assertThat(Numbers.length(1234), is(4));
        assertThat(Numbers.length(12345), is(5));
        assertThat(Numbers.length(123456), is(6));
        assertThat(Numbers.length(1234567), is(7));
        assertThat(Numbers.length(12345678), is(8));
        assertThat(Numbers.length(123456789), is(9));
        assertThat(Numbers.length(1234567890), is(10));
    }
}
