package day10_stringMethods;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class ReadFilesWithScanner {
    public static void main(String[] args) throws IOException {

        // Scanner input = new Scanner();

        // to read a file
        // Path.of --> put "" --> go to the file of Text.txt --> click right/copy path/reference -->
        // then pick one of the location address(shorter one may be preferable and paste it in the ""


        Scanner scan = new Scanner (Path.of("src/day10_StringMethods/doSumTest.txt"));
        /*
        System.out.println(scan.nextLine()); // in order to print first line in doSumTest.txt file
        System.out.println(scan.nextLine()); // in order to print second line in doSumTest.txt file
        System.out.println(scan.nextLine()); // in order to print third line in doSumTest.txt file
        System.out.println(scan.nextLine()); // in order to print third line in doSumTest.txt file...
         */


        // input.nextLine() will print the entire line, as "Today is Friday"
        // vs. to input.next() will print word by word
        // if there is nothing in doSumTest.txt file it will give an error of NoSuchElementException

        /*
        System.out.println(scan.next());
        System.out.println(scan.next());
        System.out.println(scan.next());
        System.out.println(scan.next());
        System.out.println(scan.next());
         */

        // System.out.println(  scan.hasNext());

        scan.close();











    }
}
