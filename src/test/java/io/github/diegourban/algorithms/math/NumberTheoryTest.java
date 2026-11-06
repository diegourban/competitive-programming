package io.github.diegourban.algorithms.math;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class NumberTheoryTest {

    @Test
    void shouldFindLeastCommonMultiplesOfTwoNumbers() {
        assertThat(NumberTheory.lcm(1, 2)).isEqualTo(2);
        assertThat(NumberTheory.lcm(2, 3)).isEqualTo(6);
        assertThat(NumberTheory.lcm(4, 2)).isEqualTo(4);
        assertThat(NumberTheory.lcm(2, 4)).isEqualTo(4);
        assertThat(NumberTheory.lcm(2, 5)).isEqualTo(10);
        assertThat(NumberTheory.lcm(7, 11)).isEqualTo(77);
        assertThat(NumberTheory.lcm(10, 100)).isEqualTo(100);
        assertThat(NumberTheory.lcm(13, 67)).isEqualTo(871);
    }

    @Test
    void shouldFindLeastCommonMultiplesOfList() {
        assertThat(NumberTheory.lcm(new long[] {1, 2, 3})).isEqualTo(6);
        assertThat(NumberTheory.lcm(new long[] {2, 4, 6})).isEqualTo(12);
        assertThat(NumberTheory.lcm(new long[] {7, 11, 13})).isEqualTo(1001);
    }

    @Test
    void shouldCalculateGreatestCommonDivisorOfTwoNumbersRecursively() {
        assertThat(NumberTheory.gcdRecursive(2, 3)).isOne();
        assertThat(NumberTheory.gcdRecursive(2, 2)).isEqualTo(2);
        assertThat(NumberTheory.gcdRecursive(2, 5)).isOne();
        assertThat(NumberTheory.gcdRecursive(7, 11)).isOne();
        assertThat(NumberTheory.gcdRecursive(412, 124)).isEqualTo(4);
    }

    @Test
    void shouldCalculateGreatestCommonDivisorOfTwoNumbersWithLoop() {
        assertThat(NumberTheory.gcdLoop(2, 3)).isOne();
        assertThat(NumberTheory.gcdLoop(2, 2)).isEqualTo(2);
        assertThat(NumberTheory.gcdLoop(2, 5)).isOne();
        assertThat(NumberTheory.gcdLoop(7, 11)).isOne();
        assertThat(NumberTheory.gcdLoop(412, 124)).isEqualTo(4);
    }

    @Test
    void greatestCommonDivisorShouldProduceSameResultWithLoopAndRecursion() {
        assertThat(NumberTheory.gcdRecursive(2, 3)).isEqualTo(NumberTheory.gcdLoop(2, 3));
        assertThat(NumberTheory.gcdRecursive(5, 2)).isEqualTo(NumberTheory.gcdLoop(5, 2));
        assertThat(NumberTheory.gcdLoop(123, 321)).isEqualTo(NumberTheory.gcdRecursive(123, 321));
        assertThat(NumberTheory.gcdLoop(60, 12)).isEqualTo(NumberTheory.gcdRecursive(12, 60));
    }

    @Test
    void shouldHandlePrimeNumbers() {
        assertThat(NumberTheory.isPrime(2)).isTrue();
        assertThat(NumberTheory.isPrime(3)).isTrue();
        assertThat(NumberTheory.isPrime(5)).isTrue();
        assertThat(NumberTheory.isPrime(7)).isTrue();
        assertThat(NumberTheory.isPrime(11)).isTrue();
        assertThat(NumberTheory.isPrime(13)).isTrue();
        assertThat(NumberTheory.isPrime(17)).isTrue();
        assertThat(NumberTheory.isPrime(19)).isTrue();
        assertThat(NumberTheory.isPrime(23)).isTrue();
        assertThat(NumberTheory.isPrime(29)).isTrue();
        assertThat(NumberTheory.isPrime(31)).isTrue();
        assertThat(NumberTheory.isPrime(37)).isTrue();
        assertThat(NumberTheory.isPrime(41)).isTrue();
        assertThat(NumberTheory.isPrime(43)).isTrue();
        assertThat(NumberTheory.isPrime(47)).isTrue();
        assertThat(NumberTheory.isPrime(7919)).isTrue();
    }

    @Test
    @Timeout(1)
    void shouldHandlePrimalityNearIntegerMaxValue() {
        assertThat(NumberTheory.isPrime(Integer.MAX_VALUE)).isTrue(); // 2^31 - 1 is a Mersenne prime
        assertThat(NumberTheory.isPrime(46337 * 46337)).isFalse(); // square of the largest prime below sqrt(MAX_VALUE)
    }

    @Test
    void shouldHandleNotPrimeNumbers() {
        assertThat(NumberTheory.isPrime(1)).isFalse();
        assertThat(NumberTheory.isPrime(4)).isFalse();
        assertThat(NumberTheory.isPrime(6)).isFalse();
        assertThat(NumberTheory.isPrime(8)).isFalse();
        assertThat(NumberTheory.isPrime(9)).isFalse();
        assertThat(NumberTheory.isPrime(10)).isFalse();
        assertThat(NumberTheory.isPrime(12)).isFalse();
        assertThat(NumberTheory.isPrime(14)).isFalse();
        assertThat(NumberTheory.isPrime(15)).isFalse();
        assertThat(NumberTheory.isPrime(16)).isFalse();
        assertThat(NumberTheory.isPrime(18)).isFalse();
        assertThat(NumberTheory.isPrime(20)).isFalse();
        assertThat(NumberTheory.isPrime(21)).isFalse();
        assertThat(NumberTheory.isPrime(22)).isFalse();
        assertThat(NumberTheory.isPrime(24)).isFalse();
        assertThat(NumberTheory.isPrime(25)).isFalse();
        assertThat(NumberTheory.isPrime(26)).isFalse();
        assertThat(NumberTheory.isPrime(27)).isFalse();
        assertThat(NumberTheory.isPrime(28)).isFalse();
        assertThat(NumberTheory.isPrime(30)).isFalse();
        assertThat(NumberTheory.isPrime(32)).isFalse();
        assertThat(NumberTheory.isPrime(33)).isFalse();
        assertThat(NumberTheory.isPrime(34)).isFalse();
        assertThat(NumberTheory.isPrime(35)).isFalse();
        assertThat(NumberTheory.isPrime(36)).isFalse();
        assertThat(NumberTheory.isPrime(38)).isFalse();
        assertThat(NumberTheory.isPrime(39)).isFalse();
        assertThat(NumberTheory.isPrime(40)).isFalse();
        assertThat(NumberTheory.isPrime(42)).isFalse();
        assertThat(NumberTheory.isPrime(44)).isFalse();
        assertThat(NumberTheory.isPrime(45)).isFalse();
        assertThat(NumberTheory.isPrime(46)).isFalse();
        assertThat(NumberTheory.isPrime(48)).isFalse();
        assertThat(NumberTheory.isPrime(49)).isFalse();
        assertThat(NumberTheory.isPrime(50)).isFalse();
        assertThat(NumberTheory.isPrime(7918)).isFalse();
        assertThat(NumberTheory.isPrime(7920)).isFalse();
    }

    @Test
    void shouldListPrimeFactorsOfEvenNumber() {
        List<Integer> primeFactors = NumberTheory.primeFactorsList(10);
        assertThat(primeFactors).hasSize(2);
        assertThat(primeFactors.get(0).intValue()).isEqualTo(2);
        assertThat(primeFactors.get(1).intValue()).isEqualTo(5);
    }

    @Test
    void shouldListPrimeFactorsOfOddNumber() {
        List<Integer> primeFactors = NumberTheory.primeFactorsList(49);
        assertThat(primeFactors).hasSize(2);
        assertThat(primeFactors.get(0).intValue()).isEqualTo(7);
        assertThat(primeFactors.get(1).intValue()).isEqualTo(7);
    }

    @Test
    void shouldListPrimeFactorsOfPrimeNumber() {
        List<Integer> primeFactors = NumberTheory.primeFactorsList(13);
        assertThat(primeFactors).hasSize(1);
        assertThat(primeFactors.get(0).intValue()).isEqualTo(13);
    }

    @Test
    void shouldCreateSetOfPrimeFactorsOfEvenNumber() {
        Set<Integer> primeFactors = NumberTheory.primeFactorsSet(12);
        assertThat(primeFactors).hasSize(2).contains(2).contains(3);
    }

    @Test
    void shouldCreateSetOfPrimeFactorsOfOddNumber() {
        Set<Integer> primeFactors = NumberTheory.primeFactorsSet(49);
        assertThat(primeFactors).hasSize(1).contains(7);
    }

    @Test
    void shouldCreateSetOfPrimeFactorsOfPrimeNumber() {
        Set<Integer> primeFactors = NumberTheory.primeFactorsSet(7);
        assertThat(primeFactors).hasSize(1).contains(7);
    }
}
