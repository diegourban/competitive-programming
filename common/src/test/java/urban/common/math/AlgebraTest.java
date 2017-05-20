package urban.common.math;

import org.junit.Test;

import java.math.BigInteger;
import java.util.List;
import java.util.Set;

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
    public void shouldFindLeastCommonMultiplesOfList() {
        assertEquals(6, Algebra.lcm(new long[]{1, 2, 3}));
        assertEquals(12, Algebra.lcm(new long[]{2, 4, 6}));
        assertEquals(1001, Algebra.lcm(new long[]{7, 11, 13}));
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
        assertTrue(Algebra.isPrime(5));
        assertTrue(Algebra.isPrime(7));
        assertTrue(Algebra.isPrime(11));
        assertTrue(Algebra.isPrime(13));
        assertTrue(Algebra.isPrime(17));
        assertTrue(Algebra.isPrime(19));
        assertTrue(Algebra.isPrime(23));
        assertTrue(Algebra.isPrime(29));
        assertTrue(Algebra.isPrime(31));
        assertTrue(Algebra.isPrime(37));
        assertTrue(Algebra.isPrime(41));
        assertTrue(Algebra.isPrime(43));
        assertTrue(Algebra.isPrime(47));
        assertTrue(Algebra.isPrime(7919));
    }

    @Test
    public void shouldHandleNotPrimeNumbers() {
        assertFalse(Algebra.isPrime(1));
        assertFalse(Algebra.isPrime(4));
        assertFalse(Algebra.isPrime(6));
        assertFalse(Algebra.isPrime(8));
        assertFalse(Algebra.isPrime(9));
        assertFalse(Algebra.isPrime(10));
        assertFalse(Algebra.isPrime(12));
        assertFalse(Algebra.isPrime(14));
        assertFalse(Algebra.isPrime(15));
        assertFalse(Algebra.isPrime(16));
        assertFalse(Algebra.isPrime(18));
        assertFalse(Algebra.isPrime(20));
        assertFalse(Algebra.isPrime(21));
        assertFalse(Algebra.isPrime(22));
        assertFalse(Algebra.isPrime(24));
        assertFalse(Algebra.isPrime(25));
        assertFalse(Algebra.isPrime(26));
        assertFalse(Algebra.isPrime(27));
        assertFalse(Algebra.isPrime(28));
        assertFalse(Algebra.isPrime(30));
        assertFalse(Algebra.isPrime(32));
        assertFalse(Algebra.isPrime(33));
        assertFalse(Algebra.isPrime(34));
        assertFalse(Algebra.isPrime(35));
        assertFalse(Algebra.isPrime(36));
        assertFalse(Algebra.isPrime(38));
        assertFalse(Algebra.isPrime(39));
        assertFalse(Algebra.isPrime(40));
        assertFalse(Algebra.isPrime(42));
        assertFalse(Algebra.isPrime(44));
        assertFalse(Algebra.isPrime(45));
        assertFalse(Algebra.isPrime(46));
        assertFalse(Algebra.isPrime(48));
        assertFalse(Algebra.isPrime(49));
        assertFalse(Algebra.isPrime(50));
        assertFalse(Algebra.isPrime(7918));
        assertFalse(Algebra.isPrime(7920));
    }

    @Test
    public void shouldListPrimeFactorsOfEvenNumber() {
        List<Integer> primeFactors = Algebra.primeFactorsList(10);
        assertTrue(primeFactors.size() == 2);
        assertEquals(2, primeFactors.get(0).intValue());
        assertEquals(5, primeFactors.get(1).intValue());
    }

    @Test
    public void shouldListPrimeFactorsOfOddNumber() {
        List<Integer> primeFactors = Algebra.primeFactorsList(49);
        assertTrue(primeFactors.size() == 2);
        assertEquals(7, primeFactors.get(0).intValue());
        assertEquals(7, primeFactors.get(1).intValue());
    }

    @Test
    public void shouldListPrimeFactorsOfPrimeNumber() {
        List<Integer> primeFactors = Algebra.primeFactorsList(13);
        assertTrue(primeFactors.size() == 1);
        assertEquals(13, primeFactors.get(0).intValue());
    }

    @Test
    public void shouldCreateSetOfPrimeFactorsOfEvenNumber() {
        Set<Integer> primeFactors = Algebra.primeFactorsSet(12);
        assertTrue(primeFactors.size() == 2);
        assertTrue(primeFactors.contains(2));
        assertTrue(primeFactors.contains(3));
    }

    @Test
    public void shouldCreateSetOfPrimeFactorsOfOddNumber() {
        Set<Integer> primeFactors = Algebra.primeFactorsSet(49);
        assertTrue(primeFactors.size() == 1);
        assertTrue(primeFactors.contains(7));
    }

    @Test
    public void shouldCreateSetOfPrimeFactorsOfPrimeNumber() {
        Set<Integer> primeFactors = Algebra.primeFactorsSet(7);
        assertTrue(primeFactors.size() == 1);
        assertTrue(primeFactors.contains(7));
    }

    @Test
    public void shouldCalculateFibonacci() {
        assertEquals(0, Algebra.fibonacci(0));
        assertEquals(1, Algebra.fibonacci(1));
        assertEquals(1, Algebra.fibonacci(2));
        assertEquals(2, Algebra.fibonacci(3));
        assertEquals(3, Algebra.fibonacci(4));
        assertEquals(5, Algebra.fibonacci(5));
        assertEquals(89, Algebra.fibonacci(11));
        assertEquals(1836311903, Algebra.fibonacci(46));
    }

    @Test
    public void shouldCalculateFibonacciWithSimpleBinetFormula() {
        assertEquals(0, Algebra.fibonacciSimpleBinetFormula(0), 0.1);
        assertEquals(1, Algebra.fibonacciSimpleBinetFormula(1), 0.1);
        assertEquals(1, Algebra.fibonacciSimpleBinetFormula(2), 0.1);
        assertEquals(2, Algebra.fibonacciSimpleBinetFormula(3), 0.1);
        assertEquals(3, Algebra.fibonacciSimpleBinetFormula(4), 0.1);
        assertEquals(5, Algebra.fibonacciSimpleBinetFormula(5), 0.1);
        assertEquals(89, Algebra.fibonacciSimpleBinetFormula(11), 0.1);
        assertEquals(12586269025d, Algebra.fibonacciSimpleBinetFormula(50), 0.1);
        assertEquals(44945570212853d, Algebra.fibonacciSimpleBinetFormula(67), 0.1);
    }

    @Test
    public void shouldCalculateFibonacciWithBinetFormula() {
        assertEquals(new BigInteger("0"), Algebra.fibonacciBinetFormula(0));
        assertEquals(new BigInteger("1"), Algebra.fibonacciBinetFormula(1));
        assertEquals(new BigInteger("1"), Algebra.fibonacciBinetFormula(2));
        assertEquals(new BigInteger("2"), Algebra.fibonacciBinetFormula(3));
        assertEquals(new BigInteger("3"), Algebra.fibonacciBinetFormula(4));
        assertEquals(new BigInteger("5"), Algebra.fibonacciBinetFormula(5));
        assertEquals(new BigInteger("89"), Algebra.fibonacciBinetFormula(11));
        assertEquals(new BigInteger("12586269025"), Algebra.fibonacciBinetFormula(50));
        assertEquals(new BigInteger("308061521170129"), Algebra.fibonacciBinetFormula(71));
    }

}