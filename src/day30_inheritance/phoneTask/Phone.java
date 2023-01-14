package day30_inheritance.phoneTask;

import java.util.Arrays;

public class Phone {
// if parent class constructor is default , constructor will be called implicaitly in child class
// if parent class constructor is set constructor ,
// child class constructor has to call parent class constructor
    private String brand, model, size, color;
    private double price;

    public Phone(String brand, String model, String size, String color, double price) {
        setBrand(brand);
        setModel(model);
        setSize(size);
        setColor(color);
        setPrice(price);
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        String[] colors = {"Black", "White", "Silver", "Gold", "Pink"};
        if (Arrays.asList(colors).contains(color)) {
            this.color = color;
        } else {
            System.err.println("Invalid color: " + color + ". Options for color: " + Arrays.toString(colors));
            System.exit(1);
        }

    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if (price <= 0) {
            System.err.println("Invalid price: " + price);
        }
        this.price = price;
    }

    public void call(long phoneNumber) {
        System.out.println(getModel()+" is calling: " + phoneNumber);
    }

    public void text(long phoneNumber) {
        System.out.println(getModel()+" is texting: " + phoneNumber);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

}
