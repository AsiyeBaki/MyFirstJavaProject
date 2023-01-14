package day19_arraysIntro;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {

        int [] array1 = new int[100];
/*
        for (int i = 0, j = 1; i < array1.length; i++, j++) {
            array1[i] = j;
        } OR second way as

 */
        for (int i = 0; i < 100; i++) {
            array1[i] = i + 1;
        }

        System.out.println("fromTo = " + Arrays.toString(array1));

        System.out.println("---------------------");

        int [] array2 =  new int[100];

        for (int i = 0, j = 100; i < array2.length; i++ , j--) {
            array2 [i] = j;
        }  // or as a second way to do it
        for (int i = 0; i < array2.length; i++) {
            array2 [i] = 100 - i;
        }
        System.out.println("Arrays. = " + Arrays.toString(array2));

        System.out.println("------------------------");


    }
}
