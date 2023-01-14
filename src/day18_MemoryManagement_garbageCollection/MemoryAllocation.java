package day18_MemoryManagement_garbageCollection;

import day17_customClass.Employee;


public class MemoryAllocation {
    public static void main(String[] args) {

        int a = 100; // stack

        Car car = new Car(); // --> this is a Car object default will be 0
        //stack    //heap
        System.out.println("------------------------------");
        Employee employee1 = new Employee();
        Employee employee2 = employee1;

        employee1.setInfo("Rehane",30,'F',"Java Developer",95000,"A12");

        System.out.println(employee1);
        System.out.println(employee2);

        System.out.println("--------------------------------");

        String batch1 = new String ("Java");
        String batch2 = batch1;
        String batch3 = batch1;
    }

    public static void method() {

        int b = 200; // stack
    }

    public static void method2() {
        String c = "Hello World";  // c will be allocated in stack, "Hello World"" will be allocated inside String pool in the heap
        String d = new String ("Hello World"); // d in stack, Hello world will be allocated in Heap outside of the String pool
    }



}
