package ExtraTopics;

import java.util.function.BiConsumer;

public class TestBiConsumer {

    public static void main(String[] args) {

        BiConsumer<String,Integer> printMultipleTimes = (a,b) -> {
            for(int i = 0; i < b; i++){
                System.out.println(a);
            }
        };

        printMultipleTimes.accept("Hello Dunyali",13); // it will print Asiye 5 times
    }
}
