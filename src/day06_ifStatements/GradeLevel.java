package day06_ifStatements;

public class GradeLevel {
    public static void main(String[] args) {

        int gradeLevel = 6;

        String result = "";


        if (gradeLevel <= 5){    // becomes false: if gradeLevel >= 6
            result = "Elementary School";
        } else if (gradeLevel <= 8){  // becomes false: if gradeLevel >= 9
            result = "Middle School";
        } else if (gradeLevel <= 12) {   // becomes false:  if gradeLevel >= 13
            result = "High School";
        } else if (gradeLevel <= 16) {   // becomes false: if gradeLevel >= 17
            result = "College";
        } else {                    //becomes false: if gradeLevel >=
            result = "Grad School";
        }

        System.out.println(result);

        /* int gradeLevel = 11;

        if(gradeLevel >= 1 && gradeLevel <= 5){
            System.out.println("Elementary School");
        }
        if(gradeLevel >= 6 && gradeLevel <= 8){
            System.out.println("Middle School");
        }
        if(gradeLevel >= 9 && gradeLevel <= 12){
            System.out.println("High School");
        }
        if(gradeLevel >= 13 && gradeLevel <= 16){
            System.out.println("College");
        }
        if(gradeLevel >= 17 && gradeLevel <= 18){
            System.out.println("Grad School");
        }
         */

    }
}
