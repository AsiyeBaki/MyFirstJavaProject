package day19_arraysIntro;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {


        int[] numbers = {100, 20, 500, 40, -10, 30};

        int max = numbers[0]; // just temporarily consider the first number is the max number
        // then we put if condition into loop to replace the bigger number with first number to reach to max number

        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.println("max = " + max);




    }
}
