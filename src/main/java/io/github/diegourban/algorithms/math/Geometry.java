package io.github.diegourban.algorithms.math;

import java.util.Arrays;

public final class Geometry {

    private Geometry() {}

    private static final double SIMPLE_PI = 3.14;

    /**
     * Calculates the distance between two bi-dimensional points using the Pythagorean theorem.
     *
     * @param x1 point 1 x coordinate
     * @param y1 point 1 y coordinate
     * @param x2 point 2 x coordinate
     * @param y2 point 2 y coordinate
     * @return the distance between the two points
     */
    public static double distance(final int x1, final int y1, final int x2, final int y2) {
        // return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        return Math.hypot(x1 - x2, y1 - y2);
    }

    /**
     * Calculates the area of a circle from its radius
     *
     * @param radius the radius of the circle
     * @return the area of the circle
     */
    public static double areaOfCircleFromRadius(final double radius) {
        return SIMPLE_PI * (radius * radius);
    }

    /**
     * Calculates the area of a circle from its diameter
     *
     * @param diameter the diameter of the circle
     * @return the area of the circle
     */
    public static double areaOfCircleFromDiameter(final double diameter) {
        final double radius = radiusOfCircleFromDiameter(diameter);
        return areaOfCircleFromRadius(radius);
    }

    /**
     * Calculates the radius of a circle from its diameter
     *
     * @param diameter the diameter of the circle
     * @return the radius of the circle
     */
    public static double radiusOfCircleFromDiameter(final double diameter) {
        return diameter / 2.0;
    }

    /**
     * Calculates the radius of a circle from its area
     *
     * @param area the area of the circle
     * @return the radius of the circle
     */
    public static double radiusOfCircleFromArea(final double area) {
        return Math.sqrt(area / SIMPLE_PI);
    }

    /**
     * Calculates the number of diagonals of an n-sided polygon
     *
     * @param sides the number of sides of the polygon
     * @return the amount of diagonals
     */
    public static long diagonalsOfPolygonWithSides(final long sides) {
        return (sides * (sides - 3)) / 2;
    }

    /**
     * Calculates the height of a cylinder based on its volume and base radius
     *
     * @param volume     the cylinder volume
     * @param baseRadius the cylinder base radius
     * @return the height of the cylinder
     */
    public static double heightOfCylinder(final double volume, final double baseRadius) {
        return volume / (SIMPLE_PI * baseRadius * baseRadius);
    }

    /**
     * Checks if the sides a, b and c can form a valid triangle
     *
     * @param a side a
     * @param b side b
     * @param c side c
     * @return true if the sides form a valid triangle, false otherwise
     */
    public static boolean isValidTriangle(final double a, final double b, final double c) {
        return (a + b > c) && (b + c > a) && (a + c > b);
    }

    public static TriangleType checkTriangleType(final double a, final double b, final double c) {
        final double[] array = new double[3];
        array[0] = a;
        array[1] = b;
        array[2] = c;
        Arrays.sort(array);

        final double min = array[0];
        final double med = array[1];
        final double max = array[2];

        if (max == med && med == min) {
            return TriangleType.EQUILATERAL;
        }

        if (max == med || med == min) {
            return TriangleType.ISOSCELES;
        }

        return TriangleType.ESCALENE;
    }

    public static boolean isRectangleTriangle(final double a, final double b, final double c) {
        final double[] array = new double[3];
        array[0] = a;
        array[1] = b;
        array[2] = c;
        Arrays.sort(array);

        final double min = array[0];
        final double med = array[1];
        final double max = array[2];

        final double maxSquared = max * max;
        final double medSquared = med * med;
        final double minSquared = min * min;

        return maxSquared == medSquared + minSquared;
    }
}
