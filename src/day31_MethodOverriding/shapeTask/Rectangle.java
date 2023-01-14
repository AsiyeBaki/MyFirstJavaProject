package day31_MethodOverriding.shapeTask;

public class Rectangle extends Shape {
    
    private double height, length;

    public Rectangle(double height, double length) {
        setheight(height);
        setlength(length);
        this.length = length;
    }

    public double getheight() {
        return height;
    }

    public void setheight(double height) {
        this.height = height;
    }

    public double getlength() {
        return length;
    }

    public void setlength(double length) {
        this.length = length;
    }

    @Override
    public double area() {
        return height * length;
    }

    @Override
    public double perimeter() {
        return 2 * (height + length);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle: ");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name=" + getName() +
                "sides=" + height + " and " + length + 
                "area=" + area() +
                "perimeter=" + perimeter() +
                '}';
    }
}
