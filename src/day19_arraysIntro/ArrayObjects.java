package day19_arraysIntro;

import java.util.Arrays;

public class ArrayObjects {
    public static void main(String[] args) {

        /*
        int [] arr1 = {10,20,30,40,50};
        int [] arr2 = arr1;  // assigned first array object to an array variable
        int [] arr3 = arr2;
        // 3 variables, only 1 object

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

        // they will return the same result 10,20,30,40,50]; since there is only one object
         */

        int [] arr1 = {10,20,30,40,50};
        int [] arr2 = arr1;
        int [] arr3 = arr2;

        arr1 [0] = 1000;
        arr1 [2] = 3000;

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

        System.out.println("-------------------");

        String [] a1 = {"Umran", "Mehmet"};

        a1 = new String[]{"James","Daniel"};


        System.out.println(Arrays.toString(a1));




    }
}
