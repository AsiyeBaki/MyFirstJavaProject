package day23_arrayList;

import java.util.ArrayList;

public class RemoveDuplicates {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Vasyl"); // 0
        names.add("Vasyl"); // 1
        names.add("Sumeye"); //2
        names.add("Sumeye");
        names.add("Ali");
        names.add("Sumeye");

        System.out.println("names = " + names);
        ArrayList<String> nonDuplicate = new ArrayList<>();

        for (String each : names) {

            if(nonDuplicate.contains(each)){
                continue;
            }
            nonDuplicate.add(each);
        }

        names = nonDuplicate; // this is for the first names object to go to garbage collection, if we do not need it after we removed the duplicates

        System.out.println(names);

        System.out.println(nonDuplicate);


    }

}
