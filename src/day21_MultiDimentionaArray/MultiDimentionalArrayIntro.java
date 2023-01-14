package day21_MultiDimentionaArray;

import java.util.Arrays;

public class MultiDimentionalArrayIntro {
    public static void main(String[] args) {
        /* used to containing arrays
        int [][] array2D = new int[3][];

        int [][] array2D = {{1,2},{3,4,5},{6,7,8,9}}
         */
        int[] arr1 = {10, 20, 30};
        int[] arr2 = {40, 50, 60, 70, 80};
        int[] arr3 = {90, 100};
        int[] arr4 = {1000, 2000};

        System.out.println("--------------");

        int[][] arr2D = {{10, 20, 30}, {40, 50, 60, 70, 80}, {90, 100}};
        // index:            0                 1                2
        System.out.println("length of the multi dimentional array: "+arr2D.length);

        System.out.println(Arrays.toString(arr2D[1]));
        System.out.println(Arrays.toString(arr2D[0]));
        System.out.println(Arrays.toString(arr2D[2]));
        System.out.println(arr2D[2][1]);
        System.out.println(arr2D[1][2]);





    }
}

