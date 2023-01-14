package day13_customMethodsContinue;

import java.util.Scanner;

public class ReturnStatementPractice {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        // double n2 = input.close();  // this wont return you a value because it is void

        // String word = System.out.println("Hello");
        // out println ... are void methods, thats we can not use them to get a return


        System.out.println("--------------------------");

//        int month = new Scanner(System.in).nextInt();
//
//        if (month < 1 || month > 12) {
//            System.out.println("Invalid number");
//            return; // terminates the main method
//        }
//
//        switch (month) {
//            case 2:
//            System.out.println("28 days");
//            break;
//            case 4: case 6: case 9: case 11:
//                System.out.println("30 days");
//            default:
//                System.out.println("31 days");
//        }
        System.out.println("-------------------------");

//        int number = new Scanner(System.in).nextInt();
//
//        if (number < 1 || number > 7) {
//            System.err.println("Invalid Number: " + number);
//            return; // exit the main method
//        }
//        System.out.println((number == 1) ? "Monday"
//                : (number == 2) ? "Tuesday" : (number == 3) ? "Wednesday"
//                : (number == 4) ? "Thursday" : (number == 5) ? "Friday"
//                : (number == 6) ? "Saturday" : "Sunday");
        System.out.println("--------------------------");

//        char grade = new Scanner(System.in).next().charAt(0);
//        boolean isValid = grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F';
//        if (!isValid) { // if the great is not valid
//            System.err.println("Invalid grade");
//            return;  // terminates the main method if invalid grade, will not be executed after
//        }
//        System.out.println((grade == 'A') ? "Excellent" : (grade == 'B') ? "Great Job" : (grade == 'C') ? "Good"
//                : (grade == 'D') ? "Passed" : "Failed"); // java is case sensitive language
    }

}
