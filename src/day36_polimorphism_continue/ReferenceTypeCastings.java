package day36_polimorphism_continue;

import day29_OOP.AnimalTask.Animal;
import day29_OOP.AnimalTask.Cat;
import day29_OOP.AnimalTask.Dog;
import day30_inheritance.phoneTask.IPhone;
import day30_inheritance.phoneTask.Nokia;
import day30_inheritance.phoneTask.Phone;
import day33_abstraction.employeeTask.*;
import day35_polymorphism.transportationTask.AutoPilot;
import day35_polymorphism.transportationTask.Electric;
import day35_polymorphism.transportationTask.Tesla;

public class ReferenceTypeCastings {
    public static void main(String[] args) {

        // Dog dog = new Dog();

       // Cat cat = new Dog();

        Animal animal = (Animal) new Dog();  // implicit casting  , upcasting

        System.out.println("========= animal dog objects ===========================");

        Animal animal1 =  new Dog();  // upcsting polymorphism
        animal1.setInfo("Max","Husky","Large","White",'M',4);

        animal1.eat();
        animal1.drink();
        animal1.sleep();

        // animal1.bark(); // since not all animal can bark it does not allow you to call it. we need to down-casting to be able to call bark method
        ((Dog)animal1).bark(); // down-casting , now we can call bark method , this is for one time use since we did not assign it
        //  Dog dog1 = (Dog)animal1; //down-casting , this down-casting we can use multiple times since we assigned it an object
        //   dog1.bark();

      //  ((Cat)animal1).scratch();  // down-casting // we get ClassCastException: error since there is no IS A relationship between dog and cat
        // since animal1 is referencing to Dog object, so we're actually trying to convert dog to a cat , that's why it is giving ClassCastException

        System.out.println("---------- phones -------------------------------");

        Phone phone = new Nokia("XR20", "Small", "Black",350);

        phone.call(911);
        phone.text(123456);
        // phone.selfDefense(); // object is nokia, reference type is phone ||||  since we do not have this method in reference type we can not call it

        ((Nokia) phone).selfDefense();

        //((IPhone)phone).faceTime(123456);  // there must a IS A relationship otherwise we can not do cast it. it will give classCastException


        System.out.println("----------- employee tester developer.. objects------------");

        Employee employee = new Developer("Lucy", 30,'F',"C1","Developer", 100000, "Java");

        employee.work();
        ((Developer)employee).getProgrammingLanguage();

         // Tester tester = (Tester)employee; // it will give an ClassCastException error , since there is no IS A relationship between tester and developer

        System.out.println("-------------- electric tesla objects -------------");

        Electric electric = new Tesla("Model Y", "Blue",2020,55000);

        electric.charge();
        ((Tesla)electric).selfDrive();

        ((AutoPilot)electric).selfDrive();

        System.out.println("-------------------------------------------------------------");

        Employee employee1 = new Teacher("James", 45,  'M', "B1", "Math Teacher", 75000);

        Employee employee2 = new Developer("Lucy", 30, 'F', "C1", "Java Developer", 95000, "Java");

        Employee employee3 = new Driver("Aaron", 48, 'M', "D1", "Truck Driver", 90000);

        Employee employee4 = new Tester("Emily", 35, 'F', "E1", "Manual Tester", 80000);

        employee1.work();
        employee2.work();
        employee3.work();
        employee4.work();
        // since it is overridden it will give different implementations.

        // When I call this work method for the first time ?
        // Which one is deciding which implementation should be executed ? Who makes that decision? reference type or object type.
        //Answer is object type .






    }
}
