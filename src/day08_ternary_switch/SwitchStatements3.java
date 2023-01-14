package day08_ternary_switch;

public class SwitchStatements3 {
    public static void main(String[] args) {



        // long is not acceptable on switch

        int score = 20;
        String result = "";

        if (score >= 90) {   // false: if score < 90
            result = "A";
        } else if (score >= 80) {   // false:  if score < 80
            result = "B";
        } else if (score >= 70) {   // false:  if score < 70
            result = "C";
        } else if (score >= 60) {   // false: if score < 60
            result = "D";
        } else {         //  score <60
            result = "F";
        }
        System.out.println("Your grade is: " + result);


        int month = 15;
        String result1 = "";

        switch (month) {

            case 2:
                result1 = "28 days";
                break;

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                result1 = "30 days";
                break;

            case 4:
            case 6:
            case 9:
            case 11:

                result1 = "31 days";
                break;

            default:
                result1 = "Invalid Number";
        }


    }
}
