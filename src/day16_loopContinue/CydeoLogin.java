package day16_loopContinue;

import java.util.Scanner;

public class CydeoLogin {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Enter your user name");
        String userName = scan.next();

        System.out.println("Enter your password");
        String password = scan.next();

        if (userName.equals("Cydeo") && (password.equals("WoodenSpoon"))) { // if the credentials are correct
            System.out.println("Logged-in");
        } else { // otherwise
            for (int i = 0; i < 3; i++) {

                if (i != 2) {
                    System.err.println("Incorrect username or password. Please re-enter.");
                } else {
                    System.err.println("This is your last chance. Please enter your username and password");
                }
                System.out.println("Enter your user name");
                userName = scan.next();

                System.out.println("Enter your password");
                password = scan.next();

                if (userName.equals(("Cydeo")) && (password.equals("WoodenSpoon"))) { // after al three attempts. if the username and password are still incorrect, we vgive this condition
                    System.out.println("You are now logged-in");
                    break;
                }

            }

            if (!((userName.equals("Cydeo")) && password.equals("WoodenSpoon"))) {
                System.err.println("Your account is locked. Please contact with support team");
            }

        }
        scan.close();

    }

/*
1. Create a class named CydeoLogIn. you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: WoodenSpoon
        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow
                the user to have three attempts to enter correct credentials
                if all three attempts are failed, then print "Your account is lucked."
 */

}
