package day04_concatenation;

public class ArithmeticOperator {
    public static void main(String[] args) {

        /*
        addition

        modulus
        remainder: numerator - (denominator * integer result)


        Concatenation:
            "text" + "text"
            any data + "text"
            "text" + any data
        Addition:
            any data + any data

        in math : 20/6 = 3.3333....
        in Java : 20/6 = 3

        int / int ====> int value
        int / double ====> double
        double /  int ====> double
         */

        System.out.println(100+200);
        System.out.println(40-100);
        System.out.println(100/4);
        System.out.println(20/6);
        System.out.println(20 % 6);

        System.out.println("--------------");

        System.out.println(50 / 6);
        System.out.println(50 / 6.0);
        System.out.println(50.0 / 6);
        System.out.println(50d / 6);
        System.out.println("--------------");

        System.out.println((int)(2.5/0.5));

        // System.out.println(9/0);    zero can not be use for division

        System.out.println(10*2);
        System.out.println(20*12);









    }
}
