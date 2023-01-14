package day28_OOP_customClass.encapsulation;

public class TestEmployeeObject {
    public static void main(String[] args) {
/*
        Employee employee1 = new Employee();
      //  employee1.salary = -200000;

        employee1.setSalary(200000);

        System.out.println(employee1.getSalary());

       // employee1.setName("     ");
        System.out.println(employee1.getName());


        employee1.setJobTitle("SDET");
        System.out.println(employee1.getJobTitle());


 */
        Employee employee2 = new Employee("Bebishhhh", 45,"java", 200000);
        System.out.println(employee2);

    }
}
