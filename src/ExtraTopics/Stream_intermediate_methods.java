package ExtraTopics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_intermediate_methods {
    public static void main(String[] args) {

        // Collections source of Example
        System.out.println("   -------  as source: collection  for distinct() -------"); // removes the duplicates
        List<Integer> numbers1 = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 6, 7, 7, 8, 9));
        numbers1 = numbers1.stream().distinct().collect(Collectors.toList());
        System.out.println(numbers1);

        // Array source of Example
        System.out.println("----------as source: array for distinct()-----------------");// removes the duplicates
        int[] nums = {1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 6, 7, 7, 8, 9};
        nums = Arrays.stream(nums).distinct().toArray();
        System.out.println(Arrays.toString(nums));


        System.out.println(" ----- skip() method/function ---- "); // takes integer as amount of element that will be skipped, skips the elements
        List<Integer> numbers2 = new ArrayList<>();
        numbers2.addAll(Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90));
        System.out.println(numbers2);
        numbers2 = numbers2.stream().skip(5).collect(Collectors.toList());
        System.out.println(numbers2);// [60, 70, 80, 90]   // skips te first 5 elements


        System.out.println(" ----- limit() method/function ---- "); // limit the size, takes one integer argument, so it will be printed as first n element
        List<Integer> numbers3 = new ArrayList<>();
        numbers3.addAll(Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90));
        numbers3 = numbers3.stream().limit(5).collect(Collectors.toList());
        System.out.println(numbers3);// [10, 20, 30, 40, 50]  // prints first 5 elements since we limit the size to 5


        System.out.println(" ----- map() method/function ---- "); // you can apply different math functions
        List<Integer> numbers4 = new ArrayList<>();
        numbers4.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));    // a represents each element // collect() method collects them back to a new list
        numbers4 = numbers4.stream().map(a -> a * 10).collect(Collectors.toList());  // it will print each element multiple by 10
        System.out.println("numbers4 = " + numbers4);

        System.out.println("--- map() ---");
        List<Integer> numbers5 = new ArrayList<>();
        numbers5.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        numbers5 = numbers5.stream().map(a -> {
                    if (a % 2 == 0) {
                        return a * 3;
                    } else {
                        return a * 10;
                    }
                }
        ).collect(Collectors.toList());
        System.out.println("numbers5 = " + numbers5); // [10, 6, 30, 12, 50, 18, 70, 24, 90]

        System.out.println(" ---------- filter() -----------"); // used for filtering the elements
        List<Integer> numbers6 = new ArrayList<>();
        numbers6.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        numbers6 = numbers6.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());
        System.out.println("numbers6 = " + numbers6); // [2, 4, 6, 8]

        numbers6 = numbers6.stream().filter(a -> a % 2 == 0).map(a -> a * 10).collect(Collectors.toList());
        System.out.println(numbers6); // [20, 40, 60, 80]


        System.out.println(" ---------- sorted() -----------"); // it will sort the elements ONLY within stream distance, not in original Array/Collection
        List<Integer> numbers7 = new ArrayList<>();
        numbers7.addAll(Arrays.asList(6, 5, 4, 9, 3, 2, 8, 7, 1));

        numbers7 = numbers7.stream().sorted().collect(Collectors.toList()); // OR toArray
        System.out.println("numbers7 = " + numbers7); // numbers7 = [1, 2, 3, 4, 5, 6, 7, 8, 9]

        System.out.println(" ---------- peek() -----------");
        List<Integer> numbers8 = new ArrayList<>();
        numbers8.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)); //peek()

        numbers8.stream().filter(p -> p % 5 == 0);

        // p represents each element in original array, a represent each element in stream frame after filtering
        // numbers8 = numbers8.stream().filter(p -> p % 5 == 0).peek(a -> System.out.println(a)).collect(Collectors.toList());
        List<Integer> result = numbers8.stream().filter(p -> p % 5 == 0).peek(a -> System.out.println(a)).collect(Collectors.toList());

        // System.out.println("numbers8 = " + numbers8);
        System.out.println("result = " + result);






    }
}
