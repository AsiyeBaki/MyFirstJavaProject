package day34_interface.car_warmpTask_interface;

public class Honda extends Car {
    public Honda(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void start() { // giving public access modifier to child class, it is accessible from outside the package
        System.out.println("Twist the key to ignition to start "+getMake() +" "+ getModel()+".");
    }
}
