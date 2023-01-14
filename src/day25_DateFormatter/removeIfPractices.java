package day25_DateFormatter;


import day17_customClass.Dog;
import java.util.ArrayList;
import java.util.Arrays;

public class removeIfPractices {
    public static void main(String[] args) {

        /*
        1. Give the following array of dogs
            Dog[] dogs = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
            dogs[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
            dogs[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
            dogs[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
            dogs[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
            dogs[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
            dogs[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");

            Note: Dog class is imported from package day17
         */


        Dog[] dogs = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
        dogs[0].setDogInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
        dogs[1].setDogInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
        dogs[2].setDogInfo("Molly", "Beagle", 'F', 5, "Small", "White");
        dogs[3].setDogInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
        dogs[4].setDogInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
        dogs[5].setDogInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");

        ArrayList<Dog> smallDogs = new ArrayList<>(Arrays.asList(dogs));

        smallDogs.removeIf(p -> !p.size.equalsIgnoreCase("small"));  // solution without using loop
         /*for (Dog eachDog : dogs) {
            if(eachDog.size.equalsIgnoreCase("small")){
                smallDogs.add(eachDog);
            }
        }

         */ // solution with using a loop
        System.out.println(smallDogs);


        ArrayList<Dog> youngDogs = new ArrayList<>(Arrays.asList(dogs));
        /*
        for (Dog dog : dogs) {
            if(dog.age<=4){
                youngDogs.add(dog);
            }
        }

         */ // solution with using a loop


        youngDogs.removeIf(p -> p.age > 4);
        System.out.println(youngDogs);

        ArrayList<Dog> femaleDogs = new ArrayList<>(Arrays.asList(dogs));
        femaleDogs.removeIf(p->p.gender=='M');
        System.out.println("femaleDogs = " + femaleDogs);


        ArrayList<Dog> maleDogs = new ArrayList<>(Arrays.asList(dogs));
        maleDogs.removeIf(p-> p.gender=='F');
        System.out.println("maleDogs = " + maleDogs);

        System.out.println("----------------------------");

        Dog[] dogs2 = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
        dogs2[0].setDogInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
        dogs2[1].setDogInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
        dogs2[2].setDogInfo("Molly", "Beagle", 'F', 5, "Small", "White");
        dogs2[3].setDogInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
        dogs2[4].setDogInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
        dogs2[5].setDogInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");

        ArrayList<Dog> list = new ArrayList<>(Arrays.asList(dogs2));

        list.removeIf(p-> p.size.equalsIgnoreCase("small"));

        dogs2 = list.toArray(new Dog[list.size()]);



        System.out.println(Arrays.toString(dogs2));

    }
}
