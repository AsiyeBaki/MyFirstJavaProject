package day37_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlocks2 {
    public static void main(String[] args) {

        System.out.println("Program 1 started.");

        int [] arr = {1,2,3,4};


        try{
            System.out.println(arr[1000]);
        } catch (RuntimeException e){
            e.printStackTrace(); // displays the full details of exception after the execution of the program
            // such as :
            //
            // java.lang.ArrayIndexOutOfBoundsException: Index 1000 out of bounds for length 4
            //	at day37_exceptions.TryCatchBlocks2.main(TryCatchBlocks2.java:12)
        }

        System.out.println("Program 1 ended.");
        System.out.println("-------------------------------------------");

        System.out.println("Program 2 started.");

        try{
            System.out.println(9/0);
        } catch(RuntimeException e){
            e.printStackTrace();
        }

        System.out.println("Program 2 ended.");


        System.out.println("------------------------");

        System.out.println("Program 3 started.");
/*
        try{
            FileInputStream file = new FileInputStream("File Patch");
        } catch(FileNotFoundException e) {
            throw new RuntimeException(e);
        }

 */
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Program 3 ended.");
    }
}
