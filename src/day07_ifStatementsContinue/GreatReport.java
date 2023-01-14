package day07_ifStatementsContinue;

public class GreatReport {
    public static void main(String[] args) {

        int score = 95;   // 0 ~ 100
        String result = "";

        /*
        if (score >= 90 && score <= 100) {
            result = "Your grade is: A";
        } else if (score >= 80 && score < 90) {
            result = "Your grade is: B";
        } else if (score >= 70 && score < 80) {
            result = "Your grade is: C";
        } else if (score >= 60 && score < 70) {
            result = "Your grade is: D";
        } else {
            result = "Your grade is: F";
        }
        System.out.println(result);
        */


        // this is the shorter way of to do this.
        // it is not necessary to write down second part after && because
        // if already goes to second block that means score is not greater than 90

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
    }
}
