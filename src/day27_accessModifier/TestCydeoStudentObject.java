package day27_accessModifier;

public class TestCydeoStudentObject {
    public static void main(String[] args) {



        CydeoStudent student1 = new CydeoStudent("Ekaterina", 29,'F');
        CydeoStudent student2 = new CydeoStudent("Muhtar", 26,'m');

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(CydeoStudent.schoolName);
        System.out.println(student2.schoolName); // you are not supposed to call static variable thru object name, it is not legal way.
        // supposed to be called thru class name. that'22s why intellij is not giving the short cut when you try to call it through object name



    }
}
