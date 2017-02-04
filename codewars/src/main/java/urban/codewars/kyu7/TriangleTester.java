package urban.codewars.kyu7;

import urban.common.math.Geometry;

public class TriangleTester {

    public static boolean isTriangle(int a, int b, int c) {
        return Geometry.isValidTriangle(a, b, c);
    }

}
