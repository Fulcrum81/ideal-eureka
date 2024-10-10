package geometry;

public class Rectangle extends GeometricShape {

    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
        shapeType = "rectangle";
    }

    public double getArea() {
        return sideA * sideB;
    }
}
