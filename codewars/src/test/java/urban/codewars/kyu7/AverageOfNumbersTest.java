package urban.codewars.kyu7;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class AverageOfNumbersTest {

    @Test
    public void shouldCreateInstance() {
        Assert.assertNotNull(new AverageOfNumbers());
    }

    @Test
    public void deveRetornarVazioQuandoNull() {
        assertArrayEquals(new double[]{}, AverageOfNumbers.averages(null), 0.1);
    }

    @Test
    public void deveRetornarVazioQuandoVazio() {
        assertArrayEquals(new double[]{}, AverageOfNumbers.averages(new int[]{}), 0.1);
    }

    @Test
    public void deveRetornarVazioQuandoSomente1Elemento() {
        assertArrayEquals(new double[]{}, AverageOfNumbers.averages(new int[]{1}), 0.1);
    }

    @Test
    public void deveCalcularDoisElementos() {
        assertArrayEquals(new double[]{2}, AverageOfNumbers.averages(new int[]{2, 2}), .1);
        assertArrayEquals(new double[]{0}, AverageOfNumbers.averages(new int[]{2, -2}), .1);
    }

    @Test
    public void deveCalcularTestesBasicos() {
        assertArrayEquals(new double[]{2, 2, 2, 2}, AverageOfNumbers.averages(new int[]{2, 2, 2, 2, 2}), .1);

        assertArrayEquals(new double[]{0, 0, 0, 0}, AverageOfNumbers.averages(new int[]{2, -2, 2, -2, 2}), .1);

        assertArrayEquals(new double[]{2, 4, 3, -4.5}, AverageOfNumbers.averages(new int[]{1, 3, 5, 1, -10}), .1);
    }

}
