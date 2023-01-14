package day15_whileLoop;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

      /*  if(true){
            System.out.println("Hello World");
        }

        System.out.println("-----------------------------");

        while(true){
            System.out.println("Hello Cydeo");
        }
       */ // intro

        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = input.nextInt();

// while loop whenever you need a condition that needs to be checked unknown times

        while( ! (age >= 1 && age <= 150 ) ) {
            System.err.println("Invalid Entry! Please re-enter your age");
            age = input.nextInt();
        }

        if(age >= 21) {  // whenever there is a valid age, will be executed
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }
        input.close();


         */ //  while loop ex: with age

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = input.nextInt(); //valid age: 1~120

        while( ! (age >=1 && age <= 120)  ) {  // while the age is not valid
            System.err.println("Invalid Entry, Please re-enter your age");
            age = input.nextInt();
        }

        System.out.println("Are you a US citizen? yes/no");  //YES
        String yesOrNo = input.next().toLowerCase();

        while( ! (yesOrNo.equals("yes")) || yesOrNo.equals("no") ) {  // while the answer is neither yes nor no
            System.err.println("Invalid Entry! Please re-enter");
            System.err.println("Are you a citizen? yes/no");
            yesOrNo = input.next().toLowerCase();
        }

        if (age >= 21 && yesOrNo.equals("yes")) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }
        input.close();


    }
}
