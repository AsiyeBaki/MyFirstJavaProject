package day26_statics;

public class Car {

    public String make;

    public String model;
    public int year;
    public double price;
    public String color;


    public Car(String make) {
        this.make = make;
        System.out.println("Made by :  " + make);
    }

    public Car(String make, String model) {
        this(make);
        this.model = model;
        System.out.println("Model : " + model);
    }

    public Car(String make, String model, int year) {
        this(make, model);
        this.year = year;
        System.out.println("Year : " + year);
    }

    public Car(String make, String model, int year, double price) {
        this(make, model, year);
        this.price = price;
        System.out.println("Price : "+price);
    }

    public Car(String make, String model, int year, double price, String color) {
        this(make, model, year, price);
        this.color = color;
        System.out.println("Color : " + color);
    }


    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }


    public static void main(String[] args) {


        Car car1 = new Car("Nissan", "Kicks", 2018, 15000, "Black");
        System.out.println(car1);
        System.out.println("----------------------------------------------------------------------");

        Car car2 = new Car("Mercedes", "GLC", 2022, 30000);
        System.out.println(car2);
        System.out.println("-------------------------------------------------------------------------");

        Car car3 = new Car("Audi", "Q101", 2020);
        System.out.println(car3);
        System.out.println("-------------------------------------------------------------------------");

        Car car4 = new Car("Honda", "Civic");
        System.out.println(car4);
        System.out.println("------------------------------------------------------------------------");

        Car car5 = new Car("BMW");
        System.out.println(car5);







    }
}
