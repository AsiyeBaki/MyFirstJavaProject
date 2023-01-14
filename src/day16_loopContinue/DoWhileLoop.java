package day16_loopContinue;

public class DoWhileLoop {
    public static void main(String[] args) {

        boolean condition =false;


        for (; condition ; ) {
            System.out.println("For Loop");
        }
        System.out.println("----------------------");

        while (condition) {
            System.out.println("While Loop");
        }
        System.out.println("-----------------------");

        do {
            System.out.println("Do-while Loop");
        } while (condition);





    }
}
