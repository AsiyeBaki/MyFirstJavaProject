package day29_OOP.AnimalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog();
       // dog.age = 3;
        dog.setInfo("Max", "Husky", "Large", "brown",'f',3);
        Cat cat = new Cat();
        cat.setInfo("Felicia", "stray", "small", "black", 'f', 6);
        Tiger tiger = new Tiger();
        tiger.setInfo("Shar Khan", "Bengal", "Large", "White", 'f',2);

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(tiger);

        System.out.println("---------------------");

        dog.eat();
        dog.sleep();
        dog.drink();

        cat.eat();
        cat.sleep();
        cat.drink();

        tiger.eat();
        tiger.sleep();
        tiger.drink();
        System.out.println("---------------------");
        dog.bark();
        cat.meow();
        cat.scratch();
       // cat.bark(); since bark object only for dog class, you will get an error

        System.out.println("---------------------------");

       // new Animal().  // the reason we have the methods here, at the moment we create it inheritance created implicitly
/*
        System.out.println(dog.name);
        System.out.println(dog.color);

        dog.gender = 'K';      // after we change from public to private, gives an compile error
        dog.age = -20;
        System.out.println(dog.age);


 */
        System.out.println(dog.getAge());
        System.out.println(dog.getSize());
        dog.setSize("large");


    }
}
