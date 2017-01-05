package urban.codewars.kyu7;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class RowSumOddNumbersTest {

    @Test
    public void deveInstanciar() {
        RowSumOddNumbers instance = new RowSumOddNumbers();
        assertNotNull(instance);
    }

    @Test
    public void deveCalcularIndice1() {
        assertEquals(1, RowSumOddNumbers.rowSumOddNumbers(1));
    }

    @Test
    public void deveCalcularIndice2() {
        assertEquals(8, RowSumOddNumbers.rowSumOddNumbers(2));
    }

    @Test
    public void deveCalcularIndice3() {
        assertEquals(27, RowSumOddNumbers.rowSumOddNumbers(3));
    }

    @Test
    public void deveCalcularIndice4() {
        assertEquals(64, RowSumOddNumbers.rowSumOddNumbers(4));
    }

    @Test
    public void deveCalcularIndice5() {
        assertEquals(125, RowSumOddNumbers.rowSumOddNumbers(5));
    }

    @Test
    public void deveCalcularIndice42() {
        assertEquals(74088, RowSumOddNumbers.rowSumOddNumbers(42));
    }
}
