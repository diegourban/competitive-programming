package io.github.diegourban.algorithms.problems.math;

import io.github.diegourban.algorithms.math.NumberTheory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

/**
 * TDA Rational — beecrowd (formerly URI Online Judge) 1022.
 * <p>
 * https://judge.beecrowd.com/en/problems/view/1022
 * <p>
 * Apply the textbook fraction formula for the operator, then divide numerator and denominator by
 * their gcd to simplify. O(log min(n, d)) per operation.
 */
class TdaRationalTest {

    record Fraction(int numerator, int denominator) {
    }

    record Result(Fraction raw, Fraction simplified) {
    }

    static Result solve(Fraction a, char operator, Fraction b) {
        var raw = switch (operator) {
            case '+' -> new Fraction(a.numerator() * b.denominator() + b.numerator() * a.denominator(),
                    a.denominator() * b.denominator());
            case '-' -> new Fraction(a.numerator() * b.denominator() - b.numerator() * a.denominator(),
                    a.denominator() * b.denominator());
            case '*' -> new Fraction(a.numerator() * b.numerator(), a.denominator() * b.denominator());
            case '/' -> new Fraction(a.numerator() * b.denominator(), b.numerator() * a.denominator());
            default -> throw new IllegalArgumentException("Invalid operator: " + operator);
        };
        var gcd = (int) NumberTheory.gcdLoop(Math.abs(raw.numerator()), Math.abs(raw.denominator()));
        return new Result(raw, new Fraction(raw.numerator() / gcd, raw.denominator() / gcd));
    }

    private static Result result(int rawNumerator, int rawDenominator, int numerator, int denominator) {
        return new Result(new Fraction(rawNumerator, rawDenominator), new Fraction(numerator, denominator));
    }

    @Test
    void sampleAddition() {
        assertThat(solve(new Fraction(1, 2), '+', new Fraction(3, 4))).isEqualTo(result(10, 8, 5, 4));
    }

    @Test
    void sampleSubtractionWithNegativeResult() {
        assertThat(solve(new Fraction(1, 2), '-', new Fraction(3, 4))).isEqualTo(result(-2, 8, -1, 4));
    }

    @Test
    void sampleMultiplication() {
        assertThat(solve(new Fraction(2, 3), '*', new Fraction(6, 6))).isEqualTo(result(12, 18, 2, 3));
    }

    @Test
    void sampleDivision() {
        assertThat(solve(new Fraction(1, 2), '/', new Fraction(3, 4))).isEqualTo(result(4, 6, 2, 3));
    }

    @Test
    void divisionSimplifiesToWholeNumber() {
        assertThat(solve(new Fraction(1, 2), '/', new Fraction(1, 6))).isEqualTo(result(6, 2, 3, 1));
    }

    @Test
    void additionOfEqualFractions() {
        assertThat(solve(new Fraction(1, 4), '+', new Fraction(1, 4))).isEqualTo(result(8, 16, 1, 2));
    }

    @Test
    void unknownOperatorIsRejected() {
        assertThatIllegalArgumentException().isThrownBy(() -> solve(new Fraction(1, 4), '.', new Fraction(1, 4)));
    }
}
