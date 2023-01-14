package day35_polymorphism.transportationTask;

import day34_interface.animalTask_interface.Flyable;

public abstract class Plane extends Transportation implements Flyable {

    public Plane(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    public void land(){
        System.out.println("Plane "+getMake() + " "+getModel() + " is landing");
    }

    @Override
    public void fly() {
        System.out.println(getMake() + " "+getModel() + " is flying");
    }
}
