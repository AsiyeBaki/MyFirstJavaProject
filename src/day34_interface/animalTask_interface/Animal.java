package day34_interface.animalTask_interface;

public  class Animal {
    private String name, breed;
    private final char gender;
    private int age;
    private String size, color;

    public Animal(String name, String breed, char gender, int age, String size, String color) {
        setName(name);
        setBreed(breed);
        this.gender = gender;
        setAge(age);
        setSize(size);
        setColor(color);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public char getGender() {
        return gender;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void drink(){
        System.out.println(name+" is drinking water");
    }

    public void eat(){
        System.out.println(" is eating ");
    }

    public void sleep(){
        System.out.println(name +" sleeps 8 hours");
    }


    public String toString() {
        return getClass().getSimpleName() +"{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }


}
/*
Animal Task:

        interface Swimmable ();
                swim();

        interface Flyable :
                fly();

        interface WildAnimal :
                hunt();

        interface Playable :
                play();

        abstract Animal:
                eat();
                drink();

        Dog extends Animal, implements Playable, Swimmable
        Cat extends Animal, implements Playable
        Cow extends Animal, implements Playable
        Horse extends Animal, implements Playable,  Flyable
        Parrot extends Animal, implements Playable, Flyable
        Eagle extends Animal, implements WildAnimal
        Tiger extends Animal, implements WildAnimal
        Lion extends Animal, implements WildAnimal
        Falcon extends Animal, implements WildAnimal ,Flyable
        Shark extends Animal, implements WildAnimal, Swimmable
        Dolphin extends Animal, implements Playable, Swimmable
        Duck extends Animal implements Playable, Swimmable, Flayable , WildAnimal





 */