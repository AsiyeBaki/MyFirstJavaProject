package day27_accessModifier;

public class TestAccessModifier {
    public static void main(String[] args) {


        System.out.println("-------------------------------------");

        System.out.println(AccessModifiers.publicDate); // public is always accessible in different packages
        // System.out.println(AccessModifiers.protectedData); // protected is not always accessable, we need to have subclass for protected to be able to accessible from otherpackages

        System.out.println(AccessModifiers.defaultDate);


    }
}
