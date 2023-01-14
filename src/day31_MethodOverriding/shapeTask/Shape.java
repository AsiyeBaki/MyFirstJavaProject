package day31_MethodOverriding.shapeTask;

public class Shape {   // public final class shape {}    if we do it final, can not be extended, parent class can not be final

    private String name;

    public Shape() { // default constructor
        setName(getClass().getSimpleName()); // it will set the name of the shape as a default
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double area() {
        return 0;
    }

    public double perimeter() {
        return 0;
    }

    public void draw() {
        System.out.println("Drawing a " + getClass().getSimpleName());
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }


}
