package day35_polymorphism;
import day31_MethodOverriding.shapeTask.Circle;
import day33_abstraction.employeeTask.*;
import day34_interface.animalTask_interface.*;
import day34_interface.car_warmpTask_interface.Audi;
import day34_interface.car_warmpTask_interface.Car;
import day34_interface.car_warmpTask_interface.Honda;
import day34_interface.car_warmpTask_interface.Tesla;

import java.util.Arrays;
import java.util.Objects;

public class PolymorphismIntro {
    public static void main(String[] args) {

        Dog dog = new Dog("Max", "Husky", 'M', 4, "Small", "white");
        Cat cat = new Cat("Boncuk", "Sarmal", 'F', 6, "Medium", "Black");
        Tiger tiger = null;
        Eagle eagle = null;
        Lion lion = null;
        Parrot parrot = null;
        Dolphin dolphin = null;
        Shark shark = null;
        Duck duck = null;


        Animal[] animals = {dog, cat, tiger, lion, eagle, parrot, dolphin, shark, duck};


        // Animal animal = new Tesla("Modekl Y", "Blue",2022, 60000);
        // since there is no is a relationship in between Tesla and animal It will give an error


        Animal animal = new Dog ("Maya", "LAbrador", 'F',3,"Large","Brown");

        animal.eat();
        animal.drink();
        animal.sleep();

       //  animal.play():
        // animal.bark();

        System.out.println("------------------------");

        String str = "Java";
        Integer n = 100;
        Boolean r = false;
        Double d = 10.5;
        Circle circle =  new Circle(4);
        Honda honda = new Honda( "Civic", "Black", 2005, 25000);
        Audi audi = new Audi("Q6","Silver", 2020,36000);
        Tesla tesla = new Tesla("Model Y", "Blue", 2022, 6000);        Teacher teacher = new Teacher("James", 45, 'M',"B123","Math Oerator", 75000);
        Developer developer = new Developer("Lucy", 30,'F',"C1","Developer", 100000, "Java");
        Driver driver = new Driver("Emily", 45, 'M', "K1","Truck Driver", 70000);
        Tester tester = new Tester ("AAron", 35, 'F', "E1","Manuel  Tester", 70000);

        Object[]objects = {str,n,r,d,circle,honda,audi,tesla,teacher,developer,driver,tester};
        System.out.println(Arrays.toString(objects));

        Employee [] employees = {teacher, developer,driver,tester};
        Employee obj = new Developer("Lucy", 30,'F',"C1","Developer", 100000, "Java");
        obj.work();
        System.out.println("-----------------");



    }
}
