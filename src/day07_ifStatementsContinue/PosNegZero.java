package day07_ifStatementsContinue;

public class PosNegZero {
    public static void main(String[] args) {

        int number = 100;
        String result = "";

        if (number > 0) {
            result = "Positive";
        }
        if (number < 0) {
            result = "Negative";
        }
        if (number == 0) {
            result = "Zero";
        }

        System.out.println("--------------");


        int num = 20;
        String result2 = "";

        if (num > 0) {
            result2 = "Positive";
        } else if (num < 0) {
            result2 = "Negative";
        } else {
            result2 = "Zero";
        }




    }
}
