package lesson1.classwork.enums;

public enum GeometryShape {
    SQUARE("Square"),
    TRIANGLE("Triangle")
    ;

    private final String latinName;

    GeometryShape(String latinName) {
        this.latinName = latinName;
    }

    public String getLatinName() {
        return latinName;
    }

    public double perimeter() {
        return 0;
    }
}
