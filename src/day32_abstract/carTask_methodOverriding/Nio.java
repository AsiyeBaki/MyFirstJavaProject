package day32_abstract.carTask_methodOverriding;

public class Nio extends Car {  // if we make Tesla Class final , we get error in here since parent can not be final

    public Nio(String model, String color, int year, double price) {
        super(model, color, year, price);
    }
}
