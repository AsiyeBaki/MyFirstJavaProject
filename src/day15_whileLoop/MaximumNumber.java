package day15_whileLoop;

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int max = -2147483648;   // <-- this number is min integer number in java
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number:");
            int num = input.nextInt();  // -10,5,3,20,15

            if (num > max) {
                max = num;
            }
        }
        System.out.println("Maximum number is: " + max);

        input.close();
// for loop is the best use when you know iteration number
// loop condition has to be true in order to run


    }

}