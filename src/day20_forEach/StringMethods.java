package day20_forEach;

import utilities.ArraysUtility;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String str = "Cydeo School";

        char[] ch = str.replace(" ", "").toCharArray();

        System.out.println(Arrays.toString(ch));

        System.out.println("------------------------------------");

        String str2 = "Today is a great day to learn java";

        String[] words = str2.split(" "); // if you split with "great" you will have 2 pieces

        System.out.println(Arrays.toString(words));  // [Today, is, a, great, day, to, learn, java]

        System.out.println("---------------");

        String sentence = "I love you";
        // "Java love I"

        String[] array = ArraysUtility.reverse(sentence.split(" "));  /// [I love Java]

        System.out.println(Arrays.toString(array));

        String reversedSentence = "";

        for (int i = 0; i < array.length; i++) {
            reversedSentence += array[i] + " ";
        }

        System.out.println(reversedSentence);

    }
}
