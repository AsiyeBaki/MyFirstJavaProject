package day16_loopContinue;

import java.util.Scanner;

public class LogIn_secondMethod {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String userName, password;

        int attempt = 3;

        do {
            System.out.println("Enter your user name");
            userName = scan.next();

            System.out.println("Enter your password");
            password = scan.next();

            attempt--;
            if (attempt == 0) {
                break;
            }
        } while (!((userName.equals("Cydeo")) && (password.equals("WoodenSpoon"))));




    }
}
