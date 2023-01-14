package day17_customClass;

public class TestDogObjects {
    public static void main(String[] args) {

        Dog dog1 = new Dog();

        dog1.name = "Maya";
        dog1.breed = "Labrador";
        dog1.gender = 'F';
        dog1.age = 3;
        dog1.size = "Large";
        dog1.color = "Brown";


        Dog dog2 = new Dog();
        dog2.name = "Loki";
        dog2.breed = "MudMan";
        dog2.gender = 'M';
        dog2.age = 4;
        dog2.size = "Small";
        dog2.color = "Black";


        Dog dog3 = new Dog();
        dog3.setDogInfo("Bella", "Husky", 'M',5,"Medium","White" );

        Dog dog4 = new Dog();
        dog4.setDogInfo("Findik", "Corgi",'F',1, "Small", "Black&White");



        dog1.eat();  //output: Maya is eating dog food(from Dog class)
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println(dog4);

        // without toString object output will be: day17_customClass.Dog@edf4efb hash code
        // we need toString object in Dog class to not have a has code error
        // if you do not create a toString method as an object, you will not be able to print it

        dog3.drink();

        dog2.eat();

    }
}
