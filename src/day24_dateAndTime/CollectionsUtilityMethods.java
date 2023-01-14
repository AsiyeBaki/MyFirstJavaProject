package day24_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtilityMethods {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Java", "Java", "Java", "C#", "C#", "Ruby", "Swift", "Swift", "Java"));

        System.out.println("names = " + names);
/*
        for (int i = 0; i < names.size(); i++) {
            if(names.get(i).equals("Java")){
                names.set(i,"Python");
            }
        }
        // first way is replaceAll method, easier, loop is a better approach if you are wishing the case sensitivity, or you may create your own method
 */
        Collections.replaceAll(names, "Java", "Python");
        System.out.println("names = " + names);


        System.out.println("----------------------------------------------------------");

        // Frequency method

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(10, 20, 20, 30, 40, 40, 50, 50, 50, 50, 50, 60, 60, 50, 50, 50));

        Collections.frequency(list, 50);
        // since it will give us an integer result we can assign it to an int variable

        int count = Collections.frequency(list,50);
        System.out.println("count = " + count);
        System.out.println("------------------------------------------");


        ArrayList<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("Java", "Java", "Java", "C#", "C#", "Ruby", "Swift", "Swift", "Java"));

        int countJava = Collections.frequency(words, "Java");
        System.out.println("countJava = " + countJava);
        System.out.println("_----------------------------------------------------");


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10, 20, 20, 30, 40, 40, 50, 50, 50, 50, 50, 60, 60, 50, 50, 50));

        for (Integer each : numbers) {
            if(Collections.frequency(numbers, each) == 1) {
                System.out.println("Unique numbers: " + each); // 10 30   --- > frequency==1 so unique numbers
            }
        }


    }
}
