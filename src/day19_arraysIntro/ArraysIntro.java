package day19_arraysIntro;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        int score1 = 85;
        int score2 = 75;
        int score3 = 88;
        int score4 = 95;
        int score5 = 100;

        System.out.println("-----------------");

        int [] scores =  new int [5];

        scores[2] = 78;
        scores[0] = 85;
        scores[1] = 75;
        scores[3] = 88;
        scores[4] = 95;

        // scores [6];
        // scores [-1];
        // scores = new int [10];  // index: 0-9
        // scores = new int [50];  // index: 0-49

        System.out.println(Arrays.toString(scores));

        System.out.println(scores[2]);

        System.out.println("-----------------------");

        scores = new int [10];

        for (int i = 0; i < scores.length; i++) {   // i index number of scores array
            System.out.println(scores[i]);
        }

    }



}
