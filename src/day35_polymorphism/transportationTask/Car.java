package day35_polymorphism.transportationTask;

public abstract class Car extends Transportation {

    public Car(String model, String color, int year, double price) {
        super(model, color, year, price);
    }


    public void drive(){
        System.out.println("Driving "+getMake()+" "+getModel());
    }
}
