package urban.common.math;

public class Geometry {

    private static final double SIMPLE_PI = 3.14;

    /**
     * Calculates the distance between two bi-dimensional points
     *
     * @param x1 point 1 x coordinate
     * @param y1 point 1 y coordinate
     * @param x2 point 2 x coordinate
     * @param y2 point 2 y coordinate
     * @return the distance between the two points
     */
    public static double distance(int x1, int y1, int x2, int y2) {
        // return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        return Math.hypot(x1 - x2, y1 - y2);
    }

    /**
     * Calculates the area of a circle from its radius
     *
     * @param radius the radius of the circle
     * @return the area of the circle
     */
    public static double areaOfCircleFromRadius(double radius) {
        return SIMPLE_PI * (radius * radius);
    }

    /**
     * Calculates the area of a circle from its diameter
     *
     * @param diameter the diameter of the circle
     * @return the area of the circle
     */
    public static double areaOfCircleFromDiameter(double diameter) {
        double radius = radiusOfCircleFromDiameter(diameter);
        return areaOfCircleFromRadius(radius);
    }

    /**
     * Calculates the radius of a circle from its diameter
     *
     * @param diameter the diameter of the circle
     * @return the radius of the circle
     */
    public static double radiusOfCircleFromDiameter(double diameter) {
        return diameter / 2.0;
    }

    /**
     * Calculates the radius of a circle from its area
     *
     * @param area the area of the circle
     * @return the radius of the circle
     */
    public static double radiusOfCircleFromArea(double area) {
        return Math.sqrt(area / SIMPLE_PI);
    }

    /**
     * Calculates the number of diagonals of an n-sided polygon
     *
     * @param sides the number of sides of the polygon
     * @return the amount of diagonals
     */
    public static long diagonalsOfPolygonWithSides(long sides) {
        return (sides * (sides - 3)) / 2;
    }

    /**
     * Calculates the height of a cylinder based on its volume and base radius
     *
     * @param volume     the cylinder volume
     * @param baseRadius the cylinder base radius
     * @return the height of the cylinder
     */
    public static double heightOfCylinder(double volume, double baseRadius) {
        return volume / (SIMPLE_PI * baseRadius * baseRadius);
    }

}
