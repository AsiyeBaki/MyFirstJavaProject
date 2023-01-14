package day12_customMethods;

import java.util.Scanner;

public class EmailDomain {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your email");

        String emailDomain = scan.next();

        emailDomain = emailDomain.substring(emailDomain.indexOf("@") + 1,emailDomain.lastIndexOf("."));

        System.out.println(emailDomain);

        // what if there is more than one dots?  answer: use last index


    }
}

/*
1. Create a method named emailDomain that can display the domain of the email
    Ex:
        emailDomain("Cydeo@gmail.com")

        output:
            domain: gmail
 */