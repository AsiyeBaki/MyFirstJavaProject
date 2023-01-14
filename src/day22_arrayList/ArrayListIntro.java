package day22_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntro {
    public static void main(String[] args) {

        int[] array = new int[5];

        array[0] = 10;
        array[1] = 20;
        System.out.println(Arrays.toString(array));
        //          DataType
        ArrayList < Integer > name = new ArrayList<Integer>();
        //         mandatory                       optional    // DataType of ArrayList can not be a primitive


        System.out.println("------------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list); // []
        System.out.println(list.size());  // 0




    }
}
