package day14_overloadingMethod_loops;

public class MethodOverloadingIntro {

    public static void main(String[] args) {

        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20, 30));
        System.out.println(sum(10, 20, 30, 40));
        System.out.println(sum(1.5, 2.5));
        System.out.println(sum(2.3, 5.6, 1.2, 4.5));
        System.out.println(sum(10, 20.5));
    }

    //    public static void methodA() {
//    }
//
//    public static void methodA(int a) {
//    }
//
//    public static void methodA(double b) {
//    }
//
//    public static void methodA(int a, int b) {
//    }
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static int sum(int num1, int num2, int num3) {
        return sum(num1, num2) + num3;
    }

    public static int sum(int num1, int num2, int num3, int num4) {
        return sum(num1, num2, num3) + num4;
    }

    public static double sum(double num1, double num2) {
        return num1 + num2;
    }

    public static double sum(double num1, double num2, double num3) {
        return sum(num1, num2) + num3;
    }

    public static double sum(double num1, double num2, double num3, double num4) {
        return sum(num1, num2, num3) + num4;
    }

}
