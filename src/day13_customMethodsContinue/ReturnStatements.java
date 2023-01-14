package day13_customMethodsContinue;

public class ReturnStatements {
    public static void main(String[] args) {

        eligibleToBuyAlcohol(-15);
        System.out.println("------------------");

        boolean exit = true;
        if (exit) {
            return; // main method gets terminated
        }

        System.out.println("doSumTest Completed");
        System.out.println("doSumTest Started");

    }

    public static void eligibleToBuyAlcohol (int age) {

        if ( age < 0 || age > 150) {
            System.out.println("Invalid age: " + age);
            return;  // exits this method
            // return 10; // when you give a value (10), it will give an error because it is void,
        }



        if (age >= 21) {
            System.out.println("You are eligible to buy alcohol");
        } else {
            System.out.println("You are NOT eligible to buy alcohol");
        }



    }

    public static int multiplication (int n1, int n2) {

        int result = n1 * n2;

        return result; //  return;  if it is not void, you MUST give a value
        // return 10; // when you give a value (10), it will give an error because it is void,
    }

}
