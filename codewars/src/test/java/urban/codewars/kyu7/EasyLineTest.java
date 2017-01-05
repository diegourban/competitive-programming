package urban.codewars.kyu7;

import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.Test;

public class EasyLineTest {

    @Test
    public void shouldCreateInstance() {
        assertNotNull(new EasyLine());
    }

    @Test
    public void deveCalcularLinha0() {
        assertEquals(new BigInteger("1"), EasyLine.easyLine(0));
    }

    @Test
    public void deveCalcularLinha1() {
        assertEquals(new BigInteger("2"), EasyLine.easyLine(1));
    }

    @Test
    public void deveCalcularLinha2() {
        assertEquals(new BigInteger("6"), EasyLine.easyLine(2));
    }

    @Test
    public void deveCalcularLinha3() {
        assertEquals(new BigInteger("20"), EasyLine.easyLine(3));
    }

    @Test
    public void deveCalcularLinha4() {
        assertEquals(new BigInteger("70"), EasyLine.easyLine(4));
    }

    @Test
    public void deveCalcularLinha5() {
        assertEquals(new BigInteger("252"), EasyLine.easyLine(5));
    }

    @Test
    public void deveCalcularLinha6() {
        assertEquals(new BigInteger("924"), EasyLine.easyLine(6));
    }

    @Test
    public void deveCalcularLinha7() {
        assertEquals(new BigInteger("3432"), EasyLine.easyLine(7));
    }

    @Test
    public void deveCalcularLinha13() {
        assertEquals(new BigInteger("10400600"), EasyLine.easyLine(13));
    }

    @Test
    public void deveCalcularLinha17() {
        assertEquals(new BigInteger("2333606220"), EasyLine.easyLine(17));
    }

    @Test
    public void deveCalcularLinha19() {
        assertEquals(new BigInteger("35345263800"), EasyLine.easyLine(19));
    }

    @Test
    public void deveCalcularLinha50() {
        assertEquals(new BigInteger("100891344545564193334812497256"), EasyLine.easyLine(50));
    }

}
