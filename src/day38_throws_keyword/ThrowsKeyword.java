package day38_throws_keyword;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword {
    public static void main(String[] args) throws InterruptedException, FileNotFoundException {


        /*
        System.out.println("Program1 Started.");
        // System.out.println(100/0); // throws keyword will not work for this since it is not checked exception

        try
        {Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Program1 ended.");

        System.out.println("----------------------------------");
        System.out.println("Program2 Started.");
        // System.out.println(100/0); // throws keyword will not work for this since it is not checked exception

        try
        {Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Program2 ended.");

         */

        System.out.println("Program1 started.");
        Thread.sleep(5000);
        System.out.println("Program1 ended.");
        System.out.println("---------------------");
        System.out.println("Program2 started.");
        Thread.sleep(5000);
        System.out.println("Program2 ended."); System.out.println("---------------------");
        System.out.println("Program3 started.");
        FileInputStream file = new FileInputStream(""); // giving FileNotFoundException
        System.out.println("Program3 ended.");

    }
}
