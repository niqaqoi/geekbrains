package lesson1.classwork.enums;

public final class GeometryMath {

    private GeometryMath() {
    }

    public static double calcPerimeter(GeometryShape shapeType) {
        switch (shapeType) {
            case  SQUARE -> return shapeType.perimeter();
            case TRIANGLE -> return shapeType.perimeter();
    }
}
