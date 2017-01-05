package urban.codewars.kyu8;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class CelsiusConverterTest {

    @Test
    public void shouldCreateInstance() {
        CelsiusConverter instance = new CelsiusConverter();
        Assert.assertNotNull(instance);
    }

    private String solution(int temperture) {
        int c = (int) (temperture - 32 + (5 / 9.0));
        return c + (c > 0 ? " is freezing temperature" : " is above freezing temperature");
    }

    @Test
    public void test1() {
        assertEquals(solution(56), CelsiusConverter.weatherInfo(56));
    }

    @Test
    public void test2() {
        assertEquals(solution(23), CelsiusConverter.weatherInfo(23));
    }

    @Test
    public void test3() {
        assertEquals(solution(33), CelsiusConverter.weatherInfo(33));
    }

    @Test
    public void test4() {
        assertEquals(solution(5), CelsiusConverter.weatherInfo(5));
    }

}
