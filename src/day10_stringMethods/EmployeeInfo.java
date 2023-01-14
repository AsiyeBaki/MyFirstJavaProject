package day10_stringMethods;

import java.util.Scanner;

public class EmployeeInfo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.println("Enter your age: ");
        byte age = input.nextByte();

        System.out.println("Enter your gender: ");
        char gender = input.next().charAt(0); // we give 0 for the first character

        input.nextLine();

        System.out.println("Enter your company name: ");
        String companyName = input.nextLine(); // if we are about to use nextLine we have to check
        // if we need to give extra nextLine before this line

        System.out.println("Enter your job title: ");
        String jobTitle = input.nextLine();

        System.out.println("Enter your salary: ");
        double salary = input.nextDouble();


        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("companyName = " + companyName);
        System.out.println("jobTitle = " + jobTitle);
        System.out.println("salary = $" + salary);

        input.close();
    }
}
