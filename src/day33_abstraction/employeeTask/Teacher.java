package day33_abstraction.employeeTask;

public class Teacher extends Employee {

    public Teacher(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() { // before we create this method , you will get an error to extends line
        System.out.println(getName() + " is teaching.");
    } // it is a MUST to call for child class to override this method






}


