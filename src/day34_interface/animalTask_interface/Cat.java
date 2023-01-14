package day34_interface.animalTask_interface;

public class Cat extends Animal implements Playable {
    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }


    @Override
    public void eat() {
        System.out.println("Cat "+getName()+" is eating cat food.");
    }


    @Override
    public void play() {
        System.out.println("Cat plays with cotton balls");
    }
}
