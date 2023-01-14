package day19_arraysIntro;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {

        String[] myGroup = new String[5];

        myGroup[0] = "Gulcin";
        myGroup[myGroup.length-1] = "Aseel";
        myGroup[2] = "Sumeyye";
        myGroup[1] = "Abidullah";
        myGroup[3] = "Kheshayar";

        System.out.println(Arrays.toString(myGroup));

        myGroup[1] = "Kuzzet";
        // myGroup[5] = "Muhtar"; // at most can be 4

        System.out.println(Arrays.toString(myGroup));
        System.out.println("-------------------------");

        for (int i = myGroup.length - 1; i >= 0; i--) {
            System.out.println(myGroup[i]);
        }
        System.out.println("--------------------------");







    }
}
