package day32_abstract.carTask_methodOverriding;

public class Toyota extends Car{

    public Toyota(String model, String color, int year, double price) {
        super(model, color, year, price);
    }


    // For Toyota, we do not need to override the start() method since it requires the same info as in Parent class


}


/*

Toyota
            start(): "Press the brake and twist the key to ignition"


 */