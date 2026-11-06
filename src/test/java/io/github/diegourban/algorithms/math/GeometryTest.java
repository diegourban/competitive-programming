package io.github.diegourban.algorithms.math;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;

import org.junit.jupiter.api.Test;

class GeometryTest {

    @Test
    void shouldCalculateDistance() {
        assertThat(Geometry.distance(-2, 1, 1, 5)).isCloseTo(5.0, within(0.1));
    }

    @Test
    void shouldCalculateTheAreaOfCircleFromItsRadius() {
        assertThat(Geometry.areaOfCircleFromRadius(3)).isCloseTo(28.26, within(0.1));
    }

    @Test
    void shouldCalculateTheAreaOfCircleFromItsDiameter() {
        assertThat(Geometry.areaOfCircleFromDiameter(8)).isCloseTo(50.24, within(0.1));
    }

    @Test
    void shouldCalculateTheRadiusOfCircleFromItsDiameter() {
        assertThat(Geometry.radiusOfCircleFromDiameter(2)).isCloseTo(1, within(0.1));
        assertThat(Geometry.radiusOfCircleFromDiameter(3)).isCloseTo(1.5, within(0.1));
        assertThat(Geometry.radiusOfCircleFromDiameter(4)).isCloseTo(2, within(0.1));
        assertThat(Geometry.radiusOfCircleFromDiameter(200)).isCloseTo(100, within(0.1));
    }

    @Test
    void shouldCalculateTheRadiusOfCircleFromItsArea() {
        assertThat(Geometry.radiusOfCircleFromArea(78.5)).isCloseTo(5, within(0.1));
    }

    @Test
    void shouldCalculateDiagonalsOfPolygons() {
        assertThat(Geometry.diagonalsOfPolygonWithSides(3)).isZero();
        assertThat(Geometry.diagonalsOfPolygonWithSides(4)).isEqualTo(2);
        assertThat(Geometry.diagonalsOfPolygonWithSides(10)).isEqualTo(35);
        assertThat(Geometry.diagonalsOfPolygonWithSides(11)).isEqualTo(44);
        assertThat(Geometry.diagonalsOfPolygonWithSides(100000)).isEqualTo(4999850000L);
    }

    @Test
    void shouldCalculateHeightOfACylinder() {
        assertThat(Geometry.heightOfCylinder(87.62, 2)).isCloseTo(7.00, within(0.1));
    }

    @Test
    void shouldConsiderValidTriangles() {
        assertThat(Geometry.isValidTriangle(7, 10, 5)).isTrue();
        assertThat(Geometry.isValidTriangle(20, 30, 40)).isTrue();
        assertThat(Geometry.isValidTriangle(1, 1, 1)).isTrue();
    }

    @Test
    void shouldConsiderInvalidTriangles() {
        assertThat(Geometry.isValidTriangle(5, 8, 3)).isFalse();
    }

    @Test
    void shouldConsiderAsEquilateralTriangle() {
        assertThat(Geometry.classifyTriangle(6, 6, 6)).isEqualTo(TriangleType.EQUILATERAL);
        assertThat(Geometry.classifyTriangle(2.2, 2.2, 2.2)).isEqualTo(TriangleType.EQUILATERAL);
        assertThat(Geometry.classifyTriangle(1, 1, 1)).isEqualTo(TriangleType.EQUILATERAL);
    }

    @Test
    void shouldConsiderAsIsoscelesTriangle() {
        assertThat(Geometry.classifyTriangle(6, 6, 7)).isEqualTo(TriangleType.ISOSCELES);
        assertThat(Geometry.classifyTriangle(2.2, 2.1, 2.2)).isEqualTo(TriangleType.ISOSCELES);
        assertThat(Geometry.classifyTriangle(2, 1, 1)).isEqualTo(TriangleType.ISOSCELES);
    }

    @Test
    void shouldConsiderAsEscaleneTriangle() {
        assertThat(Geometry.classifyTriangle(6, 7, 8)).isEqualTo(TriangleType.SCALENE);
        assertThat(Geometry.classifyTriangle(2.2, 2.3, 2.4)).isEqualTo(TriangleType.SCALENE);
        assertThat(Geometry.classifyTriangle(3, 2, 1)).isEqualTo(TriangleType.SCALENE);
    }

    @Test
    void shouldConsiderValidRectangleTriangle() {
        assertThat(Geometry.isRightTriangle(6, 8, 10)).isTrue();
    }

    @Test
    void shouldConsiderInvalidRectangleTriangle() {
        assertThat(Geometry.isRightTriangle(7, 8, 10)).isFalse();
        assertThat(Geometry.isRightTriangle(6, 9, 10)).isFalse();
        assertThat(Geometry.isRightTriangle(6, 8, 11)).isFalse();
    }

    @Test
    void shouldUseThePreciseValueOfPi() {
        assertThat(Geometry.areaOfCircleFromRadius(1)).isCloseTo(Math.PI, within(1e-12));
        assertThat(Geometry.areaOfCircleFromDiameter(2)).isCloseTo(Math.PI, within(1e-12));
        assertThat(Geometry.radiusOfCircleFromArea(Math.PI)).isCloseTo(1, within(1e-12));
        assertThat(Geometry.heightOfCylinder(Math.PI, 1)).isCloseTo(1, within(1e-12));
    }
}
