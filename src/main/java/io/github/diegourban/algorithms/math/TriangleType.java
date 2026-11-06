package io.github.diegourban.algorithms.math;

/**
 * Classification of a triangle by how many of its sides are equal, as returned by
 * {@link Geometry#classifyTriangle(double, double, double)}.
 */
public enum TriangleType {
    /** All three sides are equal. */
    EQUILATERAL("Equilateral"),
    /** No two sides are equal (scalene). */
    SCALENE("Scalene"),
    /** Exactly two sides are equal. */
    ISOSCELES("Isosceles");

    private final String displayName;

    private TriangleType(final String displayName) {
        this.displayName = displayName;
    }

    /**
     * Returns the display name of this type, in English.
     *
     * @return the display name, such as {@code "Equilateral"}
     */
    public String getDisplayName() {
        return displayName;
    }
}
