package urban.common.math;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeometryTest {

    @Test
    public void shouldCreateInstance() {
        assertNotNull(new Geometry());
    }

    @Test
    public void shouldCalculateDistance() {
        assertEquals(5.0, Geometry.distance(-2, 1, 1, 5), 0.1);
    }

    @Test
    public void shouldCalculateTheAreaOfCircleFromItsRadius() {
        assertEquals(28.26, Geometry.areaOfCircleFromRadius(3), 0.1);
    }

    @Test
    public void shouldCalculateTheAreaOfCircleFromItsDiameter() {
        assertEquals(50.24, Geometry.areaOfCircleFromDiameter(8), 0.1);
    }

    @Test
    public void shouldCalculateTheRadiusOfCircleFromItsDiameter() {
        assertEquals(1, Geometry.radiusOfCircleFromDiameter(2), 0.1);
        assertEquals(1.5, Geometry.radiusOfCircleFromDiameter(3), 0.1);
        assertEquals(2, Geometry.radiusOfCircleFromDiameter(4), 0.1);
        assertEquals(100, Geometry.radiusOfCircleFromDiameter(200), 0.1);
    }

    @Test
    public void shouldCalculateTheRadiusOfCircleFromItsArea() {
        assertEquals(5, Geometry.radiusOfCircleFromArea(78.5), 0.1);
    }

    @Test
    public void shouldCalculateDiagonalsOfPolygons() {
        assertEquals(0, Geometry.diagonalsOfPolygonWithSides(3));
        assertEquals(2, Geometry.diagonalsOfPolygonWithSides(4));
        assertEquals(35, Geometry.diagonalsOfPolygonWithSides(10));
        assertEquals(44, Geometry.diagonalsOfPolygonWithSides(11));
        assertEquals(4999850000L, Geometry.diagonalsOfPolygonWithSides(100000));
    }

    @Test
    public void shouldCalculateHeightOfACylinder() {
        assertEquals(7.00, Geometry.heightOfCylinder(87.62, 2), 0.1);
    }
}
