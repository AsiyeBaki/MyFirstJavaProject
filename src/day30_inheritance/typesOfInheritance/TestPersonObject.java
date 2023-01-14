package day30_inheritance.typesOfInheritance;

import java.time.LocalDate;

public class TestPersonObject {

    public static void main(String[] args) {

        Student student = new Student("Lucy", 'F', LocalDate.of(1991, 3, 3), 'A', "A123");

        President president = new President("Daniel", 'M', LocalDate.of(1990, 12, 1), LocalDate.of(2021, 12, 12));

        Teacher teacher = new Teacher("Emily", 'F', LocalDate.of(1985, 11, 1), "Math Teacher", "T123", 20000.0);


        System.out.println(student);
        System.out.println(president);
        System.out.println(teacher);

        student.study();
        teacher.teach();
        president.lie();

        student.eat("Baklava");
        teacher.eat("Kebab");
        president.eat("Donut");

        student.drink("Milk");
        teacher.drink("Water");
        president.drink("Whisky");


    }
}
