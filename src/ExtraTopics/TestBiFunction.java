package ExtraTopics;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class TestBiFunction {
    public static void main(String[] args) {


        BiFunction<int[] , int[], List<Integer>> mergedTwoArrays = (a,b) -> {
            List<Integer> list = new ArrayList<>();
            for (int each :a) {
                list.add(each);
            }

            for (int each : b) {
                list.add(each);
            }
            return list;
        };

        int[] arr1 = {5,7,9,11};
        int[] arr2 = {100,200,300};
        List<Integer> result = mergedTwoArrays.apply(arr1,arr2);

    }
}
