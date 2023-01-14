package day27_accessModifier;

public class TestNestedClassObjects {
    public static void main(String[] args) {

        Car obj1 = new Car();  // Car object
        Car.CarEngine obj2 = obj1.new CarEngine(); // CarEngine object

        // if inner class is non-static,
        // if outer class is static, you need to have

        Car.StaticInnerClass obj3 = new Car.StaticInnerClass(); //CanEngine object




    }
}
