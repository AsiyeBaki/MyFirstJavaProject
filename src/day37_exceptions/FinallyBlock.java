package day37_exceptions;

public class FinallyBlock {
    public static void main(String[] args) {

        try {
            System.out.println(9 / 0);
        } catch (RuntimeException e) {
            System.out.println("Runtime Exception has been caught");
            e.printStackTrace();
            System.exit(1);
        } finally {
            System.out.println("Finally Block"); // finally block always get executed whether it has been handled or not handled
        } // optional, we do put the codes that needs to be executed regardless







    }
}
