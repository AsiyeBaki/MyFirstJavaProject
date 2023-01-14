package day05_operators;

public class ShorthandOperators {
    public static void main(String[] args) {

        // assignment operator
        int a = 20;

        System.out.println( a ); //20

        System.out.println( a ); //20

        a = 40;
        System.out.println( a );
        a = 90;

        System.out.println(a);
        System.out.println("---------------");

        // addition assignment operator

        double balance = 100;

        balance += 1000;  // balance = 100+1000

        System.out.println("balance = " + balance);

        balance += 500;   // balance = 11000+500 = 1600

        System.out.println("balance = " + balance);

        balance += 10000; // balance = 1600+10_000

        System.out.println("balance = " + balance);

        // subtraction assignment operator

        balance -= 1000;
        System.out.println("balance = " + balance);

        balance -= 5000;

        System.out.println("balance = " + balance);

        System.out.println("---------------------");
        // Multiplication assignment operator

        double salary = 45000;
        salary *= 2;   // salary = 45000 * 2 = 90_000

        salary *= 3; // salary = 90_000 * 3 = 270000

        System.out.println("salary = " + salary);

        double eth = 4;

        eth *= 250;
        System.out.println("eth = " + eth);

        System.out.println("----------------------");
        // division assignment operator

        eth /= 2;
        System.out.println("eth = " + eth);

        salary /= 2;
        System.out.println("salary = " + salary);

        System.out.println("------------------------");
        // remainder assignment operator

        int b = 39;
        b %= 7;   // b = 39 % 7
        System.out.println("b = " + b);









    }
}
