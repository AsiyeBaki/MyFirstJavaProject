package day28_OOP_customClass.encapsulation;

public class Test {
    public static void main(String[] args) {

        Student student = new Student();
        // student.age = -200;
        // System.out.println( student.age );

       // student.setAge(43);
        student.setAge(25);
        System.out.println(student.getAge());
        System.out.println("Test Completed");


       //  student.name = "Aaron"; // gives an error since it is private
       // student.setName("Aaron");
       // student.setName("Aaron123");
        System.out.println(student.getName());

    }

}
