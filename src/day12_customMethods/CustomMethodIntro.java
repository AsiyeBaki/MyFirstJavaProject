package day12_customMethods;

import org.w3c.dom.ls.LSOutput;

public class CustomMethodIntro {
    public static void main(String[] args) {

        System.out.println("doSumTest Started");
        greetings();                         // 6 lines of will be printed in total
        System.out.println("doSumTest Completed");
        displayMessage();
    }


    public static void greetings() {  // if you want this greetings method to be executed, it has to be in main method
        System.out.println("Hello Cydeo");
        System.out.println("How are you today?");   // this is how we declare a method
        System.out.println("Are you ready to learn Java?");
    }

    public static void displayMessage () {
        System.out.println("Hello World");
        System.out.println("I love Java");
    }
}
