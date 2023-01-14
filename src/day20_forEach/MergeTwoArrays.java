package day20_forEach;

import java.util.Arrays;
import utilities.ArraysUtility;

public class MergeTwoArrays {
    public static void main(String[] args) {
// write a program that can merge 2 arrays with
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7};

        int[] arr3 = new int[arr1.length + arr2.length];  // to make sure that 3rd array will have enough capacity

        int k = 0; // for third array's index number

        for (int i = 0; i < arr1.length; i++, k++) { // i: for first array's index numbers
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) { // i: for second array's index numbers
            arr3[k] = arr2[i];
        }
        System.out.println(Arrays.toString(arr3));




        System.out.println("---------------------");

// with merge method where is in utilities package ArraysUtility class

        int[] a1= {10,20,30,40,50,60};
        int[] a2= {70,80,90};
        int[] a3 = ArraysUtility.merge(a1,a2);
        System.out.println(Arrays.toString(a3));
        
        
        double[] d1= {10.0,20.1,30.3,40.60,50.0,60.2};
        double[] d2= {70,80,90};
        double[] d3 = ArraysUtility.merge(d1,d2);
        System.out.println(Arrays.toString(d3));
        
        
        char[] c1= {'A','B','c','D','e','F'};
        char[] c2= {'X','y','Z'};
        char[] c3 = ArraysUtility.merge(c1,c2);
        System.out.println(Arrays.toString(c3));
        
        
    }
}
