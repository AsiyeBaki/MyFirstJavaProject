package day35_polymorphism.transportationTask;

public class Tesla extends Car implements Electric, AutoPilot {


    public Tesla(String model, String color, int year, double price) {
        super(model, color, year, price);
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
