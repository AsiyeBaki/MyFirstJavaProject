package shorts;

import java.util.Scanner;

public class ScannerMethods2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a decimal number: ");

        double num = input.nextDouble();

        System.out.println("Your have entered " + num);

    }
}
