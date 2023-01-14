package day16_loopContinue;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String answer = "yes";
        // or (true) as a second way
        while (answer.equals("yes")) {
            System.out.println("Enter a number");
            int number = scan.nextInt();

            if (number % 2 == 0) {
                System.out.println("is an even number");
            } else {
                System.out.println(" is an odd number");
            }

            System.out.println("Would you like to enter another number? Yes/No");
            answer = scan.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))){
                System.err.println("Invalid entry! Would you like to enter another number? Yes/No");
                answer = scan.next().toLowerCase();
            }

            if (answer.equals("no")){
                break;
            }
        }





    }
}
