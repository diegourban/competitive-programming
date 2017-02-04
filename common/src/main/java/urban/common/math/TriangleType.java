package urban.common.math;

public enum TriangleType {
    EQUILATERAL("Equilatero"), ESCALENE("Escaleno"), ISOSCELES("Isoceles");

    private String name;

    private TriangleType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
