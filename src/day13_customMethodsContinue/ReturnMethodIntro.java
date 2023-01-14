package day13_customMethodsContinue;

public class ReturnMethodIntro {
    public static void main(String[] args) {


//int total = sum(20, 40); // sum is a void method, does not return any value
// you wont be able to use it outside of the method IF your return type void
// if you give int you will be able to use sum outside of the method
// when you change it from void to int, it will give you an error for not putting return value
// such as return result;;

        int total = addition(10,20);  // Examples of how we can use call the method
        System.out.println(square(5));
        System.out.println(cube(5));
        int r = cube(5);
        square(12);
        cube(11);  // EX how we can use call the method




    }

    public static int addition (int n1, int n2) {
        //int result = n1 + n2;
       // return result; OR
        return n1 + n2;
    }

    public static int square (int num) {
        int square = num * num;
        return square;
    }

    public static int cube (int num) {
        int cube = square(num) * num;
        return cube;
    }



}
