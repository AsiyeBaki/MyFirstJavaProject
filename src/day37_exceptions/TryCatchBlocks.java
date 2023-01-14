package day37_exceptions;


import javax.management.RuntimeMBeanException;

public class TryCatchBlocks {

    public static void main(String[] args) {

        System.out.println("Program 1 started.");
        try {
            System.out.println(9 / 0); // Arithmetic Exception
            System.out.println("Try Block");
        } catch (ArithmeticException e){
            System.out.println("Catch Block");
        }
        System.out.println("Program 1 ended.");
        System.out.println("--------------------------------------");
        System.out.println("Program 2 started.");
        String str = null;

        try {
            System.out.println(str.toLowerCase());  // this is an unchecked exception. there is no way this is checked since there is no compile error.
            System.out.println("Try Block");
        } catch (RuntimeException e){ // since it is checked , regardless which specific , we could use RunTimeException as a parent of all
            //Since runtime is dedicated for exception class only , it is best to use in this case
            System.out.println("Catch Block");
        }

        System.out.println("Program 2 ended.");

        System.out.println("-----------------------------------------");

        System.out.println("Program 3 started.");



        try{
            Thread.sleep(3000);
            System.out.println("Try Block");
        } catch (InterruptedException e){
            System.out.println("Catch Block");
        }
        System.out.println("Program3 ended");







    }


}
