package day22_arrayList;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);  // 0 // ArrayList's size will be increase automatically
        list.add(20);  // 1
        list.add(30);  // 2
        list.add(10);  // 3
        // list.add(2.2); has to be same data type

        list.add(1, 15);  // when we assign 15 to index 1 other elements will shift to the right
        System.out.println(list);

        list.add(2, 25);
        System.out.println(list);

        System.out.println("-----------------------------------");

        // get method
        ArrayList<String> studentList = new ArrayList<>();

        studentList.add("Mohammemd");
        studentList.add("Asiye");
        studentList.add("Abidullah");
        studentList.add("Tatiana");

        System.out.println(studentList.size());
        System.out.println(studentList);

        String firstStudent = studentList.get(0);
        String lastStudent = studentList.get(studentList.size() - 1);

        System.out.println("firstStudent = " + firstStudent);
        System.out.println("lastStudent = " + lastStudent);


    }
}
