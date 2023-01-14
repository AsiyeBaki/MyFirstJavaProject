package day26_statics;

public class TestIphoneObjects {
    public static void main(String[] args) {


        IPhone iPhone = new IPhone("iPhone12", "Black", 1000);

        System.out.println(iPhone.model);
        System.out.println(iPhone.color);
        System.out.println(iPhone.price);

        System.out.println("---------------------------------------------------");
        iPhone.printPhoneInfo();
        System.out.println("--------------------------");

        /*
        this is not a legal way to call static members, we need to call static variables through the class name

        System.out.println( iPhone.brand );
        System.out.println( iPhone.OS );
        iPhone.printOperatingSystem();
        */
        System.out.println("-----------------------------------------------------");
        System.out.println(IPhone.brand); // Apple
        System.out.println(IPhone.OS); // iOS
        IPhone.printOperatingSystem(); // Operating System: iOS  Made in: China.....

        System.out.println("-------------------");

        iPhone.printPhoneInfo();
        System.out.println("-------------------------");
        IPhone.printOperatingSystem();
        System.out.println("-------------------------");


       //  System.out.println(iPhone.color);




    }
}
