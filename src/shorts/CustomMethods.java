package shorts;

import day34_interface.animalTask_interface.Animal;
import day34_interface.animalTask_interface.Dog;

import java.util.Arrays;
import java.util.Scanner;

public class CustomMethods {
    public static void main(String[] args) {

        int[][] arrr = {{1,2,3},{3,4}};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(arrr[i][j]+" ");
            }
        }
//
//        int integer = 100;
//        double duble = 123;
//        float floty = 123;
//
//        integer =floty;  // compile error
//        floty = integer ;
//        duble=floty;
//        floty=duble; //compile error
//        duble = integer;
//        integer=duble; // compile error


/*
        Scanner scan = new Scanner(System.in);
        double[] temps = {scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble()};

        // Do not touch above. Use array temps

        // from saim: please update to use a loop to have a different sized arrays

        double average = 0.0;
        double sum = 0.0;

        for (int i = 0; i < temps.length; i++) {
            double eachNumber = temps[i];
            sum += eachNumber;
            average = sum / temps.length;
        }
        System.out.println(average);



 */
        System.out.println("--------------------------");

        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextLine();
        }
       // WRITE YOUR CODES BELOW:

        System.out.println(Arrays.toString(arr));

        String[] reversed = new String[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] += arr[i];
        }

        System.out.println(Arrays.toString(reversed));


/*
        System.out.println("----------------------------");

        String str = "dogcat dogcatoku ildog";
        int dogCount = 0;
        int catCount = 0;
        boolean isEqual = false;


        for (int i = 0; i < str.length(); i++) {
            if (str.contains("dog")) {
                dogCount++;
            }
            if (str.contains("cat")) {
                catCount++;
            }
            if (dogCount == catCount) {
                System.out.println(isEqual);
            }
        }


        displayMessage();
    }

    public static void displayMessage() {

        System.out.println("Hello World");
        System.out.println("I love Java");



 */

    }
}