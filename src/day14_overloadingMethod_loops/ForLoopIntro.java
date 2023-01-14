package day14_overloadingMethod_loops;

import java.util.Scanner;

public class ForLoopIntro {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = 0;

        for (int i = 0; i < 5; i++) {

            System.out.println("Enter a number");
            sum += input.nextInt();
        }

        System.out.println("sum: " + sum);

        // write a program that can ask the user enter to enter a number for five times, print the maximum number

        for (int i = 0; i < 5; i++) {

        }

        // write a program that can ask the user enter to enter a number for five times, print the maximum number





//        System.out.println("------sum 1~100, A~Z , Z~A-------");
//        //sum of all the numbers 1~100
//
//        int sum = 0;   // this is a trick. if you add any number to 0, you will get the number
//        for (int i = 1; i <= 100; i++) {
//            sum += i;
//        }
//        System.out.println(sum);
//
//        // print all the alphabet letters A~Z
//
//        for (char i = 'A'; i <= 'Z'; i++) {
//            System.out.print(i + " ");  // if you want them all next to each other use print, if you want them in new line use println
//        }
//
//
//        System.out.println();  // this is for the new line after loop
//
//        System.out.println("-------------------------");
//        for (char i = 'Z'; i >= 'A'; i--) {
//            System.out.print(i + " ");
//        }






//        System.out.println("---------------------------------------------------");
//        for (int i = 10; i >= 5; i--) {  // 10,9,8,7,6,5,4
//            System.out.println("Hello Asiye"); // 1,2,3,4,5,6 //it will be printed six times
//        }
//        System.out.println("----What happen when you give a wrong iteration------");
//        // responsibility of iterator to stop the execution
//        // i--    this iterator is useless in this example, bc it never return false, so it will print infinite times.
//        //for (int i = 5; i <= 10; i--) {  // 1-- is a wrong iterator for this, it will be printing infinite times
//        //    System.out.println("Hello Nuri");
//        //}
//
////        for(;;){
////            System.out.println("Hello Cydeo");  // this is infinite loop
////        }
//
//        // without itenary, it will not give you a compile error but it will give you a logical arror.
//        System.out.println("Hello World");


//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");

//        System.out.println("----------FOR LOOP-----------");
//
//        for (int i = 1; i < 10; i++ ) { // i: 1, 2,3,4,5,6,7,8,9,10
//            System.out.println("Hello World"); // 1,2,3,4,5,6,7,8,9 times will be printing bc condition is < 10
//            // will continue to print, it needs iteration to
//        }


    }

}
