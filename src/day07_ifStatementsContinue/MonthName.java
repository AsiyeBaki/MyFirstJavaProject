package day07_ifStatementsContinue;

public class MonthName {
    public static void main(String[] args) {

        int m = 11;
        String month = " ";

        if (m >= 1 && m <= 12) {

            if (m == 1) {
                month = "January";
            } else if (m == 2) {
                month = "February";
            } else if (m == 3) {
                month = "March";
            } else if (m == 4) {
                month = "April";
            } else if (m == 5) {
                month = "May";
            } else if (m == 6) {
                month = "June";
            } else if (m == 7) {
                month = "July";
            } else if (m == 8) {
                month = "August";
            } else if (m == 9) {
                month = "September";
            } else if (m == 10) {
                month = "October";
            } else if (m == 11) {
                month = "November";
            } else {
                month = "December";
            }

        } else {
            System.out.println("NO such a month");
        }


    }
}
