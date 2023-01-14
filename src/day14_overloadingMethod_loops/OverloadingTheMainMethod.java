package day14_overloadingMethod_loops;

public class OverloadingTheMainMethod {
    public static void main(String[] args) {
        System.out.println("A");
        // only A will be printed because this main method comes from System library but
        // other main methods we created and overloaded
        // even though you can overload the main method,
        // it is useless because only main method in the main method body can execute
    }

    public static void main(int[] args) {
        System.out.println("B");
    }

    public static void main(double[]args) {
        System.out.println("C");
    }

    public static void main(boolean[]args) {
        System.out.println("D");
    }
}
