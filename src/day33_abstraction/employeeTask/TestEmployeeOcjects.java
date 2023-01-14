package day33_abstraction.employeeTask;

public class TestEmployeeOcjects {
    public static void main(String[] args) {

       //  Employee employee = new Employee("Daniel", 54, 'They', "A1", "SDET", 85000);
// We can not create objefcts from an abstract class, Object MUST be created from a concrete class.

        Teacher teacher = new Teacher("James", 45, 'M',"B123","Math Oerator", 75000);

        Developer developer = new Developer("Lucy", 30,'F',"C1","Developer", 100000, "Java");

        Driver driver = new Driver("Emily", 45, 'M', "K1","Truck Driver", 70000);
        Tester tester = new Tester ("AAron", 35, 'F', "E1","Manuel  Tester", 70000);

        System.out.println(teacher);
        System.out.println(developer);
        System.out.println(tester);
        System.out.println(driver);
        System.out.println("--------------");

        teacher.work();
        developer.work();
        tester.work();
        driver.work();

    }
}
