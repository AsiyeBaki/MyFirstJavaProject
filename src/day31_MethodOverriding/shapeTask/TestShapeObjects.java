package day31_MethodOverriding.shapeTask;

public class TestShapeObjects {
    public static void main(String[] args) {

        Square square = new Square(5);
        System.out.println(square);
        square.draw();


        System.out.println("----------------");
        Circle circle = new Circle(3.5);
        System.out.println(circle);


        System.out.println("-----------------");


        Rectangle rectangle = new Rectangle(5,4);

        System.out.println(rectangle);

        System.out.println(rectangle.area());

        rectangle.perimeter();
        System.out.println(rectangle.perimeter());


    }
}
