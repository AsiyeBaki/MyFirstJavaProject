package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayArrayListConversion {

    public static void main(String[] args) {

        String[] arr1 = {"A", "B", "C", "D"};
        System.out.println(Arrays.toString(arr1)); // array

        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr1)); // arrayList

        System.out.println(list);

        System.out.println("------------------------------------");

        // biggest disadvantage of an array is size fixed. size has to be set and can not be changed after that
        // there are many methods in other structures that we can not use in array.


        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Java", "Python", "C#"));

        String[] languages = list2.toArray(new String[0]);

        System.out.println(Arrays.toString(languages));

        System.out.println("-------------------------");

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

        Integer[] n = nums.toArray(new Integer[0]);
        //int[] n = nums.toArray(new Integer[0]);  //  [1, 2, 3, 4, 5, 6, 7]
        // int[] n = nums.toArray(new Integer[0]);  // compile error
        System.out.println(Arrays.toString(n));


    }

}
