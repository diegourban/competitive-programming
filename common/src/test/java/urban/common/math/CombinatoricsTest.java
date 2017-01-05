package urban.common.math;


import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CombinatoricsTest {

    @Test
    public void shouldCreateInstance() {
        assertNotNull(new Combinatorics());
    }

    @Test
    public void shouldCalculateBinomialCoefficient() {
        // invalid inputs
        assertEquals(new BigInteger("0"), Combinatorics.binomialCoefficient(0, -1));
        assertEquals(new BigInteger("0"), Combinatorics.binomialCoefficient(0, 1));

        // margin values
        assertEquals(new BigInteger("1"), Combinatorics.binomialCoefficient(0, 0));
        assertEquals(new BigInteger("1"), Combinatorics.binomialCoefficient(1, 0));
        assertEquals(new BigInteger("1"), Combinatorics.binomialCoefficient(20, 0));
        assertEquals(new BigInteger("1"), Combinatorics.binomialCoefficient(1, 1));
        assertEquals(new BigInteger("1"), Combinatorics.binomialCoefficient(35, 35));

        // border values
        assertEquals(new BigInteger("2"), Combinatorics.binomialCoefficient(2, 1));
        assertEquals(new BigInteger("46"), Combinatorics.binomialCoefficient(46, 1));
        assertEquals(new BigInteger("8"), Combinatorics.binomialCoefficient(8, 7));

        // other values
        assertEquals(new BigInteger("20"), Combinatorics.binomialCoefficient(6, 3));
        assertEquals(new BigInteger("35"), Combinatorics.binomialCoefficient(7, 4));
        assertEquals(new BigInteger("21"), Combinatorics.binomialCoefficient(7, 5));
    }

}
