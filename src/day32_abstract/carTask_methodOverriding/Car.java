package day32_abstract.carTask_methodOverriding;

public class Car {
    private String make, model, color;
    private int year;
    private double price;
    private static int numberOfWheels;
    private static boolean hasBattery;
    static {
        numberOfWheels = 4;
        hasBattery = true;
    }
    public Car(String model, String color, int year, double price) {  // we do not need to pass make variable, giving less parameter
        setMake(getClass().getSimpleName());  // setting the class name to the make of the car
        // What is the benefit of having less parameters in constructor?
        // We provide less argument to create an object
        setModel(model);
        setColor(color);
        setYear(year);
        setPrice(price);

        //  numberOfWheels = 4;
        //  hasBattery = true;
        // if we do have assign static in constructor block , this info will be used for every single object.
        // Why we should not assign statics in constructor block ?
        // Because each time we create an object constructor will get executed, as well as static info will executed, unnecessary, it is ironic to static's point
    }
    public String getMake() {
        return make;
    }
    public void setMake(String name) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year <= 0) {
            System.err.println("Invalid year:" + year);
            System.exit(1);
        }
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (year <= 0) {
            System.err.println("Invalid price:" + price);
            System.exit(1);
        }
        this.year = year;
    }
    public void start() {
        System.out.println("Press the break and twist the key to ignition to start " + make + " " + model);
    }
    @Override
    public String toString() {
        return  getClass().getSimpleName() + "{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", wheels=" + numberOfWheels +
                ", hasBattery=" + hasBattery +
                '}';
    }


}
