package ExtraTopics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Generics <T> { // applying generics to the class, you need to select the type when you create the object
    // methods should be instance

    public  <T> void printEach(T[] t){
        for(T each : t ){
            System.out.println(each);
        }
    }

    public  <T> void printEach(List<T> list){
        for (T each :list) {
            System.out.println(each);
        }
    }

    public static void main(String[] args) {


        Integer[] numbers = {10,20,30,40,50};
        Double[] decimals = {1.5,2.5,3.5,4.5};
        Character[] characters = {'A','B','C','D','E'};
        String[] strings = {"Java","Python","SQL","Wooden Spoon"};


        System.out.println("----------integers--------------");
     //   Generics.printEach(numbers);
        System.out.println("----------decimals--------------");
      //  Generics.printEach(decimals);
        System.out.println("----------characters--------------");
      //  Generics.printEach(characters);
        System.out.println("----------words--------------");
      //  Generics.printEach(strings);

        System.out.println("------- arrays ------------ ");

        List<Double> list = new ArrayList<>();
        list.addAll(Arrays.asList(10.5,20.5,30.5));

       // Generics.printEach(list);

        Generics<Integer> obj = new Generics<>();
        obj.printEach(numbers);
        obj.printEach(list);

        Generics<Double> obj2 = new Generics<>();
        obj2.printEach(numbers);
        obj2.printEach(decimals);
    }
}
