package day20_forEach;

import java.util.Arrays;

public class ArrayUtilityMethods {
    public static void main(String[] args) {

        int[] score = {70, 100, 80, 90, 65};

        System.out.println(Arrays.toString(score));

        String result = Arrays.toString(score); // display of the array object
        System.out.println(result);
        System.out.println("-----------------------");

        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {1, 2, 3, 4, 5};
        boolean r1 = Arrays.equals(a1, a2);  // return you boolean,true
        System.out.println(r1); // true

        char[] ch1 = {'A', 'B', 'C'};
        char[] ch2 = {'A', 'C', 'B'};
        boolean r2 = Arrays.equals(ch1, ch2); // false
        System.out.println(r2);

        String[] s1 = {"A", "B", "C"};
        String[] s2 = {"A", "C", "B"};
        System.out.println(Arrays.equals(s1, s2)); // false

        System.out.println("-----------------");

        int[] nums = {100, 80, 90, 75, 88, 75, 88, 99, 0, 5, 4, 1000, 500};

        System.out.println(Arrays.toString(nums));

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        System.out.println("Minimum number: " + nums[0]);
        System.out.println("Maximum number: " + nums[nums.length - 1]);

        /*
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (min > nums[i]) {
                min = nums[i];
            }
        }
        System.out.println("Minimum: "+min);

         */

        System.out.println("---------");

        String[] b1 = {"C", "A", "B"};
        String[] b2 = {"B", "C", "A"};

        Arrays.sort(b1); // b1 = {A,B,C)
        Arrays.sort(b2);//  b1 = {A,B,C)
        System.out.println(Arrays.equals(b1, b2));
        System.out.println("---------------------");

        String[] students = {"Yaxier", "MAdiyar", "ALi", "Abidullah", "Alina"};

        System.out.println(Arrays.toString(students));

        Arrays.sort(students);

        System.out.println(Arrays.toString(students));
        System.out.println("--------------");

        int[] array = {10, 20, 30, 40, 50, 60, 70};
        int[] array2 = Arrays.copyOf(array, 10);
        System.out.println(Arrays.toString(array2));

        System.out.println("--------------------");

        int[] n1 = {1, 2, 3, 4, 5};
        int[] n2 = {6, 7, 8, 9, 10, 11, 12};

        int[] n3 = Arrays.copyOf(n1, n1.length + n2.length);
        // copy n1 and length of new array is n1.length + n2.length

        for (int i = 0, j = n1.length; i < n2.length; i++,j++) {
            n3[j] = n2[i];  // j is an initialization point to pull the character from n2
        }

        System.out.println(Arrays.toString(n3));

        System.out.println("---------------------");

        char [] ch  = {'A','B','C','D','E','F','G'};
        char [] result1 = Arrays.copyOf(ch,20);
        // when the new arrays length is greater than the length of array that we are coping it will give default 0 for the unassigned eleements

        System.out.println(Arrays.toString(result1));

        char [] result2 = Arrays.copyOfRange(ch,2,4);  // excludes ending index
        System.out.println(Arrays.toString(result2));

        char [] result3 = Arrays.copyOfRange(ch, 2,ch.length);

        System.out.println(Arrays.toString(result3));




    }
}
