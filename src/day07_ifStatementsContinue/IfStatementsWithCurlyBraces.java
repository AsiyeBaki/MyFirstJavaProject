package day07_ifStatementsContinue;

public class IfStatementsWithCurlyBraces {
    public static void main(String[] args) {

        int age = 32;

        if (age >= 21) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }
        System.out.println("--------------");

        if (age >= 21) System.out.println("Eligible");
        else System.out.println("Not Eligible");

        System.out.println("-----------");

        int itemNumber = 1;

        if (itemNumber == 1) {
            System.out.println("Eggs");
            System.out.println("Orange");
        } else if (itemNumber == 2) {
            System.out.println("Milk");
            System.out.println("Onion");
        } else {
            System.out.println("Apple");
            System.out.println("Cherry");
        }

            /*
        if (itemNumber == 1) {
            System.out.println("Eggs");
            System.out.println("Orange");
        } else if (itemNumber == 2)
            System.out.println("Milk");
            //System.out.println("Onion");
        } else {
            System.out.println("Apple");
            System.out.println("Cherry");

            // if there is more than one,  use curly braces are MUST

            */


        int day = 2;   // 1 ~ 7
        // FOR GOOD PRACTICES, we always should use curly braces.
        // if there will be more than one statement, curly braces are MUST
        // Since there are only one statement to print, curly braces are OPTIONAL

        if (day == 1) System.out.println("Monday");
        else if (day==2) System.out.println("Tuesday");
        else if (day==3) System.out.println("Wednesday");
        else if (day==4) System.out.println("Thursday");
        else if (day==5) System.out.println("Friday");
        else if (day==6) System.out.println("Saturday");
        else System.out.println("Sunday");




    }
}
