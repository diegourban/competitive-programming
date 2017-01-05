package urban.codewars.kyu5;

import static org.junit.Assert.*;

import org.junit.Test;

public class LargestDifferenceTest {

    @Test
    public void deveInstanciar() {
        assertNotNull(new LargestDifference());
    }

    @Test
    public void deveEncontrarDiferencaZero() {
        assertEquals(0, LargestDifference.largestDifference(new int[]{0}));
        assertEquals(0, LargestDifference.largestDifference(new int[]{2, 1}));
        assertEquals(0, LargestDifference.largestDifference(new int[]{3, 2, 1}));
    }

    @Test
    public void deveEncontrarDiferencaUm() {
        assertEquals(1, LargestDifference.largestDifference(new int[]{1, 1}));
        assertEquals(1, LargestDifference.largestDifference(new int[]{1, 2}));
    }

    @Test
    public void deveEncontrarDiferencaDois() {
        assertEquals(2, LargestDifference.largestDifference(new int[]{1, 1, 3}));
        assertEquals(2, LargestDifference.largestDifference(new int[]{1, 1, 1}));
    }

    @Test
    public void deveEncontrarDiferencaTesteSimples() {
        assertEquals(4, LargestDifference.largestDifference(new int[]{9, 4, 1, 10, 3, 4, 0, -1, -2}));
    }

}
