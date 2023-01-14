package day03_variables;

public class PrimitiveDataTypesIntro2 {
    public static void main(String[] args) {

        //DataType variableName = Data;

        /*
        int : for integer numbers
        double : for decimal numbers
        char : for single characters
        boolean : for True or False expressions
         */

        char a = '@';
        System.out.println(a);

        char b = '!';
        System.out.println(b);

        // char ab = 'ab'; only for single characters


        System.out.println("-------------");

        char ch1 = 'A';
        char ch2 = 65;  // look at the ASCII table  A is 65, B is 66

        System.out.println(ch1);
        System.out.println(ch2);

        char ch3 = 40000;
        System.out.println(ch3);


        System.out.println("-------------------");


        int sum = 'A' + 'B';

        //          65 + 66 = 131

        System.out.println(sum); // will print it as 131


        // char ch4 = -100;

        // boolean r1 = 123;
        // boolean r2 = 2.5;
        // boolean r3 = "Java";

        boolean r4 = true;
        boolean r5 = false;

        System.out.println(r4);
        System.out.println(r5);

        boolean r6 = 100 > 10;   // true
        boolean r7 = 0 < -1;     // false
        System.out.println(r6);
        System.out.println(r7);


    }
}
