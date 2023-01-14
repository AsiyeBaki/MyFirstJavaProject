package day24_dateAndTime;

import java.util.Arrays;
import java.util.Collections;

public class Important_FrequencyOfCharacters {


    public static void main(String[] args) {

        String str = "aaabbbbccccc";

        String result = "";    //a3b4c5

        for (String each : str.split("")) {
    //                                          since array is not a collection, to be able to with collection methods we use as list method in Array class
            int frequency = Collections.frequency(Arrays.asList(str.split("")), each );

            if(!result.contains(each)) {
                result+= each + frequency;
            }
        }
        System.out.println("result = " + result);







    }
}
