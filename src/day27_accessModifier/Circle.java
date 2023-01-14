package day27_accessModifier;

public class Circle {


    public double radius, diameter;
    public static double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
        this.diameter = 2 * radius;
    }
    /*
    public static double calculateArea (double radius) {  // static only accepts statics
        return radius * radius * pi;
    }
     */

    public double calculateArea() {
        return radius * radius * pi;
    }

    public double calculatePerimeter() {
        return diameter * pi;
    }

    public static void printPiValue() {
        System.out.println("PI' value is: " + pi);
    }


    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", PI=" + pi +
                ", area=" + calculateArea() +
                ", perimeter=" + calculatePerimeter() +
                '}';
    }
}

