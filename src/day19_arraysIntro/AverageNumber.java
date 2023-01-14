package day19_arraysIntro;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        // Task -- find the average number
        // Ask the user how many numbers they want to enter
        // get all the inputs from to user to store them in to an array
        // Iterate the array and return the average number

        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter?");
        int total = input.nextInt();

        int [] numbers = new int[total];
        int sum = 0;

        for (int i = 0; i < total; i++) {
            System.out.println("Enter a number: ");
            numbers[i] = input.nextInt(); // it will display it all
            sum += numbers[i];
        }
        double average = sum / (double)total; // if we do not cast it to double result will be 10.0 since it is giving an integer number

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Numbers : " + Arrays.toString(numbers));
        System.out.println("sum = " + sum);
        System.out.println("average = " + df.format(average));




    }
}
