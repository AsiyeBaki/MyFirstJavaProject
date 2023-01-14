package day19_arraysIntro;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysLiteral {
    public static void main(String[] args) {

        int [] numbers = new int[5];

        int [] nums = {10,20,30,40,50};  // when you ONLY know what the exact arguments are

        System.out.println(numbers.length);
        System.out.println(nums.length);

        System.out.println("numbers = " + Arrays.toString(numbers));
        System.out.println("nums = " + Arrays.toString(nums));


        System.out.println("-----------------------");
        // element            1         2           3           4          5        6           7
        String [] days = {"Monday", "Tuesday","Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        //index               0           1           2           3          4        5           6
        int n = 4;
        System.out.println(days[n-1]);

        String [] months = {"January", "February", "March", "April","May", "June", "July", "August", "September", "October", "November","December"};

        System.out.println("month = " + Arrays.toString(months));

        System.out.println("-----------------------------");

        // int [] numbers2  = new int[100];

        for (int i = months.length - 1; i >= 0; i--) {
            System.out.println(months[i]);
        }



    }
}
