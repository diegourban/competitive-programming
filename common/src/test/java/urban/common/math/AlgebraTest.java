package urban.common.math;

import org.junit.Test;

import static org.junit.Assert.*;

public class AlgebraTest {

    @Test
    public void shouldCreateInstance() {
        assertNotNull(new Algebra());
    }

    @Test
    public void shouldFindLeastCommonMultiplesOfTwoNumbers() {
        assertEquals(2, Algebra.lcm(1, 2));
        assertEquals(6, Algebra.lcm(2, 3));
        assertEquals(4, Algebra.lcm(4, 2));
        assertEquals(4, Algebra.lcm(2, 4));
        assertEquals(10, Algebra.lcm(2, 5));
        assertEquals(77, Algebra.lcm(7, 11));
        assertEquals(100, Algebra.lcm(10, 100));
        assertEquals(871, Algebra.lcm(13, 67));
    }

    @Test
    public void shouldCalculateGreatestCommonDivisorOfTwoNumbersRecursively() {
        assertEquals(1, Algebra.gcdRecursive(2, 3));
        assertEquals(2, Algebra.gcdRecursive(2, 2));
        assertEquals(1, Algebra.gcdRecursive(2, 5));
        assertEquals(1, Algebra.gcdRecursive(7, 11));
        assertEquals(4, Algebra.gcdRecursive(412, 124));
    }

    @Test
    public void shouldCalculateGreatestCommonDivisorOfTwoNumbersWithLoop() {
        assertEquals(1, Algebra.gcdLoop(2, 3));
        assertEquals(2, Algebra.gcdLoop(2, 2));
        assertEquals(1, Algebra.gcdLoop(2, 5));
        assertEquals(1, Algebra.gcdLoop(7, 11));
        assertEquals(4, Algebra.gcdLoop(412, 124));
    }

    @Test
    public void greatestCommonDivisorShouldProduceSameResultWithLoopAndRecursion() {
        assertEquals(Algebra.gcdLoop(2, 3), Algebra.gcdRecursive(2, 3));
        assertEquals(Algebra.gcdLoop(5, 2), Algebra.gcdRecursive(5, 2));
        assertEquals(Algebra.gcdRecursive(123, 321), Algebra.gcdLoop(123, 321));
        assertEquals(Algebra.gcdRecursive(12, 60), Algebra.gcdLoop(60, 12));
    }

    @Test
    public void shouldHandlePrimeNumbers() {
        assertTrue(Algebra.isPrime(2));
        assertTrue(Algebra.isPrime(3));
        assertTrue(Algebra.isPrime(7));
        assertTrue(Algebra.isPrime(89));
        assertTrue(Algebra.isPrime(787));
        assertTrue(Algebra.isPrime(991));
    }

    @Test
    public void shouldHandleNotPrimeNumbers() {
        assertFalse(Algebra.isPrime(1));
        assertFalse(Algebra.isPrime(4));
        assertFalse(Algebra.isPrime(12));
        assertFalse(Algebra.isPrime(90));
        assertFalse(Algebra.isPrime(786));
        assertFalse(Algebra.isPrime(992));
    }

}