package day36_polimorphism_continue;

public class TestEqualMethod {
    public static void main(String[] args) {

        Circle circle1 = new Circle(5);

        Circle circle2 = new Circle(5);

        Circle circle3 = new Circle(15);

        System.out.println(circle1 == circle2); // false // it will compare the memory allocation of the objects. so it will return false

        System.out.println(circle1.equals(circle2)); // true // it is going to compare the values , so it will return true

        System.out.println(circle1.equals(circle3));  // false

        System.out.println("-----------------------------------------------------------");

        IPhone iphone1 = new IPhone("Apple", "Iphone 12", "Medium", "Black", 900);

        IPhone iphone2 = new IPhone("Apple", "Iphone 12", "Medium", "White", 900);


        //System.out.println( iphone1.equals(circle1) ); // Error: Invalid object, Object must be Iphone
        System.out.println( iphone1.equals(iphone2) ); // it will return false, since the colors are not the same


        System.out.println("---------------------------------------------------------");

        // for car objects to be compared if they are the same objects, model, year, color should be the same.
    }
}
