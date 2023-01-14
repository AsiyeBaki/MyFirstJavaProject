package day09_scanner;

import java.util.Scanner;

public class NextLineMethodPractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String full_name = input.nextLine();

        System.out.println("Enter your school name: ");
        String school_name = input.nextLine();

        System.out.println("Enter your date of birth: ");
        String gender = input.next();

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        input.nextLine(); // we have to give extra nextLine() method if we are using a nextLine() method after the other methods of scanner
        // this line needs to be added in order to print street name, otherwise it will not print it

        System.out.println("Enter your street name: ");
        String street = input.nextLine();

        System.out.println("Full name is: " + full_name);
        System.out.println("School name is: " + school_name);
        System.out.println("Gender is: " + gender);
        System.out.println("Age is:" + age);
        System.out.println("Street is: " + street);


    }
}
