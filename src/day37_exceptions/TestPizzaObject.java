package day37_exceptions;

import day36_polimorphism_continue.Circle;

public class TestPizzaObject {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza('S', 2, 3);

        Pizza pizza2 = new Pizza('S', 2, 3);

        System.out.println(pizza1 == pizza2); // false

        System.out.println(pizza1.equals(pizza2)); // true
        //  if we do not give overridden equals method in Pizza class, it always will return false


        System.out.println("-------------");
        Object obj = new Pizza('L', 4, 5); //upcasting

        boolean r = obj.equals(pizza2);

        System.out.println(r); // true

        double total =  ( (Pizza)obj).calculateCost();

        System.out.println(total); // 24.0

        // double area = ( (Circle)obj ).area();  // you would not get an error though, we you run it you will get an ClassCastException
        // since pizza and circle has no IS A relationship

        //   System.out.println(area);

        System.out.println("Test Completed");



    }
}
