package io.github.diegourban.algorithms.math;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashSet;
import java.util.List;
import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.constraints.IntRange;
import net.jqwik.api.constraints.LongRange;
import net.jqwik.api.constraints.Size;

class NumberTheoryPropertyTest {

    @Property
    void bothGcdStrategiesAgree(@ForAll @LongRange(min = 0) final long a, @ForAll @LongRange(min = 0) final long b) {
        assertThat(NumberTheory.gcdLoop(a, b)).isEqualTo(NumberTheory.gcdRecursive(a, b));
    }

    @Property
    void gcdDividesBothNumbers(@ForAll @LongRange(min = 1) final long a, @ForAll @LongRange(min = 1) final long b) {
        final var gcd = NumberTheory.gcdLoop(a, b);

        assertThat(a % gcd).isZero();
        assertThat(b % gcd).isZero();
    }

    @Property
    void lcmTimesGcdIsTheProduct(
            @ForAll @LongRange(min = 1, max = 1_000_000) final long a,
            @ForAll @LongRange(min = 1, max = 1_000_000) final long b) {
        assertThat(NumberTheory.lcm(a, b) * NumberTheory.gcdLoop(a, b)).isEqualTo(a * b);
    }

    @Property
    void lcmOfAListIsAMultipleOfEveryElement(
            @ForAll @Size(min = 1, max = 6) final List<@LongRange(min = 1, max = 1_000) Long> numbers) {
        final var lcm =
                NumberTheory.lcm(numbers.stream().mapToLong(Long::longValue).toArray());

        assertThat(numbers).allSatisfy(n -> assertThat(lcm % n).isZero());
    }

    @Property
    void isPrimeAgreesWithTrialDivision(@ForAll @IntRange(min = -10, max = 200_000) final int n) {
        assertThat(NumberTheory.isPrime(n)).isEqualTo(isPrimeByTrialDivision(n));
    }

    @Property
    void primeFactorsMultiplyBackToTheNumber(@ForAll @IntRange(min = 2, max = 10_000_000) final int n) {
        final var factors = NumberTheory.primeFactorsList(n);

        assertThat(factors.stream().mapToLong(Integer::longValue).reduce(1, (x, y) -> x * y))
                .isEqualTo(n);
        assertThat(factors)
                .allSatisfy(f -> assertThat(isPrimeByTrialDivision(f)).isTrue());
        assertThat(factors).isSorted();
    }

    @Property
    void primeFactorsSetHoldsTheDistinctFactors(@ForAll @IntRange(min = 2, max = 10_000_000) final int n) {
        assertThat(NumberTheory.primeFactorsSet(n)).isEqualTo(new HashSet<>(NumberTheory.primeFactorsList(n)));
    }

    private static boolean isPrimeByTrialDivision(final int n) {
        if (n < 2) {
            return false;
        }
        for (var d = 2; (long) d * d <= n; d++) {
            if (n % d == 0) {
                return false;
            }
        }
        return true;
    }
}
