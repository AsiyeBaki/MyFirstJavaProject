package day17_customClass;

public class Employee {

    public String name;
    public int age;
    public char gender;
    public String jobTitle;
    public double salary; // if we do it static versus instance, all employees will have the same salary
    public String id;

// right click -> generate -> constructor will set the info for you. for now we use setinfo instead to have it as void
// if you do not do void , we MUST return a value

    public void setInfo (String name, int age, char gender, String jobTitle, double salary, String id) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.id = id;
    }  // sets all the attributes of the employee object at once


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", id='" + id + '\'' +
                '}';
    } // to avoid getting has code


    public void work(){
        System.out.println(name + " is working");
    }
}
