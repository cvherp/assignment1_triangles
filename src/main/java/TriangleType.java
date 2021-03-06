public enum TriangleType {
    EQUILATERAL("Equilateral"),
    ISOSCELES("Isosceles"),
    SCALENE("Scalene");

    private final String name;

    private TriangleType(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }
}
