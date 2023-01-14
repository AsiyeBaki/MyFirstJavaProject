package day10_stringMethods;


import java.util.Scanner; // you have to give this import to Scanner otherwise will give you compiler
import java.lang.String;  // you don't have give this import to String

public class StringIntro {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = "Java";

        System.out.println();

        input.close();

        System.out.println("---------------");

        String s1 = "Cat";
        String s2 = "Dog";

        String s3 = "Cat";
        String s4 = "Cat";
        System.out.println(s1==s3);  // true
        System.out.println(s1==s4);  // true
        System.out.println(s3==s4);  // true
        System.out.println(s1==s2);  // false

        System.out.println("------------------");

        String t1 = "Python";
        String t2 = new String("Python");









    }
}
