package day09_scanner;

import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);  // for reading user inputs

        System.out.println("Enter a number: ");
        byte number = input.nextByte(); // it will run only for the integer numbers in byte range

        System.out.println("You entered: " + number);

        System.out.println("-----------------");


        Scanner input2 = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        byte num1 = input.nextByte();  // since implicit casting, it can be any, such as int byte, int, long, double, float

        System.out.println("Enter your second number: ");
        short num2 = input.nextShort();

        System.out.println("Enter your third number: ");
        int num3 = input.nextInt();

        System.out.println("Enter your forth number: ");
        long num4 = input.nextLong();

        input.close(); // scanner is closed, can not read user inputs again

        // it will give an error to print fifth number and the statements after it,
        // since scanner is closed at line 33

        // input.reset() <-- this is one of the ways to reopen it, BUT it will not let you do it after certain times

        /*
        System.out.println("Enter your fifth number: ");
        double num5 = input.nextDouble(); // or float, float num3 = input.nextDouble();

        System.out.println("Enter your sixth number: ");
        float num6 = (float) input.nextDouble();

         */


        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
        System.out.println("Third number: " + num3);
        System.out.println("Forth number: " + num4);
       // System.out.println("Fifth number: " + num5);
       // System.out.println("Sixth number: " + num6);













        /*
        SCANNER METHODS

        nextByte()
        nextShort()
        nextInt()
        nextLong()
        nextFloat()
        nextDouble()
        nextBoolean()
        next()
        nextLine()


        //        IMPORT STATEMENT
        //import java.util.Scanner; <-- regular import
        // import java.util.*;       <-- wild import
        // using wild import is like; buying entire grocery store instead of one item like cherry the only item you need
        // it costs more memory and it is not rational, Scanner helps us to pull specific files
        // import statement: used for importing one java file to another
        // regular import: imports one single class from a package
        // import package.className
        // wild import: imports whole package
        // import package.*;
         */

    }

}
