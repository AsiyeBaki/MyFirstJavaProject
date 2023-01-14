package day27_accessModifier;

public class StaticInitializationBlock {

    public static int a;
    public static double b;
    public static String c;

    // public static ExcelSheet sheet;
/*
    static {
        a = 100;
        b = 20.5;
        c = "I love Java";
    }

 */

    public StaticInitializationBlock() {
        a = 100;
        b = 20.5;
        c = "Java";// we never initialize the variables in the constructor,
        // not in main method
    }

 /*
    public static void main(String[] args) {
            a = 100;
            b = 20.5;
            c = "I love Java"; // it will return default values, without static block
    }

  */


}
