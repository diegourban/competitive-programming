package urban.codewars.kyu7;

import static org.junit.Assert.*;

import org.junit.Test;

public class SequenceSumTest {

    @Test
    public void deveInstanciar() {
        SequenceSum instance = new SequenceSum();
        assertNotNull(instance);
    }

    @Test
    public void deveMostrarSequenciaZero() {
        assertEquals("0=0", SequenceSum.showSequence(0));
    }

    @Test
    public void deveMostrarSequenciaNumeroNegativo() {
        assertEquals("-15<0", SequenceSum.showSequence(-15));
    }

    @Test
    public void deveMostrarSequencia1() {
        assertEquals("0+1 = 1", SequenceSum.showSequence(1));
    }

    @Test
    public void deveMostrarSequencia2() {
        assertEquals("0+1+2 = 3", SequenceSum.showSequence(2));
    }

    @Test
    public void deveMostrarSequencia3() {
        assertEquals("0+1+2+3 = 6", SequenceSum.showSequence(3));
    }

    @Test
    public void deveMostrarSequencia5() {
        assertEquals("0+1+2+3+4+5 = 15", SequenceSum.showSequence(5));
    }

    @Test
    public void deveMostrarSequencia10() {
        assertEquals("0+1+2+3+4+5+6+7+8+9+10 = 55", SequenceSum.showSequence(10));
    }

}
