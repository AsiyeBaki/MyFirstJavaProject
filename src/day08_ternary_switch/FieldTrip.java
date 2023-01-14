package day08_ternary_switch;

public class FieldTrip {
    public static void main(String[] args) {

        int grade = 3;

        String location = "Unknown";
        int numberOfGroups = 0;
        String teacherInCharge = "Unknown";

        if (grade >= 1 && grade <= 6) {

            if (grade == 1) {
                location = "Apple Orchard";
                numberOfGroups = 3;
                teacherInCharge = "Ms. Smith";
            } else if (grade == 2) {
                location = "Zoo";
                numberOfGroups = 7;
                teacherInCharge = "Mr. Lee";
            } else if (grade == 3) {
                location = "Aquarium";
                numberOfGroups = 5;
                teacherInCharge = "Ms. Wilson";
            } else if (grade == 4) {
                location = "Movie Theatre";
                numberOfGroups = 2;
                teacherInCharge = "Ms. Reyes";
            } else if (grade == 5) {
                location = "Museum";
                numberOfGroups = 5;
                teacherInCharge = "Ms.Lela";
            } else {
                location = "Six Flags";
                numberOfGroups = 8;
                teacherInCharge = "Mr. Watt";
            }
        } else {
            location = "Unknown";
            numberOfGroups = 0;
            teacherInCharge = "Unknown";
        }

        System.out.println(location);
        System.out.println(numberOfGroups);
        System.out.println(teacherInCharge);


    }
}
