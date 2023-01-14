package ExtraTopics;

import java.util.function.Consumer;

public class TestConsumer {

    // Represent a function which takes one argument (any object ) and does not return a value.
    // consumer DOES NOT return any value ,  even tough it takes one object , void

    public static void main(String[] args) {

        Consumer<int[]> printEach = arr->{
            for (int each : arr)
            System.out.println(each);
        };
        int[] arr = {10,20,30,40,50};

        printEach.accept(arr);


    }
}
