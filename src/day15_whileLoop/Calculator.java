package day15_whileLoop;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number");
        double num1 = input.nextDouble();

        System.out.println("Enter your second number");
        double num2 = input.nextDouble();

        System.out.println("Enter a math operator");
        char operator = input.next().charAt(0);

        while (!(operator == '+' || operator == '-' || operator == '*' || operator == '/')) { // while the operator is invalid
            System.err.println("Invalid Operator! Please re-enter the match operator");
            operator = input.next().charAt(0);
        }
        // if we need it to be repeated unknown times, statement is inside of the loop, otherwise outside of the loop body
        // if user never puts the right info it never checks if conditions
        if (operator == '+') {
            System.out.println(num1 + num2);
        } else if (operator == '-') {
            System.out.println(num1 - num2);
        } else if (operator == '*') {
            System.out.println(num1 * num2);
        } else {
            System.out.println(num1 / num2);
        }


    }
}
