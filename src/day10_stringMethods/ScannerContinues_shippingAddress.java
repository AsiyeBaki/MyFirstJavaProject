package day10_stringMethods;

import java.util.Scanner;

public class ScannerContinues_shippingAddress {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String full_name = input.nextLine();   // Cydeo School + Enter

        System.out.println("Enter your building number: ");
        String building_number = input.next(); // 7925

        input.nextLine();  // to clear the scanner

        System.out.println("Enter your street name: ");
        String street_name = input.nextLine();


        System.out.println("Enter your city name: ");
        String city_name = input.nextLine();

        System.out.println("Enter state: ");
        String state = input.nextLine();

        System.out.println("Enter zip code");
        String zip_code = input.next();

        System.out.println("Your shipping address is:");
        System.out.println("\t" + full_name);
        System.out.println("\t" + building_number + " " + street_name);
        System.out.println("\t" + city_name + ", " + state + " " + zip_code);

        // OR

        System.out.println("Your shipping address is: \n\t" + full_name + "\n\t" + building_number
                + " " + street_name + "\n\t" + city_name + ", " + state + " " + zip_code);

        /*
        1. Create a class named ShippingAddress and ask the user to:
	            1.1 Enter your full name ( nextLine() )
	            1.2 Enter your building number ( next() )
	            1.3 Enter your Street name ( nextLine() )
	            1.4 Enter your city name ( nextLine() )
	            1.5 Enter your state ( nextLine() )
	            1.6 Enter your zip code ( next() )
	            1.7 Display the shipping address
	                Ex:
	                    Your shipping address is:
	                        John Smith
	                        7925 Jones Branch Dr
	                        McLean, VA 22012
            */


    }
}
