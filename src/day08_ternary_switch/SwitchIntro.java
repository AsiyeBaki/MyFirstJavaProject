package day08_ternary_switch;

public class SwitchIntro {
    public static void main(String[] args) {

        char grade = 'C';   // since it is char, needs to be used such 'A' 'B' ...

        switch (grade) {

            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Great");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Passed");
                break;
            case 'F':
                System.out.println("Failed");
                break;
            default:
                System.out.println("Invalid");
                break;
        }







    }
}



       /*

        // No curly braces for case blocks, even in case of more than 1 statements.
        // All the case block statements are optional including break.
        // Blank case is perfectly legal code.
        // Default block can appear anywhere in the code. It should not be the last one.


       switch (expression) {
            case constant1:
                statements;
                break;

            case constant2:
                statements;
                break;

            default:
                statements;
                break;




        */
                  /*
        A: Excellent
        B: Great
        C: Good
        D: Passed
        F: Failed
         */
        /*
        String result = "";

        if (grade == 'A') {
            result = "Excellent";
        } else if (grade == 'B') {
            result = "Great Job";
        } else if (grade == 'C') {
            result = "Good";
        } else if (grade == 'D') {
            result = "Passed";
        } else {
            result = "Failed";
        }

        System.out.println(result);
        System.out.println("---------------------");

                */

