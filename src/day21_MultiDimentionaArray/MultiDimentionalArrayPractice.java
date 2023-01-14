package day21_MultiDimentionaArray;


import java.util.Arrays;

public class MultiDimentionalArrayPractice {
    public static void main(String[] args) {
        String[] group1 = {"Halit", "Tugba", "Nicholas", "Alex"}; // 4 names
        String[] group2 = {"Asiye", "Slater", "Maya"}; // 3 names
        String[] group3 = {"Kubra", "Busra", "Nedime", "Nazife", "Nazire"}; // 5 names
        String[] group4 = {"Onur", "Tugce"}; // 2 names


        String[][] groups = {group1, group2, group3, group4};

        for (int i = 0; i < groups.length; i++) {
            String[] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));

            for (int j = 0; j < eachGroup.length; j++) {
                String eachStudent = eachGroup[j];
                System.out.println(eachStudent);
            }

            }
        System.out.println("-----------------------------------");

        for (int i = groups.length - 1; i >= 0; i--) {
            String[] eachGroup = groups[i];

            for (int j = eachGroup.length - 1; j >= 0; j--) {
                String eachStudent = eachGroup[j];
                System.out.println(eachStudent);
            }
        }

        System.out.println("--------------------------");
        System.out.println(groups); // you will get hashcode
        System.out.println(Arrays.toString(groups)); //still hashcode // since toString() method --> for single dimentional arrays ONLY
        System.out.println(Arrays.deepToString(groups));




        }
}
