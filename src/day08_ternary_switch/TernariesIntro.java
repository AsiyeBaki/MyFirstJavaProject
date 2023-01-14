package day08_ternary_switch;

public class TernariesIntro {
    public static void main(String[] args) {

        int score = 45;

        String result = "";

        if (score >= 60) {
            result = "Passed";
        } else {
            result = "Failed";
        }

        System.out.println(result);

        System.out.println("-------------------------");

        //  if--->  ?    else--->  :

        String result2 = (score >= 60) ? "Passed" : "Failed";

        System.out.println(result2);

        System.out.println("-------------------------");

        int age = 34;

        /*
        String result3 = "";
        if (age >= 21){
            result3 = "eligible";
        } else {
            result3 = "not eligible";
        }
         */

        // OR

        String result3 = (age>=21) ? "Eligible" : "Not Eligible";
        System.out.println(result3);

    }
}
