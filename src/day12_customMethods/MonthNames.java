package day12_customMethods;

import java.util.Scanner;

public class MonthNames {



    /*
   3. Create a method named monthName that can display the name of the month based on
    the given number to the method, if the number is invalid, then the method should print
    the error message "Invalid Number"
   Ex:    monthName(6)        output:June
       */
    public static void monthName() {


    }

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Which month?");
        String month = input.next();
        monthName();

    }
}
