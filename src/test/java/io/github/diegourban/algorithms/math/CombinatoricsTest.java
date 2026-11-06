package io.github.diegourban.algorithms.math;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigInteger;
import org.junit.jupiter.api.Test;

class CombinatoricsTest {

    @Test
    void shouldCalculateBinomialCoefficient() {
        // invalid inputs
        assertThat(Combinatorics.binomialCoefficient(0, -1)).isEqualTo(new BigInteger("0"));
        assertThat(Combinatorics.binomialCoefficient(0, 1)).isEqualTo(new BigInteger("0"));

        // margin values
        assertThat(Combinatorics.binomialCoefficient(0, 0)).isEqualTo(new BigInteger("1"));
        assertThat(Combinatorics.binomialCoefficient(1, 0)).isEqualTo(new BigInteger("1"));
        assertThat(Combinatorics.binomialCoefficient(1, 1)).isEqualTo(new BigInteger("1"));
        assertThat(Combinatorics.binomialCoefficient(20, 0)).isEqualTo(new BigInteger("1"));
        assertThat(Combinatorics.binomialCoefficient(1, 1)).isEqualTo(new BigInteger("1"));
        assertThat(Combinatorics.binomialCoefficient(35, 35)).isEqualTo(new BigInteger("1"));

        // border values
        assertThat(Combinatorics.binomialCoefficient(2, 1)).isEqualTo(new BigInteger("2"));
        assertThat(Combinatorics.binomialCoefficient(46, 1)).isEqualTo(new BigInteger("46"));
        assertThat(Combinatorics.binomialCoefficient(8, 7)).isEqualTo(new BigInteger("8"));

        // other values
        assertThat(Combinatorics.binomialCoefficient(6, 3)).isEqualTo(new BigInteger("20"));
        assertThat(Combinatorics.binomialCoefficient(7, 4)).isEqualTo(new BigInteger("35"));
        assertThat(Combinatorics.binomialCoefficient(7, 5)).isEqualTo(new BigInteger("21"));
    }
}
