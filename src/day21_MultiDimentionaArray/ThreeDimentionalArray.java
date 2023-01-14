package day21_MultiDimentionaArray;

import java.util.Arrays;

public class ThreeDimentionalArray {
    public static void main(String[] args) {

        int[][] arr2D1 = {{1, 2}, {3, 4, 5}};
        int[][] arr2D2 = {{6, 7, 8, 9}, {10, 11}, {12, 13, 14}};
        int[][] arr2D3 = {{15, 16, 17}};

        int[][][] arr3D = {   {{1, 2}, {3, 4, 5}}, {{6, 7, 8, 9}, {10, 11}, {12, 13, 14}},{{15, 16, 17}}   };

        System.out.println(Arrays.deepToString(arr3D)); // [[[1, 2], [3, 4, 5]], [[6, 7, 8, 9], [10, 11], [12, 13, 14]], [[15, 16, 17]]]
        System.out.println(Arrays.deepToString(arr3D[1])); // 6,7,8,9,10,11,12,13,14

        System.out.println(Arrays.toString(arr3D[0][1])); // 3,4,5
        System.out.println(Arrays.toString(arr3D[1][0])); // 6,7,8,9

        System.out.println(arr3D[1][0][2]);//8
        System.out.println(arr3D[2][0][1]);//16
        System.out.println("-------------------------------------");

        for (int i = 0; i < arr3D.length; i++) { // i: index of number of each 2 dimentional array
           int [][] each2DArray = arr3D[i];
            System.out.println(Arrays.deepToString(each2DArray));
            for (int j = 0; j < each2DArray.length; j++) { // j: index number of each 1  dimentional array
                int[] eachSArray = each2DArray[j];
                System.out.println(Arrays.toString(eachSArray));
                for (int k = 0; k < eachSArray.length; k++) { // k: index number of each
                    int eachElement = eachSArray[k];
                    System.out.println(eachElement);
                }
            }
        }
    }
}
