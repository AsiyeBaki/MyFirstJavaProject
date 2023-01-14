package day29_OOP.encapsulation;

public class Test_studentObjects {
    public static void main(String[] args) {

        Student student1 = new Student("Asiye", 31, 'F', 'A', "MIT");


        System.out.println("student1 = " + student1);
        student1.setSchoolName("Harvard");
        student1.setGrade('B');
        System.out.println("student1 = " + student1);









    }
}
