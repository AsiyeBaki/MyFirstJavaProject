package day34_interface.car_warmpTask_interface;

public class Audi extends Car {

    public Audi( String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Press the start button to start "+getMake()+" "+getModel() + ".");
    }

    public void autoPark (){
        System.out.println(getMake() + " "+getModel()+" has auto park feature.");
    }

}
