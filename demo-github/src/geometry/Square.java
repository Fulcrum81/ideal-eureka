package geometry;

public class Square extends GeometricShape {

    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
        shapeType = "square";
    }

    public double getArea() {
        return sideLength * sideLength;
    }
}
