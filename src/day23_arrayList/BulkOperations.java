package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);


        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.addAll(1,numbers);

        System.out.println(list1);  //  [1, 10, 20, 30, 40, 2, 3]    after we add elements in numbers to indec 1, other elements shifted to the right

        System.out.println("------------------");

        ArrayList<Integer> scores = new ArrayList<>();

        scores.addAll(Arrays.asList(75,85,95,80,70));
        System.out.println("scores = " + scores);

        scores.addAll(Arrays.asList(100,65));
        scores.addAll(2, Arrays.asList(10,20));
        System.out.println("scores = " + scores);

        System.out.println("---------------------------");

        ArrayList<String> students = new ArrayList<>();

        students.addAll(Arrays.asList("Gadir", "Hasan", "Abidullah","Bilal"));

        System.out.println(students);

        students.addAll(2, Arrays.asList("Shukur", "Sumeye", "Tatiana"));

        System.out.println(students);

        System.out.println("-----------------------------------------------------");

        Integer[] nums = {1,2,3,4,5,6,7,8};  // this is the converted of an array to a wrapper class, it has to be non primitive

        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(nums)); // we can add it in the constructor OR

       //   l1.addAll(Arrays.asList(nums) );  // after we make sure array is non primitive/ converted to wrapper class, we can use addAll method

        System.out.println("l1 = " + l1);

        System.out.println("-----------------------------------------------");

        ArrayList<String> employeeList = new ArrayList<>();
        employeeList.addAll(Arrays.asList("Alena","Muhtar", "Gadir", "Ali"));

        System.out.println("employeeList = " + employeeList);

        boolean hasAlena = employeeList.contains("Alena");
        System.out.println("hasAlena = " + hasAlena);  // true

        boolean hasAlenaGadir = employeeList.containsAll(Arrays.asList("Alena","Gadir"));// when you pass this elements, order does not matter
        System.out.println("hasAlenaGadir = " + hasAlenaGadir);  //true

        boolean hasMuhtarAliKuzzat = employeeList.contains(Arrays.asList("Muhtar", "Ali", "Kuzzat"));
        System.out.println("hasMuhtarAliKuzzat = " + hasMuhtarAliKuzzat);   // false


        System.out.println("-------------------------------------");

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(10,10,20,30,40,50,60,70,10,10,10,10,20,20,20,20,20));

        // list.remove(10); // this will remove only first 10

        list.removeAll(Arrays.asList(10,20));
        System.out.println("list = " + list);  // 10s and 20s will be removed

        System.out.println("---------------------------------");

        ArrayList<String> developers = new ArrayList<>();
        developers.addAll(Arrays.asList("Alena", "Muhtar","Gadir", "Ali","Khashayar","Madiyar", "Muhtar","Muhtar","Alena"));

        developers.retainAll(Arrays.asList("Alena","Khashayar","Muhtar"));

        System.out.println("developers = " + developers);
        System.out.println("-----------------------------------");

        ArrayList<String> groceries = new ArrayList<>();
        groceries.addAll(Arrays.asList("Eggs","Potato","Milk","Tomato", "Rice","Orange", "Strawberry","Blueberry","Paper Towels"));

        groceries.retainAll(Arrays.asList("Eggs","Potato","Milk","Tomato")); // this will keep these items and remove the others
        System.out.println("groceries = " + groceries);

        // OR
        // groceries.removeAll(Arrays.asList("Rice","Orange", "Strawberry","Blueberry","Paper Towels")); // this will remove these items
        // System.out.println("groceries = " + groceries);
    }

}
