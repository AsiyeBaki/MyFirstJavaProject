package day07_ifStatementsContinue;

public class GradeLevel {
    public static void main(String[] args) {

        int gradeLevel = 19;
        String result = " ";

        if (gradeLevel >= 1 && gradeLevel <= 5) {
            result = "Elementary School";
        } else if (gradeLevel >= 6 && gradeLevel <= 8) {
            result = "Middle School";
        } else if (gradeLevel >= 9 && gradeLevel <= 12) {
            result = "High School";
        } else if (gradeLevel >= 13 && gradeLevel <= 16) {
            result = "College";
        } else if (gradeLevel >= 17 && gradeLevel <= 18) {
            result = "Grad School";
        } else {
            result = "No School";
        }

        System.out.println(gradeLevel);
        System.out.println(result);
    }
}
