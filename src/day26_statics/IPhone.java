package day26_statics;

public class IPhone {

    public static String brand = "Apple";  // static: "Apple" is the brand of all the iphone objects
    public String model;
    public String color;
    public double price;
    public static String OS = "iOS"; // operating system is the same for all iphones
    public static String madeIn = "China";
    public static boolean hasBattery = true;
    public static boolean isTouchScreen = true;
    public static boolean isExpensiveToFix = true;

    public IPhone(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

 /*
    public static void printPhoneInfo() {   // model and color will give an error(red),  static only accepts statics,
        System.out.println("Model: " + model);
        System.out.println("Color: " + color;
    }
     */  // EX of what if we create it as static


    public void printPhoneInfo() {  // instance methods accepts both static nad none statics
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);


    }


    public static void printOperatingSystem() {

        System.out.println("Operating System: " + OS);
        System.out.println("Made in: " + madeIn);
        System.out.println("Has battery: " + hasBattery);
        System.out.println("Is touch screen: " + isTouchScreen);
        System.out.println("Is expensive to fix: " + isExpensiveToFix);

    }



}
