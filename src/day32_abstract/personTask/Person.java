package day32_abstract.personTask;

import java.time.LocalDate;

public class Person {  // Person class can not be final since it will be a parent class


    private String name;
    private final char gender;
    private final int age;  //
    private final LocalDate dateOfBirth;
    public static final int numberOfHead;

    static {
        numberOfHead = 1;
    }

    public Person(String name, char gender, LocalDate dateOfBirth) {

        setName(name);
        if (!(gender == 'M' || gender == 'F')){
            System.err.println("Invalid gender: "+ gender);
            System.exit(1);
        }
        this.gender =  gender;
        this.dateOfBirth = dateOfBirth;
        this.age = LocalDate.now().getYear() - dateOfBirth.getYear();

    }


    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }
// if the instance variable is final, there is no way you can generate setter, only getter we can generate.

    public void eat(){
        System.out.println(name +" is eating");
    }

    public void drink(String drink) {
        System.out.println(name +" is drinking");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    public final void breath() {  // To make sure that this implementation will not change for any sub class
        System.out.println(name + " is breathing");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
/*

Variables:
     instance:  name, gender, age, dateOfBirth
     static:  numberOfHead

Methods:
     instance methods:    eat(food), drink(drink), sleep()
     static methods:      breath()



 */