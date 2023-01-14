package day36_polimorphism_continue;

public class Circle {

    private double radius;
    public final static double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area() {
        return radius * radius * PI;
    }

    public double perimeter() {
        return 2 * radius * PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }

    @Override
    public boolean equals(Object obj) { // since we override this

        if (!(obj instanceof Circle)){ // if the specified object is not circle. then we should not compare them
            System.err.println("Invalid object");
            System.exit(1);
        }
        if (this.radius == ((Circle) obj).radius){
            return true;
        }
        return false;
    }
}
