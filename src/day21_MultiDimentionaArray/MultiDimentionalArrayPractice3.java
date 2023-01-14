package day21_MultiDimentionaArray;

public class MultiDimentionalArrayPractice3 {
    public static void main(String[] args) {

        int[][][] arr3D1 = {   {{1, 2}, {3, 4, 5}}, {{6, 7, 8, 9}, {10, 11}, {12, 13, 14}},{{15, 16, 17}}   };
        int[][][] arr3D2 = {   {{10, 20}, {30, 40, 50}}, {{60, 70, 80, 90}, {100, 110}, {120, 130, 140}},{{150, 160, 170}}   };
        int[][][] arr3D3 = {   {{100, 200}, {300, 400, 500}}, {{600, 700, 800, 900}, {1000, 1100}, {1200, 1300, 1400}},{{1500, 1600, 1700}}   };
        
        int[][][][] arrD4D = {arr3D1, arr3D2,arr3D3 };


        for (int[][][] each3D : arrD4D) {
            for (int[][] each2D : each3D) {
                for (int[] each1D : each2D) {
                    for (int eachElement : each1D) {
                        System.out.println(eachElement);
                    }
                }
            }
        }
        
    }
}
