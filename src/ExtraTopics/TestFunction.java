package ExtraTopics;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class TestFunction {
    public static void main(String[] args) {

        // RETURNS a value (any object )
        // Represents a function which takes one argument (aby object) and return a value (any object)
        //  a  is for array , argument that will be given should be array

        // this function takes int[] and returns it as List Integer
        Function<int[], List<Integer>> arrayToList = a -> {
            List<Integer> result = new ArrayList<>();
            for (int each : a){
                result.add(each);
            }
            return result;
        };

        int[] nums = {10,20,30,40,50};

        List<Integer> list = arrayToList.apply(nums);
        System.out.println(list); // [10, 20, 30, 40, 50]

    }
}
