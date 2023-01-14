package day12_customMethods;
import java.util.Scanner;
public class FormatFullName {
    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String first = input.nextLine().trim().replace(" ","");
        // trim method for spaces, replace method to empty the spaces between letter that user may put
        // cY  D Eo

        System.out.println("Enter your last name: ");
        String last = input.next().trim().replace(" ","");

        input.close();



        // getting first character of first name + the remaining of the characters of the first name

        first = first.substring(0, 1).toUpperCase() + first.substring(1).toLowerCase();
        // Cydeo will be printed, to make the first letter upper case and the remaining letters lower case

        last = last.substring(0, 1).toUpperCase() + last.substring(1).toLowerCase();

        String full_name = first + " " + last;


        System.out.println(full_name);


        // you have to have string in order to char






    }
}
/*
        Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)
        input:
        firstName = "cyDEo"
        lastName = "SCHOOL";
        output:
        Cydeo School */

