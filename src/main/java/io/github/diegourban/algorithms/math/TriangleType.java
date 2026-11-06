package io.github.diegourban.algorithms.math;

public enum TriangleType {
    EQUILATERAL("Equilatero"),
    ESCALENE("Escaleno"),
    ISOSCELES("Isoceles");

    private final String name;

    private TriangleType(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
