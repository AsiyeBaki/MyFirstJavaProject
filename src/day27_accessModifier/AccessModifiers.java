package day27_accessModifier;

public class AccessModifiers {

    public static int publicDate = 200; // accessible to :  always within packages and classes
    protected static int protectedData = 300; // accessible to : depends on how we create it, it may be accessible to other packages , sometimes not
    static int defaultDate; // accessible to : only within same package
    private static int privateDate = 500; // accessible to : only for its class

    public AccessModifiers() {
        // What happens when we give different types of access modifiers to the constructor?
        // public , protected, default, private     since default does not have a keyword,
        // when you do not have anything, it means default so not accessible otherwise of the package
        // restrictive
    }

    public static void publicMethod() {
        System.out.println("Public");
    }

    protected static void protectedMethod() {
        System.out.println("Protected");
    }

    static void defaultMethod() {
        System.out.println("Default");
    }

    private static void privateMethod() {
        System.out.println("Private");
    }


    public static void main(String[] args) {
        System.out.println(publicDate);
        System.out.println(protectedData);
        System.out.println(defaultDate);
        System.out.println(privateDate);
    }


}
