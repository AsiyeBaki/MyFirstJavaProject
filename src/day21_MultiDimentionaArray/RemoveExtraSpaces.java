package day21_MultiDimentionaArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoveExtraSpaces {
    public static void main(String[] args) {

        String str = "  Hello world      I       love      Java     ";

        String [] words = str.split(" ");

        System.out.println(Arrays.toString(words));

        str = "";

        for (String each : words) {
            if (!each.isEmpty()) {
                str += each + " ";
            }

        }
       //  str = str.trim();  // to remove the last space OR else in the print statement
        System.out.println(str.trim());




    }
}
