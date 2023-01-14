package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {

    public static void main(String[] args) {

       /* int[] array = {1, 2, 3, 4, 5};

        array[0] = 100;

        System.out.println(Arrays.toString(array));

        System.out.println("-------------------------------------------------");

        ArrayList<String> groceriesList = new ArrayList<>();
        groceriesList.add("Eggs");
        groceriesList.add("paper Towels");
        groceriesList.add("Apples");
        groceriesList.add("Cooking oil");

        System.out.println(groceriesList);

       // groceriesList[2] = "Oranges";
        groceriesList.set(2, "Oranges");

        System.out.println(groceriesList);

        groceriesList.add(2, "Chicken");

        System.out.println(groceriesList);

        groceriesList.remove(0);

        System.out.println(groceriesList);

        groceriesList.remove("paper Towels");

        System.out.println(groceriesList);


        System.out.println("-------------------------------------------------");


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10); // 0
        numbers.add(20); // 1
        numbers.add(30); // 2
        numbers.add(40); // 3
        numbers.add(50); // 4


        boolean r1 = numbers.remove( Integer.valueOf(10) );

        System.out.println(numbers);

        System.out.println(r1);

        numbers.clear();

        System.out.println(numbers);
        System.out.println(numbers.size());


        System.out.println("-------------------------------------------------");

        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl"); // 0
        names.add("Vasyl"); // 1
        names.add("Sumeye"); //2
        names.add("Sumeye");
        names.add("Ali");
        names.add("Sumeye");

        System.out.println(  names.indexOf("Vasyl") );
        System.out.println( names.lastIndexOf("Vasyl") );

        System.out.println( names.lastIndexOf("Sumeye") );


        boolean hasMuhtar = names.contains("Muhtar"); // false
        boolean hasAli = names.contains("Ali"); // true

        System.out.println("hasMuhtar = " + hasMuhtar);
        System.out.println("hasAli = " + hasAli);

        System.out.println("-------------------------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = list1;

        list1.add(10);

        System.out.println(list1);
        System.out.println(list2);

        System.out.println(list1 == list2);


        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();

        l1.add(10);
        l2.add(10);

        System.out.println(l1);
        System.out.println(l2);

        System.out.println(l1 == l2);

        System.out.println(l1.equals(l2));


        System.out.println("-------------------------------------------------");

        ArrayList<Integer> n1 = new ArrayList<>();
        n1.add(10);
        n1.add(20);
        n1.add(30);

        ArrayList<Integer> n2 = new ArrayList<>();
        n2.add(30);
        n2.add(10);
        n2.add(20);

        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);

        System.out.println(n1.equals(n2));


        System.out.println(n1.isEmpty());
        System.out.println(n2.isEmpty());

        n1.clear();
        n2.clear();

        System.out.println(n1.isEmpty());
        System.out.println(n2.isEmpty());


        */

        int[] array = {1,2,3,4,5};
        array[0]= 100;
        System.out.println(Arrays.toString(array));
        System.out.println("------------------------------------------------------");

        ArrayList<String> groceriesList = new ArrayList<>();
        groceriesList.add("Eggs");
        groceriesList.add("Paper Towel");
        groceriesList.add("Apples");
        groceriesList.add("Cooking oil");

       //  groceriesList[2] = "Oranges";
        System.out.println(groceriesList);

        groceriesList.set (2, "Oranges");  // Apples will replaced with oranges !!! this method will NOT increased the size
        System.out.println(groceriesList);

        groceriesList.add(2,"Chicken"); // this method it will increase the size by adding "Chichken" to index 2
        // other elements will shift to the right
        System.out.println(groceriesList);

        groceriesList.remove(0);
        System.out.println(groceriesList);

        groceriesList.remove("Paper Towel");
        System.out.println(groceriesList);

        System.out.println("------------------------------------------------");


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // numbers.remove(20);
        boolean r1 = numbers.remove(Integer.valueOf(20));
        System.out.println(numbers);
        System.out.println(r1);

        System.out.println("-----------------------");

        numbers.clear();
        System.out.println(numbers);
        System.out.println("Size is: " + numbers.size());


        System.out.println("------------------------");

        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl");
        names.add("Vasyl");
        names.add("Sumeye");
        names.add("Sumeye");
        names.add("Ali");
        names.add("Sumeye");

        System.out.println(names.indexOf("Vasyl"));

        System.out.println(names.lastIndexOf("Vasyl"));

        System.out.println(names.lastIndexOf("Sumeye"));

        boolean hasMuhtar = names.contains("Muhtar");
        System.out.println("hasMuhtar = " + hasMuhtar);  // false

        boolean hasAli = names.contains("Ali");
        System.out.println("hasAli = " + hasAli); // true

        System.out.println("---------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = list1;   // that means there is only one object created


        list1.add(10);

        System.out.println(list1); // [10]
        System.out.println(list2); // [10]

        System.out.println(list1==list2); // true, since they are same objects, 10 will be assign to both

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();

        l1.add(10);
        l2.add(10);
        System.out.println(l1); // [10]
        System.out.println(l2); // []
        System.out.println(l1==l2);  // false   ///  this compares if they are the same object,
        // it will return you false since there is 2 different objects, even though both have 10 in it
        System.out.println(l1.equals(l2)); // false  //  after we add 10 to l2 (l2.add(10);  , it will return true


        System.out.println("------------------------");

        ArrayList<Integer> n1 = new ArrayList<>();
        n1.add(10);
        n1.add(20);
        n1.add(30);

        ArrayList<Integer> n2 = new ArrayList<>();
        n2.add(30);
        n2.add(10);
        n2.add(20);

        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);

        System.out.println(n1.equals(n2)); // it will return false since they are not in the same order

        System.out.println(n1.isEmpty()); // false
        System.out.println(n2.isEmpty()); // false

        n1.clear();
        n2.clear();

        System.out.println(n1.isEmpty());  // true
        System.out.println(n2.isEmpty());  // true



    }
}
