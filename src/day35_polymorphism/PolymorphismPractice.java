package day35_polymorphism;

import day34_interface.animalTask_interface.*;
import day35_polymorphism.transportationTask.*;

public class PolymorphismPractice {
    public static void main(String[] args) {

        Tiger tiger = new Tiger ("Sher Khan", "Bengal",'M',5,"Large","Orange");

        tiger.eat();
        tiger.drink();
        tiger.sleep();
        tiger.hunt();


        Animal tiger2 = new Tiger ("Ms. Sher Khan", "Bengal",'M',5,"Large","Orange");

        tiger2.eat();
        tiger2.drink();
        tiger2.sleep();
       //  tiger2.hunt(); // since this hunt() is not referencing to Animal class, it will give en error

        // Not every single animal hunt so it does not in animal class, it is in Tiger class

        Animal animal = new Eagle("John", "American Eagle", 'M',3,"Small","BLack");

       // animal.fly(); //  unless we change the reference type from Animal to Eagle , it will give an error
        animal.eat();
        animal.drink();
        animal.sleep();

        Flyable obj1 = new Eagle("John", "American Eagle", 'M',3,"Small","BLack");
       // obj1.eat();
       // obj1.drink();
       // obj1.sleep();
        obj1.fly();  // with Flyable , only fly will NOt give an error
        System.out.println(obj1.canFly);


        Lion lion = null;
        Parrot parrot = null;
        Shark shark = null;
        Dolphin dolphin = null;
        Eagle eagle = null;
        Duck duck = null;
        Dog dog = null;
        Cat cat = null;
        CydeoCar cydeoCar = null;

        Flyable[] birds = {parrot,eagle, duck};
        Swimmable[] fishes = {dolphin,shark,duck};  // parror or eagle, since they do not have a is a relationship with any of those, it will not be accepted
        Playable[] friendlyAnimals = {dog, cat, duck};

        boolean isAnimal = dog instanceof Animal;
        // if we give it as : = cydeoCar instanceof Animal;
        // = dog instanceof Animal;// will not give an error

        System.out.println("----------------------------");

        Car car = new Tesla("Model Y","White", 2020,55000);
        boolean isTesla = car instanceof Tesla;
        boolean isAudi = car instanceof Audi;

        boolean isElectricCar= car instanceof Electric;
        boolean hasAutoPark = car instanceof AutoPark;
        boolean hasAutoPilot = car instanceof AutoPilot;

        System.out.println("isTesla = " + isTesla);
        System.out.println("isAudi = " + isAudi);
        System.out.println("isElectricCar = " + isElectricCar);
        System.out.println("hasAutoPark = " + hasAutoPark);
        System.out.println("hasAutoPilot = " + hasAutoPilot);
    }
}
