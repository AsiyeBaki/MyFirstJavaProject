package day38_throws_keyword;

import utilities.Library;

public class ThrowsKeyword2 {
    public static void main(String[] args) {

        // method1();
        Library.sleep(3.5); // since we used try and catch block when we create the sleep method in utilities packacge Library class
    }

    public static void pauseFor5Seconds() throws InterruptedException {
        Thread.sleep(5000);
    }
    public static void method1() throws InterruptedException {
        System.out.println("Hello World");
        pauseFor5Seconds(); // although we used throws in the method only for that one, as long as we call the method exception will be reoccur
        // caller of the method will be responsible for handling that exception
        System.out.println("Hello Cydeo");
        System.out.println();
    }
}
