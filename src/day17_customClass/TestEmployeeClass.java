package day17_customClass;

public class TestEmployeeClass {
    public static void main(String[] args) {
// creating objects
        Employee employee1 = new Employee();
        employee1.setInfo("John Null", 45, 'M', "Manager", 150000, "SW123");

        Employee employee2 = new Employee();
        employee2.setInfo("Asiye Baki", 31, 'F', "SDET", 140000, "AS123");

        Employee employee3 = new Employee();
        employee3.setInfo("Richard Lee", 29, 'F', "Manager", 120000, "TB123");

        employee2.age =39;
        employee3.name = "Lucy";
        employee3.gender = 'F';

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

        employee3.work();

    }
}

