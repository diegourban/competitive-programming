package urban.codewars.kyu6;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SumConsecutivesTest {

    @Test
    public void shouldCreateInstance() {
        SumConsecutives instance = new SumConsecutives();
        assertNotNull(instance);
    }

    @Test
    public void deveSomarDoisConsecutivos() {
        List<Integer> i = Arrays.asList(1, 1);
        List<Integer> o = Arrays.asList(2);
        assertEquals(o, SumConsecutives.sumConsecutives(i));
    }

    @Test
    public void deveSomarTresConsecutivos() {
        List<Integer> i = Arrays.asList(1, 1, 1);
        List<Integer> o = Arrays.asList(3);
        assertEquals(o, SumConsecutives.sumConsecutives(i));
    }

    @Test
    public void deveSomarTresNaoConsecutivos() {
        List<Integer> i = Arrays.asList(2, 1, 2);
        List<Integer> o = Arrays.asList(2, 1, 2);
        assertEquals(o, SumConsecutives.sumConsecutives(i));
    }

    @Test
    public void deveSomarConsecutivosSomentePositivo() {
        List<Integer> i = Arrays.asList(1, 4, 4, 4, 0, 4, 3, 3, 1);
        List<Integer> o = Arrays.asList(1, 12, 0, 4, 6, 1);
        assertEquals(o, SumConsecutives.sumConsecutives(i));
    }

    @Test
    public void deveSomarConsecutivosComNegativo() {
        List<Integer> i = Arrays.asList(-5, -5, 7, 7, 12, 0);
        List<Integer> o = Arrays.asList(-10, 14, 12, 0);
        assertEquals(o, SumConsecutives.sumConsecutives(i));
    }

}
