package io.github.diegourban.algorithms.math;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;

class AlgebraTest {

    @Test
    void shouldCreateInstance() {
        assertThat(new Algebra()).isNotNull();
    }

    @Test
    void shouldFindLeastCommonMultiplesOfTwoNumbers() {
        assertThat(Algebra.lcm(1, 2)).isEqualTo(2);
        assertThat(Algebra.lcm(2, 3)).isEqualTo(6);
        assertThat(Algebra.lcm(4, 2)).isEqualTo(4);
        assertThat(Algebra.lcm(2, 4)).isEqualTo(4);
        assertThat(Algebra.lcm(2, 5)).isEqualTo(10);
        assertThat(Algebra.lcm(7, 11)).isEqualTo(77);
        assertThat(Algebra.lcm(10, 100)).isEqualTo(100);
        assertThat(Algebra.lcm(13, 67)).isEqualTo(871);
    }

    @Test
    void shouldFindLeastCommonMultiplesOfList() {
        assertThat(Algebra.lcm(new long[]{1, 2, 3})).isEqualTo(6);
        assertThat(Algebra.lcm(new long[]{2, 4, 6})).isEqualTo(12);
        assertThat(Algebra.lcm(new long[]{7, 11, 13})).isEqualTo(1001);
    }

    @Test
    void shouldCalculateGreatestCommonDivisorOfTwoNumbersRecursively() {
        assertThat(Algebra.gcdRecursive(2, 3)).isOne();
        assertThat(Algebra.gcdRecursive(2, 2)).isEqualTo(2);
        assertThat(Algebra.gcdRecursive(2, 5)).isOne();
        assertThat(Algebra.gcdRecursive(7, 11)).isOne();
        assertThat(Algebra.gcdRecursive(412, 124)).isEqualTo(4);
    }

    @Test
    void shouldCalculateGreatestCommonDivisorOfTwoNumbersWithLoop() {
        assertThat(Algebra.gcdLoop(2, 3)).isOne();
        assertThat(Algebra.gcdLoop(2, 2)).isEqualTo(2);
        assertThat(Algebra.gcdLoop(2, 5)).isOne();
        assertThat(Algebra.gcdLoop(7, 11)).isOne();
        assertThat(Algebra.gcdLoop(412, 124)).isEqualTo(4);
    }

    @Test
    void greatestCommonDivisorShouldProduceSameResultWithLoopAndRecursion() {
        assertThat(Algebra.gcdRecursive(2, 3)).isEqualTo(Algebra.gcdLoop(2, 3));
        assertThat(Algebra.gcdRecursive(5, 2)).isEqualTo(Algebra.gcdLoop(5, 2));
        assertThat(Algebra.gcdLoop(123, 321)).isEqualTo(Algebra.gcdRecursive(123, 321));
        assertThat(Algebra.gcdLoop(60, 12)).isEqualTo(Algebra.gcdRecursive(12, 60));
    }

    @Test
    void shouldHandlePrimeNumbers() {
        assertThat(Algebra.isPrime(2)).isTrue();
        assertThat(Algebra.isPrime(3)).isTrue();
        assertThat(Algebra.isPrime(5)).isTrue();
        assertThat(Algebra.isPrime(7)).isTrue();
        assertThat(Algebra.isPrime(11)).isTrue();
        assertThat(Algebra.isPrime(13)).isTrue();
        assertThat(Algebra.isPrime(17)).isTrue();
        assertThat(Algebra.isPrime(19)).isTrue();
        assertThat(Algebra.isPrime(23)).isTrue();
        assertThat(Algebra.isPrime(29)).isTrue();
        assertThat(Algebra.isPrime(31)).isTrue();
        assertThat(Algebra.isPrime(37)).isTrue();
        assertThat(Algebra.isPrime(41)).isTrue();
        assertThat(Algebra.isPrime(43)).isTrue();
        assertThat(Algebra.isPrime(47)).isTrue();
        assertThat(Algebra.isPrime(7919)).isTrue();
    }

    @Test
    void shouldHandleNotPrimeNumbers() {
        assertThat(Algebra.isPrime(1)).isFalse();
        assertThat(Algebra.isPrime(4)).isFalse();
        assertThat(Algebra.isPrime(6)).isFalse();
        assertThat(Algebra.isPrime(8)).isFalse();
        assertThat(Algebra.isPrime(9)).isFalse();
        assertThat(Algebra.isPrime(10)).isFalse();
        assertThat(Algebra.isPrime(12)).isFalse();
        assertThat(Algebra.isPrime(14)).isFalse();
        assertThat(Algebra.isPrime(15)).isFalse();
        assertThat(Algebra.isPrime(16)).isFalse();
        assertThat(Algebra.isPrime(18)).isFalse();
        assertThat(Algebra.isPrime(20)).isFalse();
        assertThat(Algebra.isPrime(21)).isFalse();
        assertThat(Algebra.isPrime(22)).isFalse();
        assertThat(Algebra.isPrime(24)).isFalse();
        assertThat(Algebra.isPrime(25)).isFalse();
        assertThat(Algebra.isPrime(26)).isFalse();
        assertThat(Algebra.isPrime(27)).isFalse();
        assertThat(Algebra.isPrime(28)).isFalse();
        assertThat(Algebra.isPrime(30)).isFalse();
        assertThat(Algebra.isPrime(32)).isFalse();
        assertThat(Algebra.isPrime(33)).isFalse();
        assertThat(Algebra.isPrime(34)).isFalse();
        assertThat(Algebra.isPrime(35)).isFalse();
        assertThat(Algebra.isPrime(36)).isFalse();
        assertThat(Algebra.isPrime(38)).isFalse();
        assertThat(Algebra.isPrime(39)).isFalse();
        assertThat(Algebra.isPrime(40)).isFalse();
        assertThat(Algebra.isPrime(42)).isFalse();
        assertThat(Algebra.isPrime(44)).isFalse();
        assertThat(Algebra.isPrime(45)).isFalse();
        assertThat(Algebra.isPrime(46)).isFalse();
        assertThat(Algebra.isPrime(48)).isFalse();
        assertThat(Algebra.isPrime(49)).isFalse();
        assertThat(Algebra.isPrime(50)).isFalse();
        assertThat(Algebra.isPrime(7918)).isFalse();
        assertThat(Algebra.isPrime(7920)).isFalse();
    }

    @Test
    void shouldListPrimeFactorsOfEvenNumber() {
        List<Integer> primeFactors = Algebra.primeFactorsList(10);
        assertThat(primeFactors).hasSize(2);
        assertThat(primeFactors.get(0).intValue()).isEqualTo(2);
        assertThat(primeFactors.get(1).intValue()).isEqualTo(5);
    }

    @Test
    void shouldListPrimeFactorsOfOddNumber() {
        List<Integer> primeFactors = Algebra.primeFactorsList(49);
        assertThat(primeFactors).hasSize(2);
        assertThat(primeFactors.get(0).intValue()).isEqualTo(7);
        assertThat(primeFactors.get(1).intValue()).isEqualTo(7);
    }

    @Test
    void shouldListPrimeFactorsOfPrimeNumber() {
        List<Integer> primeFactors = Algebra.primeFactorsList(13);
        assertThat(primeFactors).hasSize(1);
        assertThat(primeFactors.get(0).intValue()).isEqualTo(13);
    }

    @Test
    void shouldCreateSetOfPrimeFactorsOfEvenNumber() {
        Set<Integer> primeFactors = Algebra.primeFactorsSet(12);
        assertThat(primeFactors)
                .hasSize(2)
                .contains(2)
                .contains(3);
    }

    @Test
    void shouldCreateSetOfPrimeFactorsOfOddNumber() {
        Set<Integer> primeFactors = Algebra.primeFactorsSet(49);
        assertThat(primeFactors)
                .hasSize(1)
                .contains(7);
    }

    @Test
    void shouldCreateSetOfPrimeFactorsOfPrimeNumber() {
        Set<Integer> primeFactors = Algebra.primeFactorsSet(7);
        assertThat(primeFactors)
                .hasSize(1)
                .contains(7);
    }

    @Test
    void shouldCalculateFibonacci() {
        assertThat(Algebra.fibonacci(0)).isZero();
        assertThat(Algebra.fibonacci(1)).isOne();
        assertThat(Algebra.fibonacci(2)).isOne();
        assertThat(Algebra.fibonacci(3)).isEqualTo(2);
        assertThat(Algebra.fibonacci(4)).isEqualTo(3);
        assertThat(Algebra.fibonacci(5)).isEqualTo(5);
        assertThat(Algebra.fibonacci(11)).isEqualTo(89);
        assertThat(Algebra.fibonacci(46)).isEqualTo(1836311903);
    }

    @Test
    void shouldCalculateFibonacciWithSimpleBinetFormula() {
        assertThat(Algebra.fibonacciSimpleBinetFormula(0)).isCloseTo(0, within(0.1));
        assertThat(Algebra.fibonacciSimpleBinetFormula(1)).isCloseTo(1, within(0.1));
        assertThat(Algebra.fibonacciSimpleBinetFormula(2)).isCloseTo(1, within(0.1));
        assertThat(Algebra.fibonacciSimpleBinetFormula(3)).isCloseTo(2, within(0.1));
        assertThat(Algebra.fibonacciSimpleBinetFormula(4)).isCloseTo(3, within(0.1));
        assertThat(Algebra.fibonacciSimpleBinetFormula(5)).isCloseTo(5, within(0.1));
        assertThat(Algebra.fibonacciSimpleBinetFormula(11)).isCloseTo(89, within(0.1));
        assertThat(Algebra.fibonacciSimpleBinetFormula(50)).isCloseTo(12586269025d, within(0.1));
        assertThat(Algebra.fibonacciSimpleBinetFormula(67)).isCloseTo(44945570212853d, within(0.1));
    }

    @Test
    void shouldCalculateFibonacciWithBinetFormula() {
        assertThat(Algebra.fibonacciBinetFormula(0)).isEqualTo(new BigInteger("0"));
        assertThat(Algebra.fibonacciBinetFormula(1)).isEqualTo(new BigInteger("1"));
        assertThat(Algebra.fibonacciBinetFormula(2)).isEqualTo(new BigInteger("1"));
        assertThat(Algebra.fibonacciBinetFormula(3)).isEqualTo(new BigInteger("2"));
        assertThat(Algebra.fibonacciBinetFormula(4)).isEqualTo(new BigInteger("3"));
        assertThat(Algebra.fibonacciBinetFormula(5)).isEqualTo(new BigInteger("5"));
        assertThat(Algebra.fibonacciBinetFormula(11)).isEqualTo(new BigInteger("89"));
        assertThat(Algebra.fibonacciBinetFormula(50)).isEqualTo(new BigInteger("12586269025"));
        assertThat(Algebra.fibonacciBinetFormula(71)).isEqualTo(new BigInteger("308061521170129"));
    }

}