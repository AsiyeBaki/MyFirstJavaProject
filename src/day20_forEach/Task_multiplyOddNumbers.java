package day20_forEach;

import java.util.Arrays;

public class Task_multiplyOddNumbers {
    public static void main(String[] args) {
        /*
        write a program that can multiply each odd number of an integer array by 2
        given       array = [1,2,3,4,5]
        output      array = [2,2,4,6,10]
         */
        int[] numbers = {1, 2, 3, 4, 5, 7, 8, 9, 10};

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 == 0) {
                continue;
            }
            numbers[i] = 2 * numbers[i];
        }
        System.out.println(Arrays.toString(numbers));


    }
}
