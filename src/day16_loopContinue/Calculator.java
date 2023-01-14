package day16_loopContinue;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String answer = "yes";

        while (answer.equals("yes")) {

            System.out.println("Enter first number");
            double num1 = scan.nextDouble();

            System.out.println("Enter a math operator");
            char operator = scan.next().charAt(0);

            while (!(operator == '+' || operator == '-' || operator == '/' || operator == '*')) { // while operator is invalid
                System.err.println("Invalid math operator! Please re-enter a valid math operator");
                operator = scan.next().charAt(0);
            }
            System.out.println("Enter your second number");
            double num2 = scan.nextDouble();

            double result = (operator == '+') ? num1 + num2 : (operator == '-') ? num1 - num2
                    : (operator == '*') ? num1 * num2 : num1 / num2;
            System.out.println("result = " + result);

            System.out.println("Would you like to continue? Yes/No");
            answer = scan.next().toLowerCase();

            while (! (answer.equals("yes") || answer.equals("no"))) {
                System.err.println("Invalid answer! Would you like to continue? Yes/No");
                answer = scan.next().toLowerCase();
            }

        }









    }
}
/*
1.Write a program for a simple calculator
        Ask user to enter a number: double
        Ask user to enter a math operator
        if the user enters invalid math operator, repeat the same step until user enters a valid operator

        ask user to enter second number: double
        display the calculation result
        would you like to continue?(Yes/No)
 */
