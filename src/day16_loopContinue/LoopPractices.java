package day16_loopContinue;

import java.util.Scanner;

public class LoopPractices {
    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) {
            System.out.println("Hello" + i);
        }
        System.out.println("------------------");
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello" + i);
        }

        System.out.println("-------------");

        int j = 0;
        while (j < 5) {
            System.out.println("Hello" + j);
            j++;
        }
        System.out.println("-------------------");

        int k = 0;

        do {
            System.out.println("Hello"+k);
            k++;
        } while (k < 5);

        System.out.println("----------------------");


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your score");
        int score = scan.nextInt();

        while (score < 0 || score > 100) {
            System.out.println("Invalid score! Please re-enter your score");
            score = scan.nextInt();
        }

        if (score >= 60) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }













    }
}
