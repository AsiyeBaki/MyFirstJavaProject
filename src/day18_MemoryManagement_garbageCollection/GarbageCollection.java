package day18_MemoryManagement_garbageCollection;

import day17_customClass.Dog;

public class GarbageCollection {
    public static void main(String[] args) {

        String s1 = "Java";
        s1 = null; // "Java" will be eligible for garbage collection

        System.out.println(s1);
        // System.out.println(s1.toUpperCase());  // when it is null that means it is not an object. it is not exist

        // System.out.println(s1.replace(null, "Python")); // can not be called like that

        String a = "";
        String b = null;
        System.out.println("-----------------------------------");

        String str1 = "Python";  // is garbage now since we assigned
        str1 = "CYDEO";
        System.out.println(str1);

        System.out.println("------------------------------------");

        Dog dog1 = new Dog();
        dog1.setDogInfo("Bella", "Husky", 'M',5,"Medium","White" );


        Dog dog2 = new Dog();
        dog2.setDogInfo("Chuck","Bulldog", 'M',5,"Small","White");

        dog1 = null;










    }
}
