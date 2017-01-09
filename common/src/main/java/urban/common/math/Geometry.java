package urban.common.math;

public class Geometry {

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
        return Math.PI * (radius * radius);
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
        return Math.sqrt(area / Math.PI);
    }

}
