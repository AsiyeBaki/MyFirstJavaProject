package ExtraTopics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_terminalOperations {
    public static void main(String[] args) {

        System.out.println("--------- collect() --------"); // it will return you a new resull
        List<String> words = new ArrayList<>();
        words.addAll(Arrays.asList(
                "Java", "a", "B", "C", "Jenkins", "G", "F", "T", "S"
        ));
        words = words.stream().filter(a -> a.startsWith("J")).collect(Collectors.toList());
        System.out.println("words = " + words);

        System.out.println("--------- toArray() --------");
        int[] numbers = {1, 2, 4, 7, 13, 23, 56, 7, 89, 45, 76};
        int[] result = Arrays.stream(numbers).filter(p -> p % 2 == 0).toArray();
        System.out.println(Arrays.toString(result));

        System.out.println("--------- count() --------"); // returns long, returns you total number of the elements or frequency pr specified element
        long n = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).count(); // = stream instance
        System.out.println("n = " + n);

        String[] arrayWords = {"Java", "Python", "Java", "C#", "Java", "Java", "C++"};
        long m = Arrays.stream(arrayWords).filter(p -> p.equals("Java")).count();
        System.out.println("m = " + m);

        System.out.println("--------- reduce() --------");
        // used for combining all the elements and return it as a SINGLE value
        // it will return you a single value

        int[] arr = {1, 2, 3, 4, 5};
        int sum = Arrays.stream(arr).reduce(0, (a, b) -> a + b);
        System.out.println("sum = " + sum); // it will return integer

        String[] str = {"Java", "Python", "Java", "C#", "Java", "Java", "C++"};
        String s = Arrays.stream(str).reduce("", (x, y) -> x + " " + y);
        System.out.println("s = " + s);

        System.out.println("--------- forEach() --------");

        // similar to peek() , returns you stream result
        // forEach() returns you operational result

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        list.stream().filter(p -> p > 5).forEach(p -> System.out.println(p));


        System.out.println("--------- anyMatch() --------");// checks if all elements matching with the confition, which is les then 5 , returns false since there are element bigger than 5
        int[] num1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        boolean num1_b = Arrays.stream(num1).allMatch(p -> p > 5);
        System.out.println("num_1 = " + num1_b);//false

        System.out.println("--------- nonMatch() --------");// it will return true if there is any odd numbe
        int[] num2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        boolean num2_b = Arrays.stream(num2).anyMatch(p->p%2!=0);
        System.out.println("num2_b = " + num2_b); // true


        System.out.println("--------- allMatch() --------"); // check if none of the elements greater than 10 , since there is no element greater than 10, it will return true
        int[] num3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        boolean num3_b = Arrays.stream(num3).noneMatch(p->p>10);
        System.out.println("num3_b = " + num3_b);// true


    }
}
