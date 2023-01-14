package day24_dateAndTime;

import day17_customClass.Employee;

import java.util.ArrayList;
import java.util.Arrays;


public class RemoveElements {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();  // 0~9

        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));

        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 4) {
                list.remove(i);  // everything looks logiacl in here. although is not going to give us the right/expected result
                // the reason is since collections size is dynamic, it will change the size automatically, and so
                // so index numbers will be changed. 2 will not be removed flor this ex. So it will be skipped some numbers after each loop iteration in order to be refixed the size
                // for this task removeIf method is a correct method to be used
                /// we need iteable method with remove method. we did not learn yet
            }
        }
        System.out.println("list = " + list);


        System.out.println("--------------------------------------");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));

        list2.removeIf(p -> p < 4);
        System.out.println("list2 = " + list2);
        System.out.println("---------------------------------");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Java", "Phyton", "C#", "Java", "Ruby", "Java", "C"));

        names.removeIf(p -> p.startsWith("J") );

        System.out.println("names = " + names);

        System.out.println("-------------------------------------");


        ArrayList<Employee> employees = new ArrayList<>();

        employees.addAll(Arrays.asList(new Employee(), new Employee(), new Employee(), new Employee(), new Employee()));

        employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", 100000, "A01");
        employees.get(1).setInfo("Emily", 40, 'F', "SDET", 90000, "A02");
        employees.get(2).setInfo("Conor", 38, 'M', "Project Manager", 130000, "A03");
        employees.get(3).setInfo("Bella", 29, 'F', "Java Developer", 95000, "A04");
        employees.get(4).setInfo("Jimmy", 54, 'M', "Data Analyst", 105000, "A05");


        // p referencing of each Employee object
        employees.removeIf(p-> p.salary > 100000);

        System.out.println("employees = " + employees);
        for (Employee each : employees) {
            System.out.println("each.name = " + each.name);
        }



    }

}

/*
Write a program that can remove the elements that are less than 4, from an ArrayList of integer

            Ex:
                list = {1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7};

            output:
                [4, 5, 6, 7, 4, 5, 6, 7]
 */