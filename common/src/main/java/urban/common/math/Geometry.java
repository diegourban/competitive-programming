package urban.common.math;

import java.util.Arrays;

public class Geometry {

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

    /**
     * Checks if the sides a, b and c can form a valid triangle
     *
     * @param a side a
     * @param b side b
     * @param c side c
     * @return true if the sides form a valid triangle, false otherwise
     */
    public static boolean isValidTriangle(double a, double b, double c) {
        return (a + b > c) && (b + c > a) && (a + c > b);
    }

    public static TriangleType checkTriangleType(double a, double b, double c) {
        double[] array = new double[3];
        array[0] = a;
        array[1] = b;
        array[2] = c;
        Arrays.sort(array);

        double min = array[0];
        double med = array[1];
        double max = array[2];

        if (max == med && med == min) {
            return TriangleType.EQUILATERAL;
        }

        if (max == med || med == min) {
            return TriangleType.ISOSCELES;
        }

        return TriangleType.ESCALENE;
    }

    public static boolean isRectangleTriangle(double a, double b, double c) {
        double[] array = new double[3];
        array[0] = a;
        array[1] = b;
        array[2] = c;
        Arrays.sort(array);

        double min = array[0];
        double med = array[1];
        double max = array[2];

        double maxSquared = max * max;
        double medSquared = med * med;
        double minSquared = min * min;

        return maxSquared == medSquared + minSquared;
    }

    public static class Rectangle {

        // coordinates of bottom left corner
        private int leftX;
        private int bottomY;

        // dimensions
        private int width;
        private int height;

        public Rectangle(int leftX, int bottomY, int width, int height) {
            this.leftX = leftX;
            this.bottomY = bottomY;
            this.width = width;
            this.height = height;
        }

        public int getLeftX() {
            return leftX;
        }

        public int getBottomY() {
            return bottomY;
        }

        public int getWidth() {
            return width;
        }

        public int getHeight() {
            return height;
        }

        @Override
        public String toString() {
            return "Rectangle{" +
                    "leftX=" + leftX +
                    ", bottomY=" + bottomY +
                    ", width=" + width +
                    ", height=" + height +
                    '}';
        }
    }

    private static class RangeOverlap {
        private int startPoint;
        private int length;

        public RangeOverlap(int startPoint, int length) {
            this.startPoint = startPoint;
            this.length = length;
        }

        public int getStartPoint() {
            return startPoint;
        }

        public int getLength() {
            return length;
        }
    }

    private static RangeOverlap findRangeOverlap(int point1, int length1, int point2, int length2) {
        // find the highest start point and lowest end point.
        // the highest ("rightmost" or "upmost") start point is
        // the start point of the overlap.
        // the lowest end point is the end point of the overlap.
        int highestStartPoint = Math.max(point1, point2);
        int lowestEndPoint = Math.min(point1 + length1, point2 + length2);

        // return empty overlap if there is no overlap
        if (highestStartPoint >= lowestEndPoint) {
            return new RangeOverlap(0, 0);
        }

        // compute the overlap length
        int overlapLength = lowestEndPoint - highestStartPoint;

        return new RangeOverlap(highestStartPoint, overlapLength);
    }

    public static Rectangle findRectangularOverlap(Rectangle rect1, Rectangle rect2) {
        // get the x and y overlap points and lengths
        RangeOverlap xOverlap = findRangeOverlap(rect1.getLeftX(), rect1.getWidth(),
                rect2.getLeftX(), rect2.getWidth());
        RangeOverlap yOverlap = findRangeOverlap(rect1.getBottomY(), rect1.getHeight(),
                rect2.getBottomY(), rect2.getHeight());

        // return "zero" rectangle if there is no overlap
        if (xOverlap.getLength() == 0 || yOverlap.getLength() == 0) {
            return new Rectangle(0, 0, 0, 0);
        }

        return new Rectangle(
                xOverlap.getStartPoint(),
                yOverlap.getStartPoint(),
                xOverlap.getLength(),
                yOverlap.getLength()
        );
    }


}
