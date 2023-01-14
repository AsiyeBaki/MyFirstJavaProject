package day17_customClass;

public class Dog {

    // I want this dog to be blueprint for all the dog objects

    //instance variables
    public String name;  // instance variable
    public String breed;
    public String size;
    public char gender;
    public int age;
    public String color;

    public void setDogInfo (String name, String breed, char gender, int age, String size,  String color){
        this.name = name; // this keyword is used for calling the instance variable name
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.size = size;
        this.color = color;
    }

// instance methods

    public void eat() {
        System.out.println(name + " is eating dog food");
    }

    public void drink() {
        System.out.println(name + " is drinking water");
    }

// toString method
    public String toString() {
        // to avoid getting a has-codes when we print the class objects
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
