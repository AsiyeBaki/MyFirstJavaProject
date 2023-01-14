package day26_statics;

import day26_statics.StudentTask.Student;
import day26_statics.StudentTask.StudentsGroup;

import java.util.Arrays;


public class TestObjects {
    public static void main(String[] args) {

        Student student1 = new Student("Yusuf", 21, 'M', "A16");
        Student student2 = new Student("Glenio", 24, 'M', "B34");
        Student student3 = new Student("Sumeyye", 22, 'F', "C56");
        Student student4 = new Student("Mehmet", 25, 'M', "D43");
        Student student5 = new Student("Sebastian", 23, 'M', "E27");

        Student[] students = {student2, student3, student4, student5};


        StudentsGroup group1 = new StudentsGroup("Java Turtles",  1);
        System.out.println(Arrays.toString(students));

        group1.addStudent(student1);  // first way to add, as we created an action in StudentsGroup
        System.err.println(group1); // 1 student

        group1.addStudent(students); // second way to add, as we created an action in StudentsGroup
        System.err.println(group1); // 5 student

        group1.addStudent("Khashayar", 34, 'M', "F35");  // third way to add, as we created an action in StudentsGroup
        System.err.println(group1);



        group1.removeStudent("D43");
        group1.removeStudent("E27");

        System.out.println(group1);


        for (Student each : group1.students) {
            System.out.println(each.name +" : " + each.id);
        }

        System.out.println("------------------------------------------");

        StudentsGroup group2 = new StudentsGroup("Java Snakes",  2);

        StudentsGroup group3 = new StudentsGroup("Java Dogs",  3);

        StudentsGroup group4 = new StudentsGroup("Java Cats",  4);

        StudentsGroup[] groups = {group1, group2, group3, group4};
        System.err.println(Arrays.toString(groups));


    }
}
