package day34_interface.animalTask_interface;

public class Dog extends Animal implements Playable {

    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Dog "+getName()+" is eating cat food.");
    }

    @Override
    public void play() {
        System.out.println("Dog is playing with dog toys.");
    }


    public void bark(){
        System.out.println(getName() + " is barking");
    }



}
