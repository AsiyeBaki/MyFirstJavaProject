package utilities;

import day27_accessModifier.AccessModifiers;
import day27_accessModifier.Data;

import java.util.Arrays;


public class Test {
    public static void main(String[] args) {
        System.out.println(Data.d);
        System.out.println(Data.e);
        System.out.println(Data.f);

        Data.method3();
        Data.method4();

        Data obj = new Data();

        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);

        obj.method1();
        obj.method2();

        System.out.println("-------------------------------------");

        System.out.println(AccessModifiers.publicDate); // public is always accessible in different packages
        // System.out.println(AccessModifiers.protectedData); // protected is not always accessable, we need to have subclass for protected to be able to accessible from otherpackages

        // System.out.println(AccessModifiers.defaultDate); // default is never accessible in different packages

        // System.out.println(AccessModifiers.privateData); // only accessible within the same class



    }
}




