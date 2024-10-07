package geometry;

public class Circle implements GeometricShape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public void sayHello() {
        System.out.println("Hi, I am a circle");
    }
}
