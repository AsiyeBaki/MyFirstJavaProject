package day38_throws_keyword.shape;

public class Circle {

    private double radius;

    public Circle(double radius){

        setRadius(radius);
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0){
            throw new InvalidShapeException("Radius can not set to zero or negative: " + radius);
        }
        this.radius = radius;
    }

}
