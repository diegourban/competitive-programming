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

}
