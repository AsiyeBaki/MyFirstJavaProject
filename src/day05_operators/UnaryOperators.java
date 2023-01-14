package day05_operators;

public class UnaryOperators {
    public static void main (String[] args){

        //pre increment and decrement operators

        int x = 10;  // x is operand ++ is operator

        System.out.println(++x); //11
        System.out.println(x); //11

        // it immediately passes the new value, so changes the value immediately.
        // it means; after we used ++ operator new memory is 11
        // and prints 11 when you print x

        int y = 100;
        System.out.println(--y); //99
        System.out.println(y); //99

        System.out.println("------------");

        // post increment and decrement operators
        // it does NOT change immediately. first, it will pass the old value.
        // then it will change it in next step.

        int a = 50;

        System.out.println(a++); //50
        System.out.println(a); //51

        int b = 25;

        System.out.println(b--);  //25
        System.out.println(b);   //24

        int n = 30;
        int m = n++;  //  m=30, n=31

        System.out.println("n = " + n);
        System.out.println("m = " + m);

        int z = 60;
        int q = z--; //  q= 60, z=59

        System.out.println("z = " + z);
        System.out.println("q = " + q);







    }
}
