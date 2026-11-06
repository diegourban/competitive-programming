package io.github.diegourban.algorithms.math;

/**
 * Classification of a triangle by how many of its sides are equal, as returned by
 * {@link Geometry#checkTriangleType(double, double, double)}.
 */
public enum TriangleType {
    /** All three sides are equal. */
    EQUILATERAL("Equilatero"),
    /** No two sides are equal (scalene). */
    ESCALENE("Escaleno"),
    /** Exactly two sides are equal. */
    ISOSCELES("Isoceles");

    private final String name;

    private TriangleType(final String name) {
        this.name = name;
    }

    /**
     * Returns the display name of this type, in Portuguese.
     *
     * @return the display name, such as {@code "Equilatero"}
     */
    public String getName() {
        return name;
    }
}
