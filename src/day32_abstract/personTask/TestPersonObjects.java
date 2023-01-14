package day32_abstract.personTask;

import java.time.LocalDate;

public class TestPersonObjects {
    public static void main(String[] args) {

        Person person = new Person("Asiye ", 'F', LocalDate.of(1991,10,17));

        System.out.println(person);

        person.getGender();
        person.setName("Fatma");
        person.breath();

        System.out.println("------------------------");

        Employee employee = new Employee("Emily", 'F', LocalDate.of(1989, 1, 2), "Accountant", 80000);

        System.out.println(employee);
        employee.breath();
    }

}
