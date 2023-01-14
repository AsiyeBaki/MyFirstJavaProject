package day37_exceptions;


import day35_polymorphism.transportationTask.Car;

public class MultiCatchBlock {

    public static void main(String[] args) {

        System.out.println("Program1 started.");

        Car car = null;

        try {
            car.drive(); // NullPointerException
        } catch (ArithmeticException e) {
            System.out.println("First Catch Block");
            e.printStackTrace();
        } catch (ClassCastException e) {
            System.out.println("First Catch Block");
            e.printStackTrace();
        }catch (NullPointerException e) {
            System.out.println("First Catch Block");
            e.printStackTrace();
        }catch (IndexOutOfBoundsException e) {
            System.out.println("First Catch Block");
            e.printStackTrace();
        }catch (RuntimeException e){
            e.printStackTrace();
        }

        // multi try catch :
        //        parent class can not be placed before child class, parent class it should be the last one, where if we can not catch at more specific exception parent will help us.
        System.out.println("Program1 ended. ");


  /*
        try{
        }catch (RuntimeException e){
        }try{
        }try{
        }try{
        }
   */

    }

}