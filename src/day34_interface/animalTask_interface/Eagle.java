package day34_interface.animalTask_interface;

public class Eagle extends Animal implements Flyable {
    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }
    @Override
    public void eat() {
        System.out.println("Eagle "+getName()+" is eating snake.");
    }

    @Override
    public void fly() {

    }
}
