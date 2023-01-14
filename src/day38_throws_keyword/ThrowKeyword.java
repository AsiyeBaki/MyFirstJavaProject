package day38_throws_keyword;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {

    public static void main(String[] args) {

        System.out.println("Enter your age");
        int age = new Scanner(System.in).nextInt();

        if (age < 0 || age > 150) {
            // System.out.println("Invalid age");
            // System.exit(1);
            if (age <= 0) {
                throw new InputMismatchException("Age of the person can not be set to zero or negative: " + age);
            } else {
                throw new InputMismatchException("Age of the person can not set to greater than 150: " + age);

            }
        }

        if (age >= 21){
            System.out.println("Eligible");
        } else {
            System.out.println("Not eligible");
        }
        System.out.println("---------------------------------------");

        //throw new RuntimeException("Runtime Exception");
       // System.out.println("Hello World"); // you can not give any statement after throw

        try {
            throw new FileNotFoundException("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("--------------");

        RuntimeException exception = new RuntimeException();

       // throw exception;
       // throw new RuntimeException();

        // throw new Person("Jimmmy", 55, 'M'); // it has to be an exception, has to be child of Throwable


    }
}
