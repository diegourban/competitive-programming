package io.github.diegourban.algorithms.problems.greedy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.math.BigDecimal;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Banknotes and Coins — beecrowd (formerly URI Online Judge) 1021.
 * <p>
 * https://judge.beecrowd.com/en/problems/view/1021
 * <p>
 * Greedy change-making in integer cents (no floating-point drift): take as many of each denomination as
 * fit, largest first, which is optimal for this canonical Brazilian Real system. O(denominations).
 */
class BanknotesAndCoinsTest {

    static final List<Integer> BANKNOTE_CENTS = List.of(10000, 5000, 2000, 1000, 500, 200);
    static final List<Integer> COIN_CENTS = List.of(100, 50, 25, 10, 5, 1);

    /** Counts per denomination, aligned with {@link #BANKNOTE_CENTS} and {@link #COIN_CENTS}. */
    record Breakdown(List<Integer> banknotes, List<Integer> coins) {
    }

    static int toCents(String amount) {
        return new BigDecimal(amount).movePointRight(2).intValueExact();
    }

    static Breakdown solve(int cents) {
        var remaining = new int[]{cents};
        var banknotes = BANKNOTE_CENTS.stream().map(value -> take(remaining, value)).toList();
        var coins = COIN_CENTS.stream().map(value -> take(remaining, value)).toList();
        return new Breakdown(banknotes, coins);
    }

    private static int take(int[] remaining, int value) {
        var count = remaining[0] / value;
        remaining[0] %= value;
        return count;
    }

    @ParameterizedTest
    @CsvSource({
            "576.73, 57673",
            "4.00, 400",
            "91.01, 9101",
            "0.01, 1",
            "1000000.00, 100000000",
    })
    void parsesAmountToCentsExactly(String amount, int cents) {
        assertThat(toCents(amount)).isEqualTo(cents);
    }

    @Test
    void judgeSample576() {
        assertThat(solve(toCents("576.73")))
                .isEqualTo(new Breakdown(List.of(5, 1, 1, 0, 1, 0), List.of(1, 1, 0, 2, 0, 3)));
    }

    @Test
    void judgeSample4() {
        assertThat(solve(toCents("4.00")))
                .isEqualTo(new Breakdown(List.of(0, 0, 0, 0, 0, 2), List.of(0, 0, 0, 0, 0, 0)));
    }

    @Test
    void judgeSample91() {
        assertThat(solve(toCents("91.01")))
                .isEqualTo(new Breakdown(List.of(0, 1, 2, 0, 0, 0), List.of(1, 0, 0, 0, 0, 1)));
    }

    @Test
    void oneOfEachDenomination() {
        assertThat(solve(toCents("188.91")))
                .isEqualTo(new Breakdown(List.of(1, 1, 1, 1, 1, 1), List.of(1, 1, 1, 1, 1, 1)));
    }

    @Test
    void oneOfEachCoin() {
        assertThat(solve(toCents("1.91")))
                .isEqualTo(new Breakdown(List.of(0, 0, 0, 0, 0, 0), List.of(1, 1, 1, 1, 1, 1)));
    }

    @Test
    void zeroNeedsNothing() {
        assertThat(solve(0))
                .isEqualTo(new Breakdown(List.of(0, 0, 0, 0, 0, 0), List.of(0, 0, 0, 0, 0, 0)));
    }
}
