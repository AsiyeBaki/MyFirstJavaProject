package day33_abstraction.cydeoStudentTask;

import day32_abstract.personTask.Person;

import java.time.LocalDate;

public class CydeoDevStudents extends Person {


    private final String id;  // since final does not have a default value , we need to assign a value
    private String batchName;
    private int batchNumber;
    public static final String programmingLanguage;



    public CydeoDevStudents(String name, char gender, LocalDate dateOfBirth, String id, String batchName, int batchNumber) {
        super(name, gender, dateOfBirth);
        if (getAge() <= 18) {  // if is set to less than 18
            System.err.println("Cydeo Developer student must be at least 18 years old. ");
        }
        this.id = id; //make sure that you assign this, to not get an error in line  private final String id;
        setBatchName(batchName);
        setBatchNumber(batchNumber);
    }

    static {
        programmingLanguage = "Java";
    }

    public String getId() {
        return id;
    }
    public String getBatchName() {
        return batchName;
    }
    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }
    public int getBatchNumber() {
        return batchNumber;
    }
    public void setBatchNumber(int batchNumber) {
        if (batchNumber <= 0) {
            System.out.println("Invalid batch number: " + "\nBatch number can not set to negative");
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating " + programmingLanguage);
    }

    @Override
    public void drink(String drink) {
        System.out.println(getName() + " is drinking " + programmingLanguage);
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" does nor need to sleep ");
    }

 //   public void breath(){} // you will get an error since breath method is final in parent class Person

    @Override
    public String toString() {
        return "CydeoDevStudents{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", dateOfBirth=" + getDateOfBirth() +
                "id='" + id + '\'' +
                ", batchName='" + batchName + '\'' +
                ", batchNumber=" + batchNumber +
                '}';
    }

/*
    Create a sub class of Person (from day 32 package) named CydeoStudent
                Extra Variables:
                        id(final), batchName, batchNumber, programmingLanguage (static & final)

                Extra conditions:
                        1. Age has to be at least 18 years old
                        2. batchName can ONLY be set to Zero to Hero or Alumni Day
                        3. batchNumber can not be set to zero or negative

                Override the eat() & drink() methods and include the programmingLanguage variables
     */

}
