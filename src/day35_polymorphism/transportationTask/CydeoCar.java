package day35_polymorphism.transportationTask;

import day34_interface.animalTask_interface.Flyable;
import day34_interface.animalTask_interface.Swimmable;

public class CydeoCar extends Car implements Flyable, Electric, AutoPilot, Swimmable {

    public CydeoCar(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }

    @Override
    public void autoPark() {

    }

    @Override
    public void selfDrive() {

    }

    @Override
    public void charge() {

    }

    @Override
    public void transportPeople() {

    }

    @Override
    public void start() {

    }
}
