package day29_OOP.AnimalTask;

public class Animal {
    private String name, breed, size, color;
    private char gender;
    private int age;
    private static boolean isAnimal;

    static {
        isAnimal = true;
    }

    public void setInfo(String name, String breed, String size, String color, char gender, int age) {
        setName(name);
        setBreed (breed);
        setSize(size);
        setColor(color);
        setGender(gender);
        setAge(age);
    }



    public void eat() {
        System.out.println(name + " is eating");
    }
    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    public void drink() {
        System.out.println(name + " is drinking");
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public static boolean isIsAnimal() {
        return isAnimal;
    }

    public static void setIsAnimal(boolean isAnimal) {
        Animal.isAnimal = isAnimal;
    }



    public String toString() {
        return getClass().getSimpleName()+"{" + // to name the child classes dynamically
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
