package day08_ternary_switch;

public class SwitchStatementsIntro2 {
    public static void main(String[] args) {

        int number = 9;  // if number is integer case value should be the same type variable
        // when it is: int,  can not be 'A' or 'B' .. , has to be the same value

        String day = "";

        switch (number) {  // it is important to not forgetting to add breaks.
            // otherwise it will keep printing until the next break
            // and it will give logical errors

            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }





    }
}
