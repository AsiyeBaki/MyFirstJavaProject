package day15_whileLoop;

public class BreakStatement {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(i);  // if print statement has placed before if statement 6 also will be executed
            if (i == 6){
                break;
            }
            // System.out.println(i); // if print statement has placed after if statement 6  will NOT be executed

        }

        System.out.println("----------------------");

        for (char i = 'A'; i <= 'Z'; i++) {
            // System.out.println(i);  // if print statment has placed before if statement, J also will be executed
            if ( i == 'J') {
                break;
            }
            System.out.println(i);   // if print statement has placed after if statement J will NOT be executed
        }
        System.out.println("-----------------------");

        for(;;) {
            System.out.println("Hello");
            break;
            // System.out.println("World");  you can not give this printing after, it will give you an error
        }




    }
}
